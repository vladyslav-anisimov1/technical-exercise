package com.my.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "elements")
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int atomicNumber;

    private int elementGroup;

    private int period;

    private String alternativeName;

    private String atomicSymbol;

    private String appearance;

    @OneToMany(mappedBy = "element", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Discoverer> discoverers = new ArrayList<>();

    private String discoveryYear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public int getElementGroup() {
        return elementGroup;
    }

    public void setElementGroup(int group) {
        this.elementGroup = group;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getAlternativeName() {
        return alternativeName;
    }

    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
    }

    public String getAtomicSymbol() {
        return atomicSymbol;
    }

    public void setAtomicSymbol(String atomicSymbol) {
        this.atomicSymbol = atomicSymbol;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public List<Discoverer> getDiscoverers() {
        return discoverers;
    }

    public void addDiscoverer(Discoverer discoverer) {
        discoverer.setElement(this);
        this.discoverers.add(discoverer);
    }

    public void clearDiscoverers() {
        discoverers.forEach(discoverer -> discoverer.setElement(null));
        this.discoverers.clear();
    }

    public String getDiscoveryYear() {
        return discoveryYear;
    }

    public void setDiscoveryYear(String discoveryYear) {
        this.discoveryYear = discoveryYear;
    }
}
