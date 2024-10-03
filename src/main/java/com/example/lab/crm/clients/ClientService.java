package com.example.lab.crm.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public ClientModel getClientById(Long id) {
        try {
            Optional<ClientModel> clientReturned = clientRepository.findById(id);
            if(clientReturned.isEmpty()){
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "client not found"
                );
            }
            return clientReturned.get();
        } catch (Exception e) {
            throw e;
        }
    }

//    public ClientModel getClientByDocumentNumber(String documentNumber) {
//        try {
//            Optional<ClientModel> clientReturned = clientRepository.findByDocumentNumber(documentNumber);
//            if(clientReturned.isEmpty()) {
//                throw new ResponseStatusException(
//                        HttpStatus.NOT_FOUND, "client not found"
//                );
//            }
//            return clientReturned.get();
//        } catch(Exception e) {
//            throw e;
//        }
//    }

    public ClientModel createClient(ClientModel clientModel) {
        try {
            return clientRepository.save(clientModel);
        } catch(Exception e) {
            throw e;
        }
    }

    public ClientModel updateClient(Long id, ClientModel clientModel) {
        try {
            Optional<ClientModel> clientQuery = clientRepository.findById(id);
            if(clientQuery.isEmpty()) {
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "client not found"
                );
            }
            clientModel.setId(clientQuery.get().getId());
            return clientRepository.save(clientModel);
        } catch(Exception e) {
            throw e;
        }
    }

    public void deleteClient(Long id) {
        try {
            Optional<ClientModel> clientQuery = clientRepository.findById(id);
            if(clientQuery.isEmpty()) {
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "client not found"
                );
            }
            clientRepository.deleteById(id);
        } catch(Exception e) {
            throw e;
        }
    }
}
