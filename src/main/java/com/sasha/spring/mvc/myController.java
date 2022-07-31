package com.sasha.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HttpServletBean;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class myController {
    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }
    @RequestMapping("/askDetails")
    public String askEmpDetails(Model model){

//        Employee emp = new Employee();
//        emp.setName("ivan");
//        emp.setSurname("petrov");
//        emp.setSalary(400);
        model.addAttribute("employee", new Employee());

        return "askEmpDetails-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult){
        System.out.println(emp.getSurname().length());
        if(bindingResult.hasErrors()){
            return "askEmpDetails-view";
        }
        else{
            return "showEmpDetails-view";
        }
    }
}
