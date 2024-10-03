package com.example.lab.crm.companies;


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
//@Table(name = "tb_company", schema = "databaseschema")
@Document(collection = "companies")
public class CompanyModel {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @Column(name = "fantasy_name")
    private String fantasyName;
//    @Column(name = "legal_name")
    private String legalName;
//    @Column(name = "document_number")
    private String documentNumber;
//    @Column(name = "headquarter_state")
    private String headquarterState;

}
