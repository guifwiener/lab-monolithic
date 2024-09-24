package com.example.lab.crm.companies.impl;


import jakarta.validation.constraints.NotBlank;

public class CompanyDto {


    @NotBlank(message = "Fantasy name cannot be empty")
    private String fantasyName;
    @NotBlank(message = "Legal name cannot be empty")
    private String legalName;
    private String documentNumber;
    private String headquarterState;

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getHeadquarterState() {
        return headquarterState;
    }

    public void setHeadquarterState(String headquarterState) {
        this.headquarterState = headquarterState;
    }
}
