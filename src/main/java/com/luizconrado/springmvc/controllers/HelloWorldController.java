package main.java.com.luizconrado.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/hello")
public class HelloWorldController {

    @RequestMapping(path = "showForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String showForm() {
        System.out.println("I reached the JSP @RequestMapping - (/hello/showForm)");
        return "views/helloworld-form";
    }

    //    Using Thymeleaf to read the URL parameter
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

    //    Using HttpServletRequest to get the desired parameter
    @RequestMapping(path = "processFormV2", method = {RequestMethod.GET, RequestMethod.POST})
    public String processFormV2(HttpServletRequest request, Model model) {
        System.out.println("I reached the JSP @RequestMapping - (/hello/processFormV2)");

        // Read the Request Parameter from the HTML Form - Using HttpServletRequest:
        String studentName = request.getParameter("studentName");

        // Transforming the data to all caps / into Uppercase:
        studentName = studentName.toUpperCase();

        // Creating the message:
        studentName = "Yo! " + studentName;

        // Adding message to the model:
        model.addAttribute("message", studentName);

        return "views/helloworld-v2";
    }

}
