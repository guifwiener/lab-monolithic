package com.example.lab.clients.impl;

import com.example.lab.clients.interfaces.ClientController;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientControllerImpl implements ClientController {

    @Autowired
    ClientServiceImpl clientService;

    @Override
    @GetMapping("find/id/{id}")
    public ResponseEntity<ClientModel> getClientById(
            @PathVariable(value = "id") Long id
    ) {
        ClientModel client = clientService.getClientById(id);
        return ResponseEntity.ok().body(client);
    }

    @Override
    @GetMapping("find/document-number/{documentNumber}")
    public ResponseEntity<ClientModel> getClientByDocumentNumber(
            @PathVariable(value = "documentNumber") String documentNumber
    ) {
        ClientModel client = clientService.getClientByDocumentNumber(documentNumber);
        return ResponseEntity.ok().body(client);
    }

    @Override
    @PostMapping("create")
    public ClientModel createClient(@RequestBody @Valid ClientDto clientDto) {
        ClientModel client = new ClientModel();
        BeanUtils.copyProperties(clientDto, client);
        return clientService.createClient(client);
    }

    @Override
    @PatchMapping("update/{id}")
    public ClientModel updateClient(
            @PathVariable(value = "id") Long id,
            @RequestBody @Valid ClientDto clientDto
    ) {
        ClientModel clientModel = new ClientModel();
        BeanUtils.copyProperties(clientDto, clientModel);
        return clientService.updateClient(id, clientModel);

    }

    @Override
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable(value = "id") Long id) {
        clientService.deleteClient(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("no content found");
    }
}
