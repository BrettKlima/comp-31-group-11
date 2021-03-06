package groupassign.roadco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import groupassign.roadco.services.ProjectService;

@Controller
public class ProjectController {
    
    ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) { //Constructor
        super();
        this.projectService = projectService;
    }
    @GetMapping("/project")
    public String getProject(

        @RequestParam(required=false) String projectLocation,
        @RequestParam(required=false) String projectIdString,    
        Model model){
            
            int projectId;


        boolean projectLocationInvalid =
            projectLocation == null ||
            projectLocation.isEmpty();

        boolean projectIdInvalid =
            projectIdString == null ||
            projectIdString.isEmpty();
        
        if (projectLocationInvalid)
        {   model.addAttribute("project", projectService.findAll());
        }
        else
        {  
            model.addAttribute("project", projectService.findByProjectLocation(projectLocation) );
        }
        
        if (projectIdInvalid)
        {   model.addAttribute("project", projectService.findAll());
        }
        else
        {  
            projectId = Integer.parseInt(projectIdString);
            model.addAttribute("project", projectService.findByProjectID(projectId) );
        }
        
        return "project";
    }

    
}
