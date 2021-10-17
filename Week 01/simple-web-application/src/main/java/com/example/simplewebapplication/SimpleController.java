package com.example.simplewebapplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

// the classes flag is the rest controller, meaning it's ready for use by spring Embassy to handle Web requests
@RestController
public class SimpleController {

    // maps route and point to the index methods when invoked from a browser or by using curl on the common line
    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }
}