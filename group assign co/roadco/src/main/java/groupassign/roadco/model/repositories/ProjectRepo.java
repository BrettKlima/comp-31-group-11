package groupassign.roadco.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import groupassign.roadco.model.entities.Project;

@Repository
public interface ProjectRepo extends CrudRepository<Project,Integer>{
    
}
