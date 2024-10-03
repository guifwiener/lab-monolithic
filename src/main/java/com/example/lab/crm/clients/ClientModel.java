package com.example.lab.crm.clients;

import com.example.lab.crm.clients.enums.DocumentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name = "tb_client", schema = "databaseschema")
@Document(collection = "clients")
public class ClientModel {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @Column(name = "first_name")
    private String firstName;

//    @Column(name = "last_name")
    private String lastName;

    private String email;

//    @Column(name = "company_id")
    private Long companyId;

//    @Column(name = "document_type", columnDefinition = "VARCHAR")
//    @Enumerated(EnumType.STRING)
    private DocumentType documentType;

//    @Column(name = "document_number")
    private String documentNumber;

//    @Embedded
//    private Address address;

}
