package guru.springframework.modulo2.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
