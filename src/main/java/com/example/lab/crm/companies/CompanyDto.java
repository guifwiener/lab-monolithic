package com.example.lab.crm.companies;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CompanyDto {

    @NotBlank(message = "Fantasy name cannot be empty")
    private String fantasyName;
    @NotBlank(message = "Legal name cannot be empty")
    private String legalName;
    private String documentNumber;
    private String headquarterState;

}
