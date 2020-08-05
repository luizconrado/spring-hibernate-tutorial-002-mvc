package main.java.com.luizconrado.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/hello")
public class HelloWorldController {

    @RequestMapping(path = "showForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String showForm() {
        System.out.println("I reached the JSP @RequestMapping - (/hello/showForm)");
        return "views/helloworld-form";
    }

    @RequestMapping(path = "processForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String processForm() {
        System.out.println("I reached the JSP @RequestMapping - (/hello/processForm)");
        return "views/helloworld";
    }

}
