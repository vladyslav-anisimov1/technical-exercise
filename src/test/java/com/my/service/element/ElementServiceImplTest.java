package com.my.service.element;

import com.my.domain.Discoverer;
import com.my.domain.Element;
import com.my.dto.DiscovererDto;
import com.my.dto.ElementDetailsDto;
import com.my.dto.ElementDto;
import com.my.repository.ElementRepository;
import com.my.service.converter.ElementDomainToDetailsDtoConverter;
import com.my.service.converter.ElementDomainToDtoConverter;
import com.my.service.converter.ElementToSaveDtoToDomainConverter;
import com.my.service.exception.ObjectNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class ElementServiceImplTest {

    @Mock
    private ElementRepository elementRepository;

    @Mock
    private ElementDomainToDetailsDtoConverter elementDomainToDetailsDtoConverter;

    @Mock
    private ElementDomainToDtoConverter elementDomainToDtoConverter;

    @Mock
    private ElementToSaveDtoToDomainConverter elementToSaveDtoToDomainConverter;

    @InjectMocks
    private ElementServiceImpl elementService;

    @Test
    void getByAtomicNumberShouldThrowException() {
        Mockito.when(elementRepository.findByAtomicNumber(1)).thenReturn(Optional.empty());

        Assertions.assertThrows(ObjectNotFoundException.class, () -> elementService.findByAtomicNumber(1));
    }

    @Test
    void getByAtomicNumberSuccess() {
        Element element = getElement();
        ElementDetailsDto expected = getElementDetailsDto();
        Mockito.when(elementRepository.findByAtomicNumber(1)).thenReturn(Optional.of(element));
        Mockito.when(elementDomainToDetailsDtoConverter.convert(element)).thenReturn(expected);

        ElementDetailsDto actual = elementService.findByAtomicNumber(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getListSuccess() {
        List<Element> elements = List.of(getElement());
        List<ElementDto> expected = List.of(getElementDto());
        Mockito.when(elementRepository.findAllByOptionalGroupAndPeriod(0, 0)).thenReturn(elements);
        Mockito.when(elementDomainToDtoConverter.convert(elements)).thenReturn(expected);

        List<ElementDto> actual = elementService.findAllByOptionalGroupAndPeriod(0, 0);

        Assertions.assertEquals(expected, actual);
    }

    private Element getElement() {
        Discoverer discoverer = new Discoverer();
        discoverer.setId(1L);
        discoverer.setName("Test discoverer");

        Element element = new Element();
        element.setId(1L);
        element.setName("Test element");
        element.setAtomicNumber(1);
        element.setElementGroup(2);
        element.setPeriod(3);
        element.setAtomicSymbol("T");
        element.addDiscoverer(discoverer);

        return element;
    }

    private ElementDetailsDto getElementDetailsDto() {
        DiscovererDto discoverer = new DiscovererDto();
        discoverer.setId(1L);
        discoverer.setName("Test discoverer");

        ElementDetailsDto element = new ElementDetailsDto();
        element.setId(1L);
        element.setName("Test element");
        element.setAtomicNumber(1);
        element.setGroup(2);
        element.setPeriod(3);
        element.setAtomicSymbol("T");
        element.setDiscoverers(List.of(discoverer));

        return element;
    }

    private ElementDto getElementDto() {
        ElementDto elementDto = new ElementDto();
        elementDto.setId(1L);
        elementDto.setName("Test element");
        elementDto.setAtomicNumber(1);

        return elementDto;
    }
}