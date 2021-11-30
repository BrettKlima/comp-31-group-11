package groupassign.roadco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    public String getAllProjecy(Model model){
        
        return "project";
    }
}
