package com.example.lab.companies.interfaces;

import com.example.lab.companies.impl.CompanyModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CompanyController {

    public ResponseEntity<List<CompanyModel>> getCompanies();

    public ResponseEntity<CompanyModel> getCompanyById();

    public ResponseEntity<CompanyModel> getCompanyByFantasyName();

    public CompanyModel createCompany();

    public CompanyModel updateCompany();

    public ResponseEntity<String> deleteCompany();

}
