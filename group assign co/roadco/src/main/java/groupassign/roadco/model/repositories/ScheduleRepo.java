package groupassign.roadco.model.repositories;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import groupassign.roadco.model.entities.Employee;
import groupassign.roadco.model.entities.Schedule;

@Repository
public interface ScheduleRepo extends CrudRepository<Schedule,Integer>{
    //List<Schedule> findAll();
    //List<Schedule> findByScheduleID(Schedule project);
    //List<Schedule> findByEmployee(Employee employee);
}