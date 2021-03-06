package io.pivotal.workshop.codesnippetmanagerjdbc;


import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    private final CounterService counterService;

    public GreetingController(CounterService counterService){
        this.counterService = counterService;
    }

    @GetMapping("/hello")
    public String hello() {
        counterService.increment("counter.services.greeting.invoked");
        return "Hello World!!!";
    }
}
