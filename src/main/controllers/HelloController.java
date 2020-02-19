package main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        //return "Greetings from Spring Boot!\n";
        return "/app/index.html";
    }

}