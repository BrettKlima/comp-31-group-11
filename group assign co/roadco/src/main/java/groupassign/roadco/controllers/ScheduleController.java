package groupassign.roadco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import groupassign.roadco.services.ScheduleService;

@Controller
public class ScheduleController {
    
    ScheduleService scheduleService;

    @Autowired
    public ScheduleController(ScheduleService scheduleService) { //Constructor
        super();
        this.scheduleService = scheduleService;
    }

    @GetMapping("/schedule")
    public String getAllSchedule(Model model){
        //model.addAttribute("schedule",scheduleService.findAll());
        return "schedule";
    }

}
