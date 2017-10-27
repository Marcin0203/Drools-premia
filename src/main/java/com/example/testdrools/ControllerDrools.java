package com.example.testdrools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDrools {

    private final ServiceDrools serviceDrools;

    @Autowired
    public ControllerDrools (ServiceDrools serviceDrools){
        this.serviceDrools = serviceDrools;
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public Kontrakt getQuestions(@RequestParam(required = true) String name, Double cena) {

        Kontrakt kontrakt = new Kontrakt();
        kontrakt.setName(name);
        kontrakt.setCena(cena);
        serviceDrools.getCommission(kontrakt);
        return kontrakt;

    }

}

