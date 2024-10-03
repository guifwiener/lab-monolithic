package com.example.lab.crm.companies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public List<CompanyModel> getCompanies() {
        try {
            Optional<List<CompanyModel>> companies = Optional.of(companyRepository.findAll());
            return companies.get();
        } catch (Exception e) {
            throw e;
        }
    }

    public CompanyModel getCompanyById(Long id) {
        try {
            Optional<CompanyModel> company = companyRepository.findById(id);
            if (company.isEmpty()) {
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "company not found"
                );
            }
            return company.get();
        } catch (Exception e) {
            throw e;
        }

    }

//    public CompanyModel getCompanyByFantasyName(String fantasyName) {
//        try {
//            Optional<CompanyModel> company = companyRepository.findByFantasyName(fantasyName);
//            if (company.isEmpty()) {
//                throw new ResponseStatusException(
//                        HttpStatus.NOT_FOUND, "company not found"
//                );
//            }
//            return company.get();
//        } catch (Exception e) {
//            throw e;
//        }
//    }

    public CompanyModel createCompany(CompanyDto companyDto) {
        try {
            CompanyModel companyModel = CompanyMapper.convertDtoToModel(companyDto);
            CompanyModel company = companyRepository.save(companyModel);
            return company;
        } catch (Exception e) {
            throw e;
        }
    }

    public CompanyModel updateCompany(Long id, CompanyDto companyDto) {
        try {
            Optional<CompanyModel> companyQuery = companyRepository.findById(id);
            if(companyQuery.isEmpty()) {
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "company not found"
                );
            }
            CompanyModel newCompanyModel = CompanyMapper.convertDtoToModel(companyDto);
            newCompanyModel.setId(companyQuery.get().getId());
            CompanyModel company = companyRepository.save(newCompanyModel);
            return company;
        } catch (Exception e) {
            throw e;
        }
    }

    public void deleteCompany(Long id) {
        try {
            Optional<CompanyModel> companyQuery = companyRepository.findById(id);
            if(companyQuery.isEmpty()) {
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "company not found"
                );
            }
            companyRepository.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
