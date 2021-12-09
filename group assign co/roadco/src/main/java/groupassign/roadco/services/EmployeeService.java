package groupassign.roadco.services;

import org.springframework.stereotype.Service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;


import groupassign.roadco.model.entities.Employee;
import groupassign.roadco.model.repositories.EmployeeRepo;

@Service
public class EmployeeService {
    EmployeeRepo employeeRepo;
    Logger logger = LoggerFactory.getLogger(ScheduleService.class);

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        super();
        this.employeeRepo = employeeRepo;
    }

    //find all employees
    public Iterable<Employee> findEmployees() 
    {
        return employeeRepo.findAll();
    }

    //find employee that last name start with keycharacter
    public List<Employee>findEmployeeLastNameByKeyCharacter(Character KeyCharacter)
    {
        return employeeRepo.findByEmployeeLastNameStartingWith(KeyCharacter);
    }

     //find employee that last name start with keyphrase
     public List<Employee>findEmployeeByLastNameSearchPhrase(String Keyphrase)
     {
         return employeeRepo.findByEmployeeLastNameStartingWithIgnoreCase(Keyphrase);
     }
}
