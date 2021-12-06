package groupassign.roadco.model.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import groupassign.roadco.model.entities.Project;

@Repository
public interface ProjectRepo extends CrudRepository<Project,Integer>{
    
    List<Project> findByProjectId(Integer projectId);

    List<Project> findByProjLocation(String projLocation);

    //List<Project> findByClients(Client clients);
}
