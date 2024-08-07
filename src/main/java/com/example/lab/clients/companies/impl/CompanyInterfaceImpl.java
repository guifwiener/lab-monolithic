package com.example.lab.clients.companies.impl;

import com.example.lab.clients.companies.interfaces.CompanyRepository;

import java.util.Optional;

public interface CompanyInterfaceImpl extends CompanyRepository {

    Optional<CompanyModel> findByFantasyName(String fantasyName);

}
