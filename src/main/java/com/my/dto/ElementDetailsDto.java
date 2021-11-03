package com.my.dto;

import java.util.List;

public class ElementDetailsDto {

    private Long id;

    private String name;

    private int atomicNumber;

    private int group;

    private int period;

    private String alternativeName;

    private String atomicSymbol;

    private String appearance;

    private List<DiscovererDto> discoverers;

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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
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

    public List<DiscovererDto> getDiscoverers() {
        return discoverers;
    }

    public void setDiscoverers(List<DiscovererDto> discoverers) {
        this.discoverers = discoverers;
    }

    public String getDiscoveryYear() {
        return discoveryYear;
    }

    public void setDiscoveryYear(String discoveryYear) {
        this.discoveryYear = discoveryYear;
    }
}
