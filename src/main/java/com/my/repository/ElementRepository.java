package com.my.repository;

import com.my.domain.Element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ElementRepository extends JpaRepository<Element, Long> {

    Optional<Element> findByAtomicNumber(int atomicNumber);

    @Query("FROM Element e " +
            "WHERE (:period = 0 OR e.period = :period) " +
            "AND (:group = 0 OR e.elementGroup = :group)")
    List<Element> findAllByOptionalGroupAndPeriod(@Param("group") int group,
                                                  @Param("period") int period);
}
