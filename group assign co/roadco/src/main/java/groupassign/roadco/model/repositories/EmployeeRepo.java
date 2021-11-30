package groupassign.roadco.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import groupassign.roadco.model.entities.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer>{
    
}
