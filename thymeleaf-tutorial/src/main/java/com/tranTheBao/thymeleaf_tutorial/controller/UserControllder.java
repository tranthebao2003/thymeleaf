package com.tranTheBao.thymeleaf_tutorial.controller;

import com.tranTheBao.thymeleaf_tutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserControllder {
//    handler method to handle variable-expression request

    @GetMapping("/variable-expression")
    public String variableExpression(Model model){
        User user = new User("bao", "baoxadoi@gmail.com", "admin", "name");
        model.addAttribute("user", user);
        return "variable-expression";
    }

//    handler method to handle selection expression
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model){
        User user = new User("bao22", "baoxadoi22@gmail.com", "admin2", "name2");
        model.addAttribute("user2", user);
        return "selection-expression";
    }

//    handler method to handle message expression request
    @GetMapping("/message-expression")
    public String messageExpression(Model model){

        return "message-expression";
    }

//    handler method handle link expression
    @GetMapping("/link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id", 1);
        return "link-expression";
    }

//    handler method to handle fragment expression
    @GetMapping("/fragment-expression")
    public String fragmentExpression(Model model){
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users(Model model){
        User admin = new User("admin", "baoxadoi2222@gmail.com", "admin222", "name222");
        User bao = new User("bao22", "baoxa22013@gmail.com", "user", "nu");
        User hai = new User("hai", "hai@gmail.com", "user", "nam");
        List<User> users = new ArrayList<User>();
        users.add(admin);
        users.add(bao);
        users.add(hai);
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/if-unless")
    public String ifUnless(Model model){
        User admin = new User("admin", "baoxadoi2222@gmail.com", "ADMIN", "name222");
        User bao = new User("bao22", "baoxa22013@gmail.com", "USER", "nu");
        User hai = new User("hai", "hai@gmail.com", "USER", "nam");
        List<User> users = new ArrayList<User>();
        users.add(admin);
        users.add(bao);
        users.add(hai);
        model.addAttribute("users", users);
        return "if-unless";
    }

    @GetMapping("/switch-case")
    public String switchCase(Model model){
        User admin = new User("admin2", "baoxadoi2222@gmail.com", "USEReee", "name222");
        model.addAttribute("user", admin);
        return "switch-case";
    }
}
