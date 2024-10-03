package com.example.lab.crm.clients;


import com.example.lab.crm.clients.enums.DocumentType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClientDto {

    @NotBlank(message = "First name cannot be empty")
    private String firstName;
    @NotBlank(message = "Last name cannot be empty")
    private String lastName;
    @NotBlank(message = "Email cannot be empty")
    @Email
    private String email;
    private DocumentType documentType;
    private String documentNumber;
    private Long companyId;
//    private Address address;

}
