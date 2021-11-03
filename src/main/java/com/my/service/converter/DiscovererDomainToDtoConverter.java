package com.my.service.converter;

import com.my.core.converter.AbstractConverter;
import com.my.dto.DiscovererDto;
import com.my.domain.Discoverer;
import org.springframework.stereotype.Component;

@Component
public class DiscovererDomainToDtoConverter extends AbstractConverter<Discoverer, DiscovererDto> {

    @Override
    protected DiscovererDto generateTarget() {
        return new DiscovererDto();
    }

    @Override
    public void convert(Discoverer source, DiscovererDto target) {
        target.setId(source.getId());
        target.setName(source.getName());
    }
}
