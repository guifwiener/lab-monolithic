package com.example.lab.crm.companies.impl;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Builder
@Data
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

}
