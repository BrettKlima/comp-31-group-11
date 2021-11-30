package groupassign.roadco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import groupassign.roadco.services.EmployeeService;

@Controller
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) { //Constructor
        super();
        this.employeeService = employeeService;
    }
    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        return "employee";
    }
}
