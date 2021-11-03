package com.my.service.converter;

import com.my.core.converter.AbstractConverter;
import com.my.domain.Element;
import com.my.dto.ElementDto;
import org.springframework.stereotype.Component;

@Component
public class ElementDomainToDtoConverter extends AbstractConverter<Element, ElementDto> {

    @Override
    protected ElementDto generateTarget() {
        return new ElementDto();
    }

    @Override
    public void convert(Element source, ElementDto target) {
        target.setId(source.getId());
        target.setName(source.getName());
        target.setAtomicNumber(source.getAtomicNumber());
    }
}
