package main.java.com.luizconrado.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/thymeleaf/hello")
public class HelloWorldControllerThymeleaf {

    @RequestMapping(path = "showForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String showForm(Model model) {
        System.out.println("I reached the JSP @RequestMapping - (/thymeleaf/hello/showForm)");
        return "templates/helloworld-form";
    }

    @RequestMapping(path = "processForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String processForm(HttpServletRequest httpServletRequest, Model model) {
        System.out.println("I reached the JSP @RequestMapping - (/thymeleaf/hello/processForm)");
        model.addAttribute("httpServletRequest", httpServletRequest.getMethod());
        return "templates/helloworld";
    }

}
