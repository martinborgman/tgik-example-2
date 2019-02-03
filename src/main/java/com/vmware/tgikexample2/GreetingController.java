package com.vmware.tgikexample2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GreetingController {

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String sayHello() {
        return "Hello";
    }
    
}