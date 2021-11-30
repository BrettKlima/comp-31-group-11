package groupassign.roadco.model.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import groupassign.roadco.model.entities.Client;

@Repository
public interface ClientRepo extends CrudRepository<Client,Integer>{
    List<Client> findAll();
}
