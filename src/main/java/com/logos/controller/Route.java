package com.logos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by danul on 11.05.2017.
 */
@Controller
public class Route {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
