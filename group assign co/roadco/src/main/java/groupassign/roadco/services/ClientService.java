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

    public Iterable<Client> findAll() 
    {
        return clientRepo.findAll();
    }

    public Iterable<Client> findClientByCompany(String clientCompany) {
        return clientRepo.findByClientCompany(clientCompany);
    }

    public Iterable<Client> findClientByName(String clientName) {
        return clientRepo.findByClientName(clientName);
    }

    public Iterable<Client> findClientByCompanyAndAddress(String clientCompany, String clientAddress) {
        return clientRepo.findByClientCompanyAndClientAddress(clientCompany, clientAddress);
    } 


}
