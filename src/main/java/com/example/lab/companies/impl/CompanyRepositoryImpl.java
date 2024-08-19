package com.example.lab.companies.impl;

import com.example.lab.companies.interfaces.CompanyRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CompanyRepositoryImpl extends CompanyRepository {

    @Query(
            value = "SELECT * FROM tb_company WHERE fantasy_name = ?1",
            nativeQuery = true
    )
    Optional<CompanyModel> findByFantasyName(String fantasyName);

}
