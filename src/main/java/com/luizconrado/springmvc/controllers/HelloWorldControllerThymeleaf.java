package main.java.com.luizconrado.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/thymeleaf/hello")
public class HelloWorldControllerThymeleaf {

    @Autowired
    WebApplicationContext applicationContext;

    // Handler Method:
    @RequestMapping(path = "showForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String showForm(Model model) {
        System.out.println("I reached the JSP @RequestMapping - (/thymeleaf/hello/showForm)");
        return "templates/helloworld-form";
    }

    // Using Thymeleaf to read the URL parameter
    @RequestMapping(path = "processForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String processForm(HttpServletRequest httpServletRequest, Model model) {
        System.out.println("I reached the JSP @RequestMapping - (/thymeleaf/hello/processForm)");
        model.addAttribute("httpServletRequest", httpServletRequest.getMethod());
        return "templates/helloworld";
    }


    // Handler Method:
    @RequestMapping(path = "showFormV2", method = {RequestMethod.GET, RequestMethod.POST})
    public String showFormV2(Model model) {
        System.out.println("I reached the JSP @RequestMapping - (/thymeleaf/hello/showFormV2)");
        return "templates/helloworld-form-v2";
    }

    // Using HttpServletRequest to get the desired parameter
    @RequestMapping(path = "processFormV2", method = {RequestMethod.GET, RequestMethod.POST})
    public String processFormV2(HttpServletRequest request, Model model) {
        System.out.println("I reached the JSP @RequestMapping - (/thymeleaf/hello/processFormV2)");

//        model.addAttribute("httpServletRequest", request.getMethod());

        // Read the Request Parameter from the HTML Form - Using HttpServletRequest:
        String studentName = request.getParameter("studentName");

        // Transforming the data to all caps / into Uppercase:
        studentName = studentName.toUpperCase();

        // Creating the message:
        studentName = "Yo! " + studentName;

        // Adding message to the model:
        model.addAttribute("message", studentName);

        return "templates/helloworld-v2";
    }


    // Handler Method:
    @RequestMapping(path = "showFormV3", method = {RequestMethod.GET, RequestMethod.POST})
    public String showFormV3(Model model) {
        System.out.println("I reached the JSP @RequestMapping - (/thymeleaf/hello/showFormV3)");

        System.out.println(applicationContext.getServletContext().getContextPath());
        System.out.println(applicationContext.getServletContext().getRealPath("/"));
        System.out.println(applicationContext.getServletContext().getRealPath(""));
        System.out.println(applicationContext.getServletContext().getServerInfo());

        return "templates/helloworld-form-v3";
    }

    // Using @RequestParam to get the desired parameter
    // This is called Annotation Parameter Binding
    @RequestMapping(path = "processFormV3", method = {RequestMethod.GET, RequestMethod.POST})
    public String processFormV3(@RequestParam("studentName") String studentName, Model model) {
        System.out.println("I reached the JSP @RequestMapping - (/thymeleaf/hello/processFormV3)");

//        model.addAttribute("httpServletRequest", request.getMethod());

        // Not needed, since the studentName is coming from the @RequestParam("studentName") String studentName.
        // Read the Request Parameter from the HTML Form - Using HttpServletRequest:
        // String studentName = request.getParameter("studentName");

        // Transforming the data to all caps / into Uppercase:
        studentName = studentName.toUpperCase();

        // Creating the message:
        studentName = "Hello my Friend from V3! " + studentName;

        // Adding message to the model:
        model.addAttribute("messageFromV3", studentName);

        return "templates/helloworld-v3";
    }

}
