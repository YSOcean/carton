package com.yb.carton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Create by YSOcean
 */
@Controller
@RequestMapping("/api")
public class LayuiController {


    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(Model model){
        return "home";
    }
}
