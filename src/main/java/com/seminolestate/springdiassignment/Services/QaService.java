package com.seminolestate.springdiassignment.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("QaService")
public class QaService implements PrimeService{
    @Override
    public String sayHello() {
        return "Qa services says hello!!!";
    }
}
