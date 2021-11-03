package com.my.controller;

import com.my.dto.ElementDetailsDto;
import com.my.dto.ElementDto;
import com.my.dto.ElementToSaveDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.my.service.element.ElementService;

import java.util.List;

@RestController
@RequestMapping("/elements")
public class ElementController {

    private final ElementService elementService;

    public ElementController(ElementService elementService) {
        this.elementService = elementService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ElementDto> findAllElements(@RequestParam(required = false, defaultValue = "0") int group,
                                            @RequestParam(required = false, defaultValue = "0") int period) {
        return elementService.findAllByOptionalGroupAndPeriod(group, period);
    }



    @GetMapping(value = "/{atomicNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ElementDetailsDto findElementByAtomicNumber(@PathVariable int atomicNumber) {
        return elementService.findByAtomicNumber(atomicNumber);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveElements(@RequestBody List<ElementToSaveDto> elementToSaveDtoList) {
        elementService.saveAll(elementToSaveDtoList);
    }


}
