package main.java.com.luizconrado.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/thymeleaf")
public class HomeControllerThymeleaf {

//    private static final Logger logger = Logger.getLogger(HomeControllerThymeleaf.class);

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.GET})
    public String showPage(Model model) {

        System.out.println("I reached the Thymeleaf @GetMapping(\"/\") - Root");
        return "templates/main-menu";
    }


    @GetMapping(value = "/test")
    public String index(Model model) {

        System.out.println("I reached the Thymeleaf @GetMapping(\"/\"test)");
        model.addAttribute("message", "Hello Spring MVC 5!");
        return "templates/index";
    }


    @RequestMapping(value = "/showForm", method = {RequestMethod.POST, RequestMethod.GET})
    public String showForm() {

        System.out.println("I reached the JSP @RequestMapping - (\"/\"showForm)");
        return "templates/helloworld-form";
    }


    @RequestMapping(value = "/processForm", method = {RequestMethod.POST, RequestMethod.GET})
    public String processForm() {

        System.out.println("I reached the JSP @RequestMapping - (\"/\"processForm)");
        return "templates/helloworld";
    }

}