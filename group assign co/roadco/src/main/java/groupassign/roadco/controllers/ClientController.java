package groupassign.roadco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    public String getAllClient(Model model) {
        model.addAttribute("client", clientService.findAllClients());
        return "client";
    }
}
