package com.gmail.dm0275.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dmancilla on 2/17/2017.
 */
@Controller
public class SpringController {

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ModelAndView view() {
        return new ModelAndView("Hello");
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
