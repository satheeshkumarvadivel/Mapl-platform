/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.broadsoft.mapl.sampleservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author svadivel
 */
@RestController
public class SampleRestController {
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "hello world...!";
    }
    
}
