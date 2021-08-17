package guru.springframework.modulo2.controllers;

import guru.springframework.modulo2.services.GreetingService;

public class PropetyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
