package com.seminolestate.springdiassignment.Controllers;

import com.seminolestate.springdiassignment.Services.PrimeService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final PrimeService primeService;


    public MyController(PrimeService primeService) {
        this.primeService = primeService;
    }

    public String sayHello(){
        System.out.println("This is the controller...");

        return primeService.sayHello();
    }
}
