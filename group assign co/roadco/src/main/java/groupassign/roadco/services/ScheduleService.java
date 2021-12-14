package groupassign.roadco.services;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import groupassign.roadco.model.entities.Employee;
import groupassign.roadco.model.entities.Schedule;
import groupassign.roadco.model.repositories.EmployeeRepo;
import groupassign.roadco.model.repositories.ScheduleRepo;

@Service
public class ScheduleService {
    
    EmployeeRepo employeeRepo;
    ScheduleRepo scheduleRepo; 
    
    @Autowired
    public ScheduleService( ScheduleRepo scheduleRepo,EmployeeRepo employeeRepo) {
        super();
        this.scheduleRepo = scheduleRepo;
        this.employeeRepo = employeeRepo;
    }

    public Iterable<Schedule> findAll() {
        
        return scheduleRepo.findAll();
    }

    public Iterable<Schedule> findEmployeeByFirstName(String firstName) {
        Employee employee = employeeRepo.findByEmployeeFirstNameIgnoreCase(firstName);
        return scheduleRepo.findByEmployee(employee);
    }

    public Iterable<Schedule> findSchDayAndSchMonth(String schDay,String schMonth) {
        
    return scheduleRepo.findBySchDayAndSchMonth(schDay,schMonth);
    }

    public Iterable<Schedule> OrderByStartTime() {
        return scheduleRepo.OrderBySchStartTime();
    }
}
