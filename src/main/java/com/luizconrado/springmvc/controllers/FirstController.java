package main.java.com.luizconrado.springmvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

//    private static final Logger logger = Logger.getLogger(FirstController.class);


    @GetMapping("/")
    public String index(Model model) {

        System.out.println("I reached the @GetMapping(\"/\")");
        model.addAttribute("message", "Hello Spring MVC 5!");
        return "index";
    }
}