package com.lll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qaa on 2017/7/10.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hsello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }

}
