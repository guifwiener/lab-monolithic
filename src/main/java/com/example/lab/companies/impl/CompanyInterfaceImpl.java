package com.example.lab.companies.impl;

import com.example.lab.companies.interfaces.CompanyRepository;

import java.util.Optional;

public interface CompanyInterfaceImpl extends CompanyRepository {

    Optional<CompanyModel> findByFantasyName(String fantasyName);

}
