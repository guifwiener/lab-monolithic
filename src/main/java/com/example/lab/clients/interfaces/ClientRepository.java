package com.example.lab.clients.interfaces;

import com.example.lab.clients.impl.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {

    Optional<ClientModel> findByDocumentNumber(String documentNumber);

}
