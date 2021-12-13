package groupassign.roadco.model.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import groupassign.roadco.model.entities.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer>{
    
        //right now it will collect a list of employees with the last name you wanted you wanted
    List<Employee> findByEmployeeLastName(String lastName);

    //right now IgnoreCase is used to ignore the Capitalization of any letter in the search of an employee 
    List<Employee> findByEmployeeFirstNameIgnoreCaseAndEmployeeLastNameIgnoreCase(String firstName,String lastName);

    //this finds a single employee with the matching last name
    Employee findOneByEmployeeLastName(String lastName);

    //Find by first letter in last name
    List<Employee> findByEmployeeLastNameStartingWith(Character lastNameCharacter);

    //Find by lastName that begins with search characters
    List<Employee> findByEmployeeLastNameStartingWithIgnoreCase(String searchLastName);

    //For schedule Find employee By First Name
    Employee findByEmployeeFirstNameIgnoreCase(String employeeFirstName);
}
