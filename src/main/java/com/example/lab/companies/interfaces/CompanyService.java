package com.example.lab.companies.interfaces;

import com.example.lab.companies.impl.CompanyDto;
import com.example.lab.companies.impl.CompanyModel;

import java.util.List;

public interface CompanyService {

    public List<CompanyModel> getCompanies();

    public CompanyModel getCompanyById(Long id);

    public CompanyModel getCompanyByFantasyName(String fantasyName);

    public CompanyModel createCompany(CompanyDto companyModel);

    public CompanyModel updateCompany(Long id, CompanyModel companyModel);

    CompanyModel updateCompany(Long id, CompanyDto companyDto);

    public void deleteCompany(Long id);

}
