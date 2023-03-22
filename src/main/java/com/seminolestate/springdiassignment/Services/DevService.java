package com.seminolestate.springdiassignment.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"devService", "default"})
public class DevService implements PrimeService {

    @Override
    public String sayHello() {
        return "Dev Services say hello!";
    }
}
