package com.example.lab.companies;

public class CompanyMapper {

    public static CompanyModel convertDtoToModel(CompanyDto companyDto) {

        CompanyModel companyModel = CompanyModel.builder()
                .fantasyName(companyDto.getFantasyName())
                .legalName(companyDto.getLegalName())
                .documentNumber(companyDto.getDocumentNumber())
                .headquarterState(companyDto.getHeadquarterState())
                .build();

        return companyModel;
    }

}
