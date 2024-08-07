package com.example.lab.clients.interfaces;

import com.example.lab.clients.impl.ClientModel;

public interface ClientService {

    public ClientModel getClientById(Long id);

    public ClientModel getClientByDocumentNumber(String documentNumber);

    public ClientModel createClient(ClientModel clientModel);

    public ClientModel updateClient(Long id, ClientModel clientModel);

    public void deleteClient(Long id);

}
