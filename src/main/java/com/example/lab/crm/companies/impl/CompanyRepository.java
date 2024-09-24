package com.example.lab.crm.companies.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<CompanyModel, Long> {

    @Query(
            value = "SELECT * FROM tb_company WHERE fantasy_name = ?1",
            nativeQuery = true
    )
    Optional<CompanyModel> findByFantasyName(String fantasyName);

}
