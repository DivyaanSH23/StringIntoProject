package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")  //http://localhost:9000/hello
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/query")  //http://localhost:9000/hello/query?name=Divyansh
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
