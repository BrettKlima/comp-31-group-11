package groupassign.roadco.services;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import groupassign.roadco.model.entities.Schedule;
import groupassign.roadco.model.repositories.ScheduleRepo;

@Service
public class ScheduleService {
    
   
    ScheduleRepo scheduleRepo; 
    
    @Autowired
    public ScheduleService( ScheduleRepo scheduleRepo) {
        super();
        this.scheduleRepo = scheduleRepo;
    }

    public Iterable<Schedule> findAll() {
        
        return scheduleRepo.findAll();
    }

}
