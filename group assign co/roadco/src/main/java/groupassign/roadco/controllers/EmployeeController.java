package groupassign.roadco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestParam;

import groupassign.roadco.services.EmployeeService;



@Controller
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) { //Constructor
        super();
        this.employeeService = employeeService;
    }
    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping("/searchAllEmployees")
    public String getAllAuthors(Model model)
    {
        logger.info("Requested employee page");
        model.addAttribute("employee" , employeeService.findEmployees());
        return "employee";
    }


    @GetMapping("/employee")
    public String getAuthors(Model model)
    {
        logger.info("Requested employee page");
        model.addAttribute("employee" , employeeService.findEmployees());
        return "employee";
    }

    
    @PostMapping("/searchEmployeeLastNameChar")
    public String getEmployeesLastChar(Model model, @RequestParam(value = "lastNameChar", defaultValue = " ") Character lastNameChar)
    {
        logger.info("Requested employee Search Char page");
        logger.info("Char is " + lastNameChar);
        if (lastNameChar == ' ')
        {
            model.addAttribute("employee" , employeeService.findEmployees());
        }
        else
        {
            model.addAttribute("employee" , employeeService.findEmployeeLastNameByKeyCharacter(lastNameChar));
        }
        return "employee";
    }

    @GetMapping("/employee1")
    public String getEmployees1(Model model)
    {
        logger.info("Requested testing author page by last name Character 'G'(case sensitive)");
        model.addAttribute("employee" , employeeService.findEmployeeLastNameByKeyCharacter('C'));
        return "employee";
    }
    
    @PostMapping("/searchEmployeeLastName")
    public String getEmployeesLastString(Model model, @RequestParam(value = "lastNameString", defaultValue = " ") String lastNameString)
    {
        logger.info("Requested employee Search String page");
        logger.info("String is " + lastNameString);
        if (lastNameString == " ")
        {
            model.addAttribute("employee" , employeeService.findEmployees());
            logger.info("finding all employees");
        }
        else
        {
            if (employeeService.findEmployeeByLastNameSearchPhrase(lastNameString).size() == 0)
            {
                model.addAttribute("employee" , employeeService.findEmployees());
                logger.info("finding all employee");
            }
            else
            {
                model.addAttribute("employee" , employeeService.findEmployeeByLastNameSearchPhrase(lastNameString));
                logger.info("finding all by search phrase");
            }
        }
        return "employee";
    }

    @GetMapping("/employee2")
    public String getEmployees2(Model model)
    {
        logger.info("Requested author testing page by case not sensitive keyphrase");
        model.addAttribute("authors" , employeeService.findEmployeeByLastNameSearchPhrase("man"));
        return "authors";
    }
}
