package main.java.com.luizconrado.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    public String showPage() {

        System.out.println("I reached the JSP @RequestMapping - (\"/\") - Root");
        return "views/main-menu";
    }


    @RequestMapping(value = "/showForm", method = {RequestMethod.POST, RequestMethod.GET})
    public String showForm() {

        System.out.println("I reached the JSP @RequestMapping - (\"/\"showForm)");
        return "views/helloworld-form";
    }


    @RequestMapping(value = "/processForm", method = {RequestMethod.POST, RequestMethod.GET})
    public String processForm() {

        System.out.println("I reached the JSP @RequestMapping - (\"/\"processForm)");
        return "views/helloworld";
    }

}
