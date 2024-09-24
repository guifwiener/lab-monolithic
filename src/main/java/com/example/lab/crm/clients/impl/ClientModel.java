package com.example.lab.crm.clients.impl;

import com.example.lab.crm.clients.enums.DocumentType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_client", schema = "databaseschema")
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    @Column(name = "company_id")
    private Long companyId;
    @Column(name = "document_type", columnDefinition = "VARCHAR")
    @Enumerated(EnumType.STRING)
    private DocumentType documentType;
    @Column(name = "document_number")
    private String documentNumber;

}
