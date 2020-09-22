package main.java.com.luizconrado.springmvc.controllers;

import main.java.com.luizconrado.springmvc.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/thymeleaf/customer")
public class CustomerControllerThymeleaf {


    @RequestMapping(path = "showForm", method = {RequestMethod.GET})
    public String showForm(Model theModel) {

        // create a new customer object
        Customer customer = new Customer();

        // add customer object to the model
        theModel.addAttribute("customer", customer);


        return "templates/customer-form";
    }


    @RequestMapping(path = "processForm", method = {RequestMethod.POST})
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {

        // log the customer data
        System.out.println("customer: " + customer);

        if (bindingResult.hasErrors()) {
            return "templates/customer-form";

        } else {
            return "templates/customer-confirmation";
        }


    }

}
