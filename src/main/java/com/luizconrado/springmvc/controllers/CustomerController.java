package main.java.com.luizconrado.springmvc.controllers;

import main.java.com.luizconrado.springmvc.model.Customer;
import main.java.com.luizconrado.springmvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {


    @RequestMapping(path = "showForm", method = {RequestMethod.GET})
    public String showForm(Model theModel) {

        // create a new student object
        Customer customer = new Customer();

        // add student object to the model
        theModel.addAttribute("customer", customer);


        return "views/customer-form";
    }


    @RequestMapping(path = "processForm", method = {RequestMethod.POST})
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {

        // log the student data
        System.out.println("customer: " + customer);

        if (bindingResult.hasErrors()){
            return "views/customer-form";

        } else {
            return "views/customer-confirmation";
        }


    }

}
