package com.example.lab.clients.companies.impl;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_company", schema = "databaseschema")
public class CompanyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "fantasy_name")
    private String fantasyName;
    @Column(name = "legal_name")
    private String legalName;
    @Column(name = "document_number")
    private String documentNumber;
    @Column(name = "headquarter_state")
    private String headquarterState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasy_name) {
        this.fantasyName = fantasy_name;
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
