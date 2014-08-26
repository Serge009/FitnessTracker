package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SERGE on 26.08.2014.
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/greeting")
    public String sayHello(Model model){

        model.addAttribute("greeting", "Hello World!");


        return "hello";
    }
}
