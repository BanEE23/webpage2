package com.webpage.webpage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping(value = "/v1/indexPage")
    public String index(){
        return "index";
    }
}
