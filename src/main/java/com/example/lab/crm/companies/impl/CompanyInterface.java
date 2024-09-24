package com.example.lab.crm.companies.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyInterface extends JpaRepository<CompanyModel, Long> {

    Optional<CompanyModel> findByFantasyName(String fantasyName);

}
