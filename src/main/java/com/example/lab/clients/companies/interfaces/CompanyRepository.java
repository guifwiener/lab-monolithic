package com.example.lab.clients.companies.interfaces;

import com.example.lab.clients.companies.impl.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<CompanyModel, Long> {

    Optional<CompanyModel> findByFantasyName(String fantasyName);

}