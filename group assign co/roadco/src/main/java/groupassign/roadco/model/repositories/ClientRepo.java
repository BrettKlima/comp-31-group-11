package groupassign.roadco.model.repositories;



import java.util.List;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import groupassign.roadco.model.entities.Client;

@Repository
public interface ClientRepo extends CrudRepository<Client,Integer>{

    //Queries to find a client
    List<Client> findByClientCompany(String clientCompany);
    List<Client> findByClientName(String clientName);
    List<Client> findByClientCompanyAndClientAddress(String clientCompany, String clientAddress);
    //Queries to update a client

    

    
}
