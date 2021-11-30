package groupassign.roadco.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import groupassign.roadco.model.entities.Client;
import groupassign.roadco.model.repositories.ClientRepo;

@Service
public class ClientService {

    ClientRepo clientRepo;

    @Autowired
    public ClientService(ClientRepo clientRepo) {
        super();
        this.clientRepo = clientRepo;
    }

    public Iterable<Client> findClients() 
    {
        return clientRepo.findAll();
    }
}
