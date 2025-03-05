package org.example.ryan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class ConfigController {

    @Value("${author:test}")
    private String author;

    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    public String getName() {
//        return "Ryan";
        return "Hello," + author + "!";
    }

}
