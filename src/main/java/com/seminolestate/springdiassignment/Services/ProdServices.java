package com.seminolestate.springdiassignment.Services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prodServices")
public class ProdServices implements PrimeService{


    @Override
    public String sayHello() {
        return "Production says Hello!!!";
    }
}
