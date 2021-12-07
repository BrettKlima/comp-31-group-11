package groupassign.roadco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;


//import groupassign.roadco.model.entities.Client;
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

    @GetMapping("/findByCompany")
    public String getCompany(@RequestParam(required = false) String clientCompany,
    Model model
    ) {
        boolean keywordsInvalid = clientCompany == null || clientCompany.isEmpty();
        if(keywordsInvalid)
        {
            model.addAttribute("client", clientService.findAll());
        }
        model.addAttribute("client", clientService.findClientByCompany(clientCompany));
        return "client";
    }

    @GetMapping("/findByClientName")
    public String getName(@RequestParam(required = false) String clientName,
    Model model
    ) {
        boolean keywordsInvalid = clientName == null || clientName.isEmpty();
        if(keywordsInvalid)
        {
            model.addAttribute("client", clientService.findAll());
        }
        model.addAttribute("client", clientService.findClientByName(clientName));
        return "client";
    }

    @GetMapping("/findByCompanyAndAddress")
    public String getCompanyAndAddress(@RequestParam(required = false) String clientCompany,
                                        @RequestParam(required = false) String clientAddress,
                                        Model model
                                        ) 
    {
        boolean keywordsInvalid = clientCompany == null || clientCompany.isEmpty() || 
                                    clientAddress == null || clientAddress.isEmpty();

        if(keywordsInvalid)
        {
            model.addAttribute("client", clientService.findAll());
        }
        model.addAttribute("client", clientService.findClientByCompanyAndAddress(clientCompany, clientAddress));
        return "client";
    }

 //   @PostMapping("/addClient")
 //   public String newClient(@ModelAttribute)
 //submitting post data from a form, add an object to the model, before you go to the page that had the form
 //tag that identified a backing object in form, in input elements use th:field tag. 
 //that ties inpuit code to backing object. When submit that
 //pass the object into a service method, from service method add that to a table, 
 //through the repo .save method.
}
