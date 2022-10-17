package com.example.demo.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Greeting;
import com.example.demo.Service.IGreetingService;

/**
 * To Create Greeting Message App  And perform  Crud Operation
 * @author mraj
 *
 */
@RestController
@RequestMapping("/greetingMsg")

public class GreetingAppController {
	/**
	 * @Autowired is enables you to inject the object dependency implicitly.
	 */
    @Autowired
    private static final String template = "Hello, %s";
    private final AtomicLong counter= new AtomicLong();
	private IGreetingService greetingService;

    public void GreetingController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }
    /**
     * @GetMapping is HTTP GET requests onto specific handler methods.
     * @GetMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. GET) .
     * @param name
     * @return
     */

    @GetMapping("/Message")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
    /**
     * Extend Greeting Controller to use Service  layer to get Simple Greeting Message
     * @return HelloWorld
     */
    @GetMapping("/greeting")
    public String greeting() {
        return greetingService.getGreetingMessage();
    }

}
