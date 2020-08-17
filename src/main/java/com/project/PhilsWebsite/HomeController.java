package com.project.PhilsWebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// initially from https://www.youtube.com/watch?v=ul1tJErDEkE
@Controller
public class HomeController {
    @RequestMapping(value = "/index")
    public String home() {
        return "home";
    }
}
