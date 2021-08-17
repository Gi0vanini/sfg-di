package guru.springframework.modulo2.services;

import org.springframework.stereotype.Service;

@Service
public class PropetyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World! - Property";
    }

}
