package net.togogo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class helloController {
    @RequestMapping("hello")
    public  String hello()
    {
        return "hello world!";
    }
}
