package com.example.lab.clients.impl;

import com.example.lab.clients.interfaces.ClientRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ClientRepositoryImpl extends ClientRepository {

    @Query(
            value = "SELECT * FROM TB_CLIENT WHERE document_number = ?1",
            nativeQuery = true
    )
    Optional<ClientModel> findByDocumentNumber(String documentNumber);

}
