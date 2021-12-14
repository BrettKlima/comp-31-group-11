package groupassign.roadco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        model.addAttribute("schedule",scheduleService.findAll());
        return "schedule";
    }

    @GetMapping("/scheduleDayMonth")
    public String getScheduleByDayAndMonth(Model model,
                                           @RequestParam(required=false) String schDay,
                                           @RequestParam(required=false)String schMonth
                                           ){
        model.addAttribute("schedule",scheduleService.findSchDayAndSchMonth(schDay,schMonth));
        return "schedule";
    }

    @GetMapping("/scheduleEmpName")
    public String getScheduleByEmpFirstName(Model model, @RequestParam(required=false) String firstName){
        model.addAttribute("schedule",scheduleService.findEmployeeByFirstName(firstName));
        return "schedule";
    }
    @GetMapping("/scheduleEmpRole")
    public String getScheduleByEmpRole(Model model){
        model.addAttribute("schedule",scheduleService.OrderByStartTime());
        return "schedule";
    }


}