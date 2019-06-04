package com.test.Calculator_service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.Calculator_service.AppService;


@RestController
public class AppController {
     @RequestMapping("/hello")
     public String sayHi()
     { 
    	 return "Hi";
     }
     
    @Autowired
     private AppService topicservice ;
     
     @RequestMapping(method=RequestMethod.GET,value="/add")
     public int add(@RequestParam("x") int x,@RequestParam("y") int y)
     {
    	 return topicservice.add(x,y);
    	 
     }
     
     @RequestMapping(method=RequestMethod.GET,value="/sub")
     public int sub(@RequestParam("x") int x,@RequestParam("y") int y)
     {
    	 return topicservice.sub(x,y);
    	 
     }
}