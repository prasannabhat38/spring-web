package com.springweb.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springweb.model.Foo;
import com.springweb.service.FooService;

@Controller
public class HomeController {
    private static final Log LOG = LogFactory.getLog(HomeController.class);
    
    @Autowired
    private FooService fooService;
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home(ModelMap model) {
        LOG.info("Called from root-context");
        
        model.addAttribute("msg", "A simple spring-web gradle project");
        return "home";
    }
    
    @RequestMapping(value="/foo", method=RequestMethod.GET)
    public String handleFooRequests(ModelMap model) {
        LOG.info("Handling foo");
        
        Foo foo = fooService.getFooById(1);
        
        model.addAttribute("msg", "Display Foo");
        model.addAttribute("id", foo.getId());
        model.addAttribute("version", foo.getVersion());
        
        return "home";
    }
}
