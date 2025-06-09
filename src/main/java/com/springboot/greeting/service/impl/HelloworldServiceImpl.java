package com.springboot.greeting.service.impl;
import com.springboot.greeting.service.HelloworldService;
import org.springframework.stereotype.Service;

@Service
public class HelloworldServiceImpl implements HelloworldService {
    @Override
    public String hello() {
        return "Hello, World! from patient service";
    }

    @Override
    public String greet() {
        return "Greetings from patient service";
    }
}
