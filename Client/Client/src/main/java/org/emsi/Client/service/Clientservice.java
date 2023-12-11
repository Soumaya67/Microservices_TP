package org.emsi.Client.service;


import org.emsi.Client.model.Client;
import org.emsi.Client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Clientservice {

    @Autowired
    private ClientRepository clientRepository;

    public Optional<Client> findById(Long id) {
        return clientRepository.findById(id);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }



    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }



}
