package com.example.tutorialjavapipeline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HomeControllerTest {
    @Autowired
    HomeController homeController;

    @Test
    public void homeController_healthCheck_ReturnsOk() {
        assertEquals(homeController.healthCheck(), "OK");
    }

    /**
     * 
     */
    @Test
    public void homeController_getPeople_returnsListOf20People() {
        assertEquals(homeController.getPeople()).size(), 20);
    }

}
