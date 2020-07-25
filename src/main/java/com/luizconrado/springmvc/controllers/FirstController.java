package main.java.com.luizconrado.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/")
    public String index(Model model) {
        System.out.println("I reached the @GetMapping(\"/\")");
        model.addAttribute("message", "Hello Spring MVC 5!");
        return "index";
    }
}