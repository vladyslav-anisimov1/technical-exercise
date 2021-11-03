package com.my.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ElementToSaveDto {

    private String allotropes;

    @JsonAlias("alternative_name")
    private String alternativeName;

    @JsonAlias("alternative_names")
    private String alternativeNames;

    private String appearance;

    @JsonAlias("at_t_")
    private String atT;

    @JsonAlias("atomic_number")
    private int atomicNumber;

    @JsonAlias("atomic_radius")
    private String atomicRadius;

    @JsonAlias("atomic_weight")
    private String atomicWeight;

    @JsonAlias("band_gap")
    private String bandGap;

    @JsonAlias("boiling_point")
    private String boilingPoint;

    @JsonAlias("brinell_hardness")
    private String brinellHardness;

    @JsonAlias("bulk_modulus")
    private String bulkModulus;

    @JsonAlias("cas_number")
    private String casNumber;

    private String color;

    @JsonAlias("covalent_radius")
    private String covalentRadius;

    @JsonAlias("critical_point")
    private String criticalPoint;

    @JsonAlias("crystal_structure")
    private String crystalStructure;

    @JsonAlias("curie_point")
    private String curiePoint;

    @JsonAlias("density_at_stp")
    private String densityAtStp;

    @JsonAlias("density_near_rt")
    private String densityNearRt;

    @JsonAlias("density_when_liquid_at_mp")
    private String densityWhenLiquidAtMp;

    private String discovery;

    @JsonAlias("discovery_and_first_isolation")
    private String discoveryAndFirstIsolation;

    @JsonAlias("electrical_resistivity")
    private String electricalResistivity;

    @JsonAlias("electron_configuration")
    private String electronConfiguration;

    private String electronegativity;

    @JsonAlias("element_category")
    private String elementCategory;

    @JsonAlias("first_isolation")
    private String firstIsolation;

    @JsonAlias("group_block")
    private String groupBlock;

    @JsonAlias("heat_of_fusion")
    private String heatOfFusion;

    @JsonAlias("heat_of_vaporisation")
    private String heatOfVaporisation;

    @JsonAlias("heat_of_vaporization")
    private String heatOfVaporization;

    @JsonAlias("ionisation_energies")
    private String ionisationEnergies;

    @JsonAlias("ionization_energies")
    private String ionizationEnergies;

    private String iso;

    @JsonAlias("magnetic_ordering")
    private String magneticOrdering;

    @JsonAlias("melting_point")
    private String meltingPoint;

    @JsonAlias("mohs_hardness")
    private String mohsHardness;

    @JsonAlias("molar_heat_capacity")
    private String molarHeatCapacity;

    @JsonAlias("molar_volume")
    private String molarVolume;

    private String name;

    @JsonAlias("name_symbol")
    private String nameSymbol;

    @JsonAlias("named_by")
    private String namedBy;

    private String naming;

    private String number;

    @JsonAlias("oxidation_states")
    private String oxidationStates;

    @JsonAlias("p_(pa)")
    private String pPa;

    @JsonAlias("per_shell")
    private String perShell;

    private int period;

    private String phase;

    @JsonAlias("poisson_ratio")
    private String poissonRatio;

    private String prediction;

    private String pronunciation;

    @JsonAlias("proposed_formal_name")
    private String proposedFormalNme;

    @JsonAlias("recognised_as_an_element_by")
    private String recognisedAsAnElementBy;

    @JsonAlias("recognized_as_a_distinct_element_by")
    private String recognizedAsADistinctElementBy;

    @JsonAlias("recognized_as_a_unique_metal_by")
    private String recognizedAsAUniqueMetalBy;

    @JsonAlias("recognized_as_an_element_by")
    private String recognizedAsAnElementBy;

    @JsonAlias("shear_modulus")
    private String shearModulus;

    @JsonAlias("speed_of_sound")
    private String speedOfSound;

    @JsonAlias("speed_of_sound_thin_rod")
    private String speedOfSoundThinRod;

    @JsonAlias("sublimation_point")
    private String sublimationPoint;

    private String symbol;

    @JsonAlias("tensile_strength")
    private String tensileStrength;

    @JsonAlias("thermal_conductivity")
    private String thermalConductivity;

    @JsonAlias("thermal_diffusivity")
    private String thermalDiffusivity;

    @JsonAlias("thermal_expansion")
    private String thermalExpansion;

    @JsonAlias("triple_point")
    private String triplePoint;

    @JsonAlias("van_der_waals_radius")
    private String vanDerWaalsRadius;

    @JsonAlias("vickers_hardness")
    private String vickersHardness;

    @JsonAlias("when_liquid_at_bp")
    private String whenLiquidAtBp;

    @JsonAlias("when_liquid_at_mp")
    private String whenLiquidAtMp;

    @JsonAlias("youngs_modulus")
    private String youngsModulus;

    public String getAllotropes() {
        return allotropes;
    }

    public void setAllotropes(String allotropes) {
        this.allotropes = allotropes;
    }

    public String getAlternativeName() {
        return alternativeName;
    }

    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
    }

    public String getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(String alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getAtT() {
        return atT;
    }

    public void setAtT(String atT) {
        this.atT = atT;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getAtomicRadius() {
        return atomicRadius;
    }

    public void setAtomicRadius(String atomicRadius) {
        this.atomicRadius = atomicRadius;
    }

    public String getAtomicWeight() {
        return atomicWeight;
    }

    public void setAtomicWeight(String atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    public String getBandGap() {
        return bandGap;
    }

    public void setBandGap(String bandGap) {
        this.bandGap = bandGap;
    }

    public String getBoilingPoint() {
        return boilingPoint;
    }

    public void setBoilingPoint(String boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public String getBrinellHardness() {
        return brinellHardness;
    }

    public void setBrinellHardness(String brinellHardness) {
        this.brinellHardness = brinellHardness;
    }

    public String getBulkModulus() {
        return bulkModulus;
    }

    public void setBulkModulus(String bulkModulus) {
        this.bulkModulus = bulkModulus;
    }

    public String getCasNumber() {
        return casNumber;
    }

    public void setCasNumber(String casNumber) {
        this.casNumber = casNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCovalentRadius() {
        return covalentRadius;
    }

    public void setCovalentRadius(String covalentRadius) {
        this.covalentRadius = covalentRadius;
    }

    public String getCriticalPoint() {
        return criticalPoint;
    }

    public void setCriticalPoint(String criticalPoint) {
        this.criticalPoint = criticalPoint;
    }

    public String getCrystalStructure() {
        return crystalStructure;
    }

    public void setCrystalStructure(String crystalStructure) {
        this.crystalStructure = crystalStructure;
    }

    public String getCuriePoint() {
        return curiePoint;
    }

    public void setCuriePoint(String curiePoint) {
        this.curiePoint = curiePoint;
    }

    public String getDensityAtStp() {
        return densityAtStp;
    }

    public void setDensityAtStp(String densityAtStp) {
        this.densityAtStp = densityAtStp;
    }

    public String getDensityNearRt() {
        return densityNearRt;
    }

    public void setDensityNearRt(String densityNearRt) {
        this.densityNearRt = densityNearRt;
    }

    public String getDensityWhenLiquidAtMp() {
        return densityWhenLiquidAtMp;
    }

    public void setDensityWhenLiquidAtMp(String densityWhenLiquidAtMp) {
        this.densityWhenLiquidAtMp = densityWhenLiquidAtMp;
    }

    public String getDiscovery() {
        return discovery;
    }

    public void setDiscovery(String discovery) {
        this.discovery = discovery;
    }

    public String getDiscoveryAndFirstIsolation() {
        return discoveryAndFirstIsolation;
    }

    public void setDiscoveryAndFirstIsolation(String discoveryAndFirstIsolation) {
        this.discoveryAndFirstIsolation = discoveryAndFirstIsolation;
    }

    public String getElectricalResistivity() {
        return electricalResistivity;
    }

    public void setElectricalResistivity(String electricalResistivity) {
        this.electricalResistivity = electricalResistivity;
    }

    public String getElectronConfiguration() {
        return electronConfiguration;
    }

    public void setElectronConfiguration(String electronConfiguration) {
        this.electronConfiguration = electronConfiguration;
    }

    public String getElectronegativity() {
        return electronegativity;
    }

    public void setElectronegativity(String electronegativity) {
        this.electronegativity = electronegativity;
    }

    public String getElementCategory() {
        return elementCategory;
    }

    public void setElementCategory(String elementCategory) {
        this.elementCategory = elementCategory;
    }

    public String getFirstIsolation() {
        return firstIsolation;
    }

    public void setFirstIsolation(String firstIsolation) {
        this.firstIsolation = firstIsolation;
    }

    public String getGroupBlock() {
        return groupBlock;
    }

    public void setGroupBlock(String groupBlock) {
        this.groupBlock = groupBlock;
    }

    public String getHeatOfFusion() {
        return heatOfFusion;
    }

    public void setHeatOfFusion(String heatOfFusion) {
        this.heatOfFusion = heatOfFusion;
    }

    public String getHeatOfVaporisation() {
        return heatOfVaporisation;
    }

    public void setHeatOfVaporisation(String heatOfVaporisation) {
        this.heatOfVaporisation = heatOfVaporisation;
    }

    public String getHeatOfVaporization() {
        return heatOfVaporization;
    }

    public void setHeatOfVaporization(String heatOfVaporization) {
        this.heatOfVaporization = heatOfVaporization;
    }

    public String getIonisationEnergies() {
        return ionisationEnergies;
    }

    public void setIonisationEnergies(String ionisationEnergies) {
        this.ionisationEnergies = ionisationEnergies;
    }

    public String getIonizationEnergies() {
        return ionizationEnergies;
    }

    public void setIonizationEnergies(String ionizationEnergies) {
        this.ionizationEnergies = ionizationEnergies;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getMagneticOrdering() {
        return magneticOrdering;
    }

    public void setMagneticOrdering(String magneticOrdering) {
        this.magneticOrdering = magneticOrdering;
    }

    public String getMeltingPoint() {
        return meltingPoint;
    }

    public void setMeltingPoint(String meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    public String getMohsHardness() {
        return mohsHardness;
    }

    public void setMohsHardness(String mohsHardness) {
        this.mohsHardness = mohsHardness;
    }

    public String getMolarHeatCapacity() {
        return molarHeatCapacity;
    }

    public void setMolarHeatCapacity(String molarHeatCapacity) {
        this.molarHeatCapacity = molarHeatCapacity;
    }

    public String getMolarVolume() {
        return molarVolume;
    }

    public void setMolarVolume(String molarVolume) {
        this.molarVolume = molarVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameSymbol() {
        return nameSymbol;
    }

    public void setNameSymbol(String nameSymbol) {
        this.nameSymbol = nameSymbol;
    }

    public String getNamedBy() {
        return namedBy;
    }

    public void setNamedBy(String namedBy) {
        this.namedBy = namedBy;
    }

    public String getNaming() {
        return naming;
    }

    public void setNaming(String naming) {
        this.naming = naming;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOxidationStates() {
        return oxidationStates;
    }

    public void setOxidationStates(String oxidationStates) {
        this.oxidationStates = oxidationStates;
    }

    public String getpPa() {
        return pPa;
    }

    public void setpPa(String pPa) {
        this.pPa = pPa;
    }

    public String getPerShell() {
        return perShell;
    }

    public void setPerShell(String perShell) {
        this.perShell = perShell;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getPoissonRatio() {
        return poissonRatio;
    }

    public void setPoissonRatio(String poissonRatio) {
        this.poissonRatio = poissonRatio;
    }

    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getProposedFormalNme() {
        return proposedFormalNme;
    }

    public void setProposedFormalNme(String proposedFormalNme) {
        this.proposedFormalNme = proposedFormalNme;
    }

    public String getRecognisedAsAnElementBy() {
        return recognisedAsAnElementBy;
    }

    public void setRecognisedAsAnElementBy(String recognisedAsAnElementBy) {
        this.recognisedAsAnElementBy = recognisedAsAnElementBy;
    }

    public String getRecognizedAsADistinctElementBy() {
        return recognizedAsADistinctElementBy;
    }

    public void setRecognizedAsADistinctElementBy(String recognizedAsADistinctElementBy) {
        this.recognizedAsADistinctElementBy = recognizedAsADistinctElementBy;
    }

    public String getRecognizedAsAUniqueMetalBy() {
        return recognizedAsAUniqueMetalBy;
    }

    public void setRecognizedAsAUniqueMetalBy(String recognizedAsAUniqueMetalBy) {
        this.recognizedAsAUniqueMetalBy = recognizedAsAUniqueMetalBy;
    }

    public String getRecognizedAsAnElementBy() {
        return recognizedAsAnElementBy;
    }

    public void setRecognizedAsAnElementBy(String recognizedAsAnElementBy) {
        this.recognizedAsAnElementBy = recognizedAsAnElementBy;
    }

    public String getShearModulus() {
        return shearModulus;
    }

    public void setShearModulus(String shearModulus) {
        this.shearModulus = shearModulus;
    }

    public String getSpeedOfSound() {
        return speedOfSound;
    }

    public void setSpeedOfSound(String speedOfSound) {
        this.speedOfSound = speedOfSound;
    }

    public String getSpeedOfSoundThinRod() {
        return speedOfSoundThinRod;
    }

    public void setSpeedOfSoundThinRod(String speedOfSoundThinRod) {
        this.speedOfSoundThinRod = speedOfSoundThinRod;
    }

    public String getSublimationPoint() {
        return sublimationPoint;
    }

    public void setSublimationPoint(String sublimationPoint) {
        this.sublimationPoint = sublimationPoint;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTensileStrength() {
        return tensileStrength;
    }

    public void setTensileStrength(String tensileStrength) {
        this.tensileStrength = tensileStrength;
    }

    public String getThermalConductivity() {
        return thermalConductivity;
    }

    public void setThermalConductivity(String thermalConductivity) {
        this.thermalConductivity = thermalConductivity;
    }

    public String getThermalDiffusivity() {
        return thermalDiffusivity;
    }

    public void setThermalDiffusivity(String thermalDiffusivity) {
        this.thermalDiffusivity = thermalDiffusivity;
    }

    public String getThermalExpansion() {
        return thermalExpansion;
    }

    public void setThermalExpansion(String thermalExpansion) {
        this.thermalExpansion = thermalExpansion;
    }

    public String getTriplePoint() {
        return triplePoint;
    }

    public void setTriplePoint(String triplePoint) {
        this.triplePoint = triplePoint;
    }

    public String getVanDerWaalsRadius() {
        return vanDerWaalsRadius;
    }

    public void setVanDerWaalsRadius(String vanDerWaalsRadius) {
        this.vanDerWaalsRadius = vanDerWaalsRadius;
    }

    public String getVickersHardness() {
        return vickersHardness;
    }

    public void setVickersHardness(String vickersHardness) {
        this.vickersHardness = vickersHardness;
    }

    public String getWhenLiquidAtBp() {
        return whenLiquidAtBp;
    }

    public void setWhenLiquidAtBp(String whenLiquidAtBp) {
        this.whenLiquidAtBp = whenLiquidAtBp;
    }

    public String getWhenLiquidAtMp() {
        return whenLiquidAtMp;
    }

    public void setWhenLiquidAtMp(String whenLiquidAtMp) {
        this.whenLiquidAtMp = whenLiquidAtMp;
    }

    public String getYoungsModulus() {
        return youngsModulus;
    }

    public void setYoungsModulus(String youngsModulus) {
        this.youngsModulus = youngsModulus;
    }
}
