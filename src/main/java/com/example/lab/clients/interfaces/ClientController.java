package com.example.lab.clients.interfaces;


import com.example.lab.clients.impl.ClientDto;
import com.example.lab.clients.impl.ClientModel;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface ClientController {

    public ResponseEntity<ClientModel> getClientById(Long id);
    public ResponseEntity<ClientModel> getClientByDocumentNumber(String documentNumber);
    public ClientModel createClient(ClientDto clientDto);
    public ClientModel updateClient(Long id, ClientDto clientDto);
    public ResponseEntity<String> deleteClient(Long id);

}
