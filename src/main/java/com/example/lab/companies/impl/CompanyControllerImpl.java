package com.example.lab.companies.impl;


import com.example.lab.companies.interfaces.CompanyController;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyControllerImpl implements CompanyController {

    @Autowired
    CompanyServiceImpl companyService;

    @Override
    @GetMapping("/find")
    public ResponseEntity<List<CompanyModel>> getCompanies() {
        List<CompanyModel> companies = companyService.getCompanies();
        return ResponseEntity.ok().body(companies);
    }

    @Override
    @GetMapping("/find/{id}")
    public ResponseEntity<CompanyModel> getCompanyById(
        @PathVariable("id") Long id
    ) {
        CompanyModel company = companyService.getCompanyById(id);
        return ResponseEntity.ok().body(company);
    }

    @Override
    @GetMapping("/find/fantasyName/{fantasyName}")
    public ResponseEntity<CompanyModel> getCompanyByFantasyName(
            @PathVariable("fantasyName") String fantasyName
    ) {
        CompanyModel company = companyService.getCompanyByFantasyName(fantasyName);
        return ResponseEntity.ok().body(company);
    }

    @Override
    @PostMapping("/create")
    public ResponseEntity<CompanyModel> createCompany(
            @RequestBody @Valid CompanyDto companyDto
    ) {
        CompanyModel company = companyService.createCompany(companyDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(company);
    }

    @Override
    @PatchMapping("/update/{id}")
    public ResponseEntity<CompanyModel> updateCompany(
            @PathVariable("id") Long id,
            @RequestBody @Valid CompanyDto companyDto
    ) {
        CompanyModel company = companyService.updateCompany(id, companyDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(company);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCompany(
            @PathVariable("id") Long id
    ) {
        companyService.deleteCompany(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("company deleted");
    }
}
