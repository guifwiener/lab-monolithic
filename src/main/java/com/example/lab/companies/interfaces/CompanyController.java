package com.example.lab.companies.interfaces;

import com.example.lab.companies.impl.CompanyDto;
import com.example.lab.companies.impl.CompanyModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CompanyController {

    public ResponseEntity<List<CompanyModel>> getCompanies();

    public ResponseEntity<CompanyModel> getCompanyById(Long id);

    public ResponseEntity<CompanyModel> getCompanyByFantasyName(String fantasyName);

    public ResponseEntity<CompanyModel> createCompany(CompanyDto companyDto);

    public ResponseEntity<CompanyModel> updateCompany(Long id, CompanyDto companyDto);

    public ResponseEntity<String> deleteCompany(Long id);

}
