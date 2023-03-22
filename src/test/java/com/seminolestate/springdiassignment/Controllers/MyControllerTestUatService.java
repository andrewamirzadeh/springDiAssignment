package com.seminolestate.springdiassignment.Controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("uatService")
@SpringBootTest
class MyControllerTestUatService {

    @Autowired
    MyController myController;

    @Test
    void sayHello(){
        System.out.println(myController.sayHello());
    }

}