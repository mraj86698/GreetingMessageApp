package com.example.demo.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Greeting;

/**
 * To Create Greeting Message App  And perform  Crud Operation
 * @author mraj
 *
 */
@RestController
@RequestMapping("/greetingMsg")

public class GreetingAppController {
    @Autowired
    private static final String template = "Hello, %s";
    private final AtomicLong counter= new AtomicLong();

    @GetMapping("/Message")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }

}
