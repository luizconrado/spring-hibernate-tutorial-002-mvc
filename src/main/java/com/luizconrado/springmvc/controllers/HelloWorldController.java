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


    @RequestMapping(path = "showFormV2", method = {RequestMethod.GET, RequestMethod.POST})
    public String showFormV2() {
        System.out.println("I reached the JSP @RequestMapping - (/hello/showFormV2)");
        return "views/helloworld-form-v2";
    }

    @RequestMapping(path = "processFormV2", method = {RequestMethod.GET, RequestMethod.POST})
    public String processFormV2() {
        System.out.println("I reached the JSP @RequestMapping - (/hello/processFormV2)");
        return "views/helloworld-v2";
    }

}
