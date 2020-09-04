package main.java.com.luizconrado.springmvc.controllers;

import main.java.com.luizconrado.springmvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(path = "showForm", method = {RequestMethod.GET})
    public String showForm(Model theModel) {

        // create a new student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);
        theModel.addAttribute("countries", Student.getCountryList());
        theModel.addAttribute("programingLanguageOptions", Student.getProgramingLanguageOptions());

        return "views/student-form";
    }


    @RequestMapping(path = "processForm", method = {RequestMethod.POST})
    public String processForm(@ModelAttribute("student") Student theStudent) {

        // log the student data
        System.out.println("theStudent: " + theStudent);

        return "views/student-confirmation";
    }
}
