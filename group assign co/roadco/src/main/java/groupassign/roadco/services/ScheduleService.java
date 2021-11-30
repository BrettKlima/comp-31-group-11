package groupassign.roadco.services;

import java.util.List;

import org.springframework.stereotype.Service;

import groupassign.roadco.model.entities.Schedule;

@Service
public class ScheduleService {
   
    ScheduleService ScheduleRepo; 

    public List<Schedule> findAll() {
        List<Schedule> schedule = ScheduleRepo.findAll();
        return schedule;
    }

}
