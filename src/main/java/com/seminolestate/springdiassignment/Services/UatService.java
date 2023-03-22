package com.seminolestate.springdiassignment.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("uatService")
public class UatService implements PrimeService {

    @Override
    public String sayHello() {
        return "UAT services says hello!!!";
    }
}
