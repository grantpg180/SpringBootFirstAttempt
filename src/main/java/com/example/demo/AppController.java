package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    
    @RequestMapping("test")
    public String test(){

        System.out.println("Appcontroller->welcome()");
        
        return "index";
    }
    @RequestMapping("/contactUs")
    public String listContact(Model model){
ContactBusiness business = new ContactBusiness();
        List<Contact> contactList= business.getContactList();

        model.addAttribute("comtacts", contactList);

        return "contact";
    }
}