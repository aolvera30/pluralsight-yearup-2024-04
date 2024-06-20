package com.pluralsight.NorthwindTradersAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @GetMapping("/")
    public String homePageRequest(@RequestParam(defaultValue = "world", name = "country") String country) {
        if (country.isEmpty()) {
            return "Hello world";
        } else {
            return "Hello " + country;
        }
    }
}







