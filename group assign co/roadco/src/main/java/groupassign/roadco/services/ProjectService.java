package groupassign.roadco.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import groupassign.roadco.model.entities.Project;
import groupassign.roadco.model.repositories.ProjectRepo;

@Service
public class ProjectService {

    ProjectRepo projRepo;

    @Autowired
    public ProjectService(ProjectRepo projRepo)
    {
        super();
        this.projRepo = projRepo;
    }

    public Iterable<Project> findAll()
    {
        return projRepo.findAll();
    }
    

    public Iterable<Project> findByProjectID(int projectId)
    {
        return projRepo.findByProjectId(projectId);
    }

    public Iterable<Project> findByProjectLocation(String projectLocation)
    {
        return projRepo.findByProjLocation(projectLocation);
    }
}
