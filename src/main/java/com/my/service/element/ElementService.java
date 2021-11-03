package com.my.service.element;

import com.my.dto.ElementDetailsDto;
import com.my.dto.ElementDto;
import com.my.dto.ElementToSaveDto;

import java.util.List;

public interface ElementService {

    /**
     * Returns detailed information of an element with the specified atomic number.
     *
     * @param atomicNumber - atomic number of an element
     * @return element with the specified atomic number
     */
    ElementDetailsDto findByAtomicNumber(int atomicNumber);

    /**
     * Returns list of elements. Could be filtered by optional fields group and period.
     *
     * @param group - optional parameter for filtering, element group
     * @param period - optional parameter for filtering, element period
     * @return list of elements
     */
    List<ElementDto> findAllByOptionalGroupAndPeriod(int group, int period);

    /**
     * Save each element in the list or updated if it already exists by atomic number.
     *
     * @param elementToSaveDtoList - elements list that should be saved or updated
     */
    void saveAll(List<ElementToSaveDto> elementToSaveDtoList);
}
