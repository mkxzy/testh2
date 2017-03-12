package com.blotus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/3/12.
 */
@Controller
public class HomeController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
