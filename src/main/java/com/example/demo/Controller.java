package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by efornaro on 10/15/18.
 */
@RestController
@RequestMapping("/mutante")
public class Controller {


    @RequestMapping(value = "/adn/validate", method = RequestMethod.POST)
    public Boolean validateAdn(@RequestBody Mutant mutant){
        return true;
    }
}
