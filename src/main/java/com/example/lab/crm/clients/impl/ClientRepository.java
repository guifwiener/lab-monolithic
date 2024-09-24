package com.example.lab.crm.clients.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {

    @Query(
            value = "SELECT * FROM TB_CLIENT WHERE document_number = ?1",
            nativeQuery = true
    )
    Optional<ClientModel> findByDocumentNumber(String documentNumber);

}
