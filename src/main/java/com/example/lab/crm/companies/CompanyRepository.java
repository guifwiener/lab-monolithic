package com.example.lab.crm.companies;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends MongoRepository<CompanyModel, Long> {

//    @Query(
//            value = "SELECT * FROM tb_company WHERE fantasy_name = ?1",
//            nativeQuery = true
//    )
//    Optional<CompanyModel> findByFantasyName(String fantasyName);

}
