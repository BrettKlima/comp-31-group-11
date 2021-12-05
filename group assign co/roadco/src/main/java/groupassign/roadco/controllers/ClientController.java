package groupassign.roadco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import groupassign.roadco.services.ClientService;

@Controller
public class ClientController {
   
    ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) { //Constructor
        super();
        this.clientService = clientService;
    }

    @GetMapping("/client")
    public String getClient(Model model) {
        model.addAttribute("client", clientService.findAll());
        return "client";
    }

 //   @PostMapping("/addClient")
 //   public String newClient(@ModelAttribute)
}
