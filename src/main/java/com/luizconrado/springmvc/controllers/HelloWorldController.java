package main.java.com.luizconrado.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/hello")
public class HelloWorldController {


    // Handler Method:
    @RequestMapping(path = "showCompleteForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String showCompleteForm(Model model) {
        System.out.println("I reached the JSP @RequestMapping - (/hello/showCompleteForm)");
        return "views/completeform-form";
    }

    // Using JSP to read the URL parameter
    @RequestMapping(path = "processCompleteForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String processCompleteForm(HttpServletRequest httpServletRequest, Model model) {
        System.out.println("I reached the JSP @RequestMapping - (/hello/processCompleteForm)");
        model.addAttribute("httpServletRequest", httpServletRequest.getMethod());
        return "views/completeform-confirmation";
    }

    // Handler Method:
    @RequestMapping(path = "showForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String showForm() {
        System.out.println("I reached the JSP @RequestMapping - (/hello/showForm)");
        return "views/helloworld-form";
    }

    // Using JSP to read the URL parameter
    @RequestMapping(path = "processForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String processForm() {
        System.out.println("I reached the JSP @RequestMapping - (/hello/processForm)");
        return "views/helloworld";
    }


    // Handler Method:
    @RequestMapping(path = "showFormV2", method = {RequestMethod.GET, RequestMethod.POST})
    public String showFormV2() {
        System.out.println("I reached the JSP @RequestMapping - (/hello/showFormV2)");
        return "views/helloworld-form-v2";
    }

    // Using HttpServletRequest to get the desired parameter
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


    // Handler Method:
    @RequestMapping(path = "showFormV3", method = {RequestMethod.GET, RequestMethod.POST})
    public String showFormV3() {
        System.out.println("I reached the JSP @RequestMapping - (/hello/showFormV3)");
        return "views/helloworld-form-v3";
    }

    // Using @RequestParam to get the desired parameter
    // This is called Annotation Parameter Binding
    @RequestMapping(path = "processFormV3", method = {RequestMethod.GET, RequestMethod.POST})
    public String processFormV3(@RequestParam("studentName") String studentName, Model model) {
        System.out.println("I reached the JSP @RequestMapping - (/hello/processFormV3)");

        // Not needed, since the studentName is coming from the @RequestParam("studentName") String studentName.
        // Read the Request Parameter from the HTML Form - Using HttpServletRequest:
        // String studentName = request.getParameter("studentName");

        // Transforming the data to all caps / into Uppercase:
        studentName = studentName.toUpperCase();

        // Creating the message:
        studentName = "Yo! " + studentName;

        // Adding message to the model:
        model.addAttribute("messageFromV3", studentName);

        return "views/helloworld-v3";
    }

}
