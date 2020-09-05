package main.java.com.luizconrado.springmvc.controllers;

import main.java.com.luizconrado.springmvc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/thymeleaf/hello")
public class HelloWorldControllerThymeleaf {

    @Autowired
    WebApplicationContext applicationContext;

    // Handler Method:
    @RequestMapping(value = "showCompleteForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String showCompleteForm(Model model) {

        System.out.println("I reached the Thymeleaf @RequestMapping - (/thymeleaf/hello/showCompleteForm)");
        Student student = new Student();
        model.addAttribute("student", student);

        // https://o7planning.org/en/11659/thymeleaf-form-select-option-example
        model.addAttribute("professionMap", Student.getProfessionMap());
        model.addAttribute("genderMap", Student.getGenderMap());
        model.addAttribute("programingLanguageOptions", Student.getProgramingLanguageOptions());
        model.addAttribute("laptopScreenSizeOptions", Student.getLaptopScreenSizeOptions());

        return "templates/completeform-form";
    }

    // Using Thymeleaf to read the URL parameter
    @RequestMapping(path = "processCompleteForm", method = {RequestMethod.GET, RequestMethod.POST},
            consumes = "application/x-www-form-urlencoded;charset=UTF-8",
            produces = "text/plain;charset=UTF-8")
    public String processCompleteForm(@ModelAttribute("student") Student student,
                                      @RequestBody String requestBody,
                                      HttpServletRequest httpServletRequest,
                                      Model model) {

        System.out.println("I reached the Thymeleaf @RequestMapping - (/thymeleaf/hello/processCompleteForm)");
        model.addAttribute("httpServletRequest", httpServletRequest.getMethod());

        System.out.println("---------------------------------------");
        System.out.println("Request:");
        System.out.println(httpServletRequest);
        System.out.println("CharacterEncoding = " +  httpServletRequest.getCharacterEncoding());
        System.out.println(requestBody);
        try {
            String requestString = httpServletRequest.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            System.out.println("requestString: " + requestString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Received Object Data:");
        System.out.println(student);

        model.addAttribute("studentCreated", student);

        return "templates/completeform-confirmation";
    }


    // Handler Method:
    @RequestMapping(path = "showForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String showForm(Model model) {
        System.out.println("I reached the Thymeleaf @RequestMapping - (/thymeleaf/hello/showForm)");
        return "templates/helloworld-form";
    }

    // Using Thymeleaf to read the URL parameter
    @RequestMapping(path = "processForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String processForm(HttpServletRequest httpServletRequest, Model model) {
        System.out.println("I reached the Thymeleaf @RequestMapping - (/thymeleaf/hello/processForm)");
        model.addAttribute("httpServletRequest", httpServletRequest.getMethod());
        return "templates/helloworld";
    }


    // Handler Method:
    @RequestMapping(path = "showFormV2", method = {RequestMethod.GET, RequestMethod.POST})
    public String showFormV2(Model model) {
        System.out.println("I reached the Thymeleaf @RequestMapping - (/thymeleaf/hello/showFormV2)");
        return "templates/helloworld-form-v2";
    }

    // Using HttpServletRequest to get the desired parameter
    @RequestMapping(path = "processFormV2", method = {RequestMethod.GET, RequestMethod.POST})
    public String processFormV2(HttpServletRequest request, Model model) {
        System.out.println("I reached the Thymeleaf @RequestMapping - (/thymeleaf/hello/processFormV2)");

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
        System.out.println("I reached the Thymeleaf @RequestMapping - (/thymeleaf/hello/showFormV3)");

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
        System.out.println("I reached the Thymeleaf @RequestMapping - (/thymeleaf/hello/processFormV3)");

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
