package guru.springframework.modulo2.controllers;

import guru.springframework.modulo2.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropetyInjectedControllerTest {

    PropetyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropetyInjectedController();

        controller.greetingService = new ConstructorGreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}