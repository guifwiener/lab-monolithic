package com.example.lab.crm.clients;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<ClientModel, Long> {

//    @Query(
//            value = "SELECT * FROM TB_CLIENT WHERE document_number = ?1",
//            nativeQuery = true
//    )
//    Optional<ClientModel> findByDocumentNumber(String documentNumber);

}
