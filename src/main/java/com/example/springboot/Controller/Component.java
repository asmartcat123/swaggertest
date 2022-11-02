package com.example.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Component")
public class Component {
    @RequestMapping(value="/tt", method= RequestMethod.POST)
    @ResponseBody
    public String t1(){
        return "333";
    }
}
