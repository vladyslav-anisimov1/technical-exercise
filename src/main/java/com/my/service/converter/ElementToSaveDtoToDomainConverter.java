package com.my.service.converter;

import com.my.core.converter.AbstractConverter;
import com.my.domain.Discoverer;
import com.my.domain.Element;
import com.my.dto.ElementToSaveDto;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class ElementToSaveDtoToDomainConverter extends AbstractConverter<ElementToSaveDto, Element> {

    @Override
    protected Element generateTarget() {
        return new Element();
    }

    @Override
    public void convert(ElementToSaveDto source, Element target) {
        target.setName(source.getName());
        target.setAtomicNumber(source.getAtomicNumber());
        target.setElementGroup(getGroup(source));//update
        target.setPeriod(source.getPeriod());
        target.setAlternativeName(source.getAlternativeName());
        target.setAtomicSymbol(source.getSymbol());
        target.setAppearance(source.getAppearance());
        target.setDiscoveryYear(getDiscoveryYear(source));

        target.clearDiscoverers();
        getDiscovererList(source).forEach(target::addDiscoverer);

    }

    private int getGroup(ElementToSaveDto source) {
        String group = source.getGroupBlock().replaceAll("[^0-9]", "");
        return "".equals(group)
                ? 0
                : Integer.parseInt(group);
    }

    private String getDiscoveryYear(ElementToSaveDto source) {
        return source.getDiscovery().contains("(")
                ? source.getDiscovery().substring(source.getDiscovery().indexOf("(") + 1, source.getDiscovery().indexOf(")"))
                : "unknown";
    }

    private List<Discoverer> getDiscovererList(ElementToSaveDto source) {
        if ("n/a".equals(source.getDiscovery())) {
            return List.of();
        } else {
            String discoverers = source.getDiscovery().contains("(")
                    ? source.getDiscovery().substring(0, source.getDiscovery().indexOf("(") - 1)
                    : source.getDiscovery();

            return Arrays.stream(discoverers.split(", "))
                    .map(discovererName -> {
                        Discoverer discoverer = new Discoverer();
                        discoverer.setName(discovererName);

                        return discoverer;
                    })
                    .collect(toList());
        }
    }
}
