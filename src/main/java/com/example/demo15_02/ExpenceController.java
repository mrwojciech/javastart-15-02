package com.example.demo15_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExpenceController {

    @Autowired
    ExpenceRepository expenceRepository;

    @GetMapping("/allExpences")
    public String Expences(Model model) {

        model.addAttribute("expences", expenceRepository.getAllExpences());

        return "allExpences";
    }


    @GetMapping("/addExpence")
    public String addExpence(Model model) {

        model.addAttribute("expence", new Expence());
        return "addExpence";
    }


    @PostMapping( value=  "/addExpence")
    //@ResponseBody
    public String addExpence(@ModelAttribute("expence") Expence expence ) {


        expenceRepository.addExpence(expence);

        return "addSucceed";
    }


}