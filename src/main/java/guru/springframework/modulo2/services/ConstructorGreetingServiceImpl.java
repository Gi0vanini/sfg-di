package guru.springframework.modulo2.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World! - Constructor";
    }
}
