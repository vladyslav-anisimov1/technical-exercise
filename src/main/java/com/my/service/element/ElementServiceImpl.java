package com.my.service.element;

import com.my.domain.Element;
import com.my.dto.ElementDetailsDto;
import com.my.dto.ElementDto;
import com.my.dto.ElementToSaveDto;
import com.my.repository.ElementRepository;
import com.my.service.converter.ElementDomainToDetailsDtoConverter;
import com.my.service.converter.ElementDomainToDtoConverter;
import com.my.service.converter.ElementToSaveDtoToDomainConverter;
import com.my.service.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ElementServiceImpl implements ElementService {

    private final ElementRepository elementRepository;
    private final ElementDomainToDetailsDtoConverter elementDomainToDetailsDtoConverter;
    private final ElementDomainToDtoConverter elementDomainToDtoConverter;
    private final ElementToSaveDtoToDomainConverter elementToSaveDtoToDomainConverter;

    public ElementServiceImpl(ElementRepository elementRepository,
                              ElementDomainToDetailsDtoConverter elementDomainToDetailsDtoConverter,
                              ElementDomainToDtoConverter elementDomainToDtoConverter,
                              ElementToSaveDtoToDomainConverter elementToSaveDtoToDomainConverter) {
        this.elementRepository = elementRepository;
        this.elementDomainToDetailsDtoConverter = elementDomainToDetailsDtoConverter;
        this.elementDomainToDtoConverter = elementDomainToDtoConverter;
        this.elementToSaveDtoToDomainConverter = elementToSaveDtoToDomainConverter;
    }


    @Override
    @Transactional(readOnly = true)
    public List<ElementDto> findAllByOptionalGroupAndPeriod(int group, int period) {
        List<Element> elements = elementRepository.findAllByOptionalGroupAndPeriod(group, period);

        return elementDomainToDtoConverter.convert(elements);
    }

    @Override
    @Transactional(readOnly = true)
    public ElementDetailsDto findByAtomicNumber(int atomicNumber) {
        Element element = elementRepository.findByAtomicNumber(atomicNumber)
                .orElseThrow(() -> new ObjectNotFoundException(String.format("Element with atomic number %s not found", atomicNumber)));

        return elementDomainToDetailsDtoConverter.convert(element);
    }

    @Override
    @Transactional
    public void saveAll(List<ElementToSaveDto> elementToSaveDtoList) {
        elementToSaveDtoList.forEach(elementToSaveDto -> {
            Optional<Element> element = elementRepository.findByAtomicNumber(elementToSaveDto.getAtomicNumber());
            Element elementToSave;

            if (element.isPresent()) {
                elementToSave = element.get();

                elementToSaveDtoToDomainConverter.convert(elementToSaveDto, elementToSave);
            } else {
                elementToSave = elementToSaveDtoToDomainConverter.convert(elementToSaveDto);
            }

            elementRepository.save(elementToSave);
        });
    }
}
