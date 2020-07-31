package main.java.com.luizconrado.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method={RequestMethod.POST,RequestMethod.GET})
    public String showPage() {

        System.out.println("I reached the JSP @RequestMapping(\"/\")");
        return "views/main-menu";
    }

}
