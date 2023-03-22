package com.seminolestate.springdiassignment.Controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ActiveProfiles("devService")
class MyControllerTestDevService {

    @Autowired
    MyController myController;

    @Test
    void sayHello(){
        System.out.println(myController.sayHello());
    }

}