package groupassign.roadco.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import groupassign.roadco.model.entities.Schedule;

@Repository
public interface ScheduleRepo extends CrudRepository<Schedule,Integer>{
    
}
