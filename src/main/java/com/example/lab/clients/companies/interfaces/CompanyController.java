package com.example.lab.clients.companies.interfaces;

import com.example.lab.clients.companies.impl.CompanyModel;
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
