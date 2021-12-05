package groupassign.roadco.model.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import groupassign.roadco.model.entities.Project;

@Repository
public interface ProjectRepo extends CrudRepository<Project,Integer>{
    
    List<Project> findByProjectId(Integer projectId);


    //current problem child. system crashes when i try to run it with it 75 common frames omitted
    //List<Project> findByProj_location(String proj_location);

    //List<Project> findByClients(Client clients);
}
