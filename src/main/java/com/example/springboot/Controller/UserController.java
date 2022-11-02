package com.example.springboot.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {



    @ApiModelProperty("得到一个User")
    @RequestMapping(value="/test", method= RequestMethod.GET)
    @ResponseBody
    public String test(String user){

        return user;
    }

}
