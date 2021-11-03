package com.my.service.converter;

import com.my.core.converter.AbstractConverter;
import com.my.dto.ElementDetailsDto;
import com.my.domain.Element;
import org.springframework.stereotype.Component;

@Component
public class ElementDomainToDetailsDtoConverter extends AbstractConverter<Element, ElementDetailsDto> {

    private final DiscovererDomainToDtoConverter discovererDomainToDtoConverter;

    public ElementDomainToDetailsDtoConverter(DiscovererDomainToDtoConverter discovererDomainToDtoConverter) {
        this.discovererDomainToDtoConverter = discovererDomainToDtoConverter;
    }

    @Override
    protected ElementDetailsDto generateTarget() {
        return new ElementDetailsDto();
    }

    @Override
    public void convert(Element source, ElementDetailsDto target) {
        target.setId(source.getId());
        target.setName(source.getName());
        target.setAtomicNumber(source.getAtomicNumber());
        target.setGroup(source.getElementGroup());
        target.setPeriod(source.getPeriod());
        target.setAlternativeName(source.getAlternativeName());
        target.setAtomicSymbol(source.getAtomicSymbol());
        target.setAppearance(source.getAppearance());
        target.setDiscoverers(discovererDomainToDtoConverter.convert(source.getDiscoverers()));
        target.setDiscoveryYear(source.getDiscoveryYear());
    }
}
