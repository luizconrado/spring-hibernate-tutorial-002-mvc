package main.java.com.luizconrado.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllerThymeleaf {

//    private static final Logger logger = Logger.getLogger(HomeControllerThymeleaf.class);


    @GetMapping("/thymeleaf")
    public String index(Model model) {

        System.out.println("I reached the Thymeleaf @GetMapping(\"/\")");
        model.addAttribute("message", "Hello Spring MVC 5!");
        return "templates/index";
    }
}