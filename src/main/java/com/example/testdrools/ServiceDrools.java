package com.example.testdrools;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDrools {

    private final KieContainer kieContainer;

    @Autowired
    public ServiceDrools(KieContainer kieContainer){
        this.kieContainer = kieContainer;
    }

    public Kontrakt getCommission (Kontrakt kontrakt){
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        kieSession.insert(kontrakt);
        kieSession.setGlobal("bMaluch", 100.0);
        kieSession.setGlobal("bFerrari", 1000.0);
        kieSession.fireAllRules();
        kieSession.dispose();
        return kontrakt;
    }
}
