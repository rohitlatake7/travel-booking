package com.example.travelbooking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class flight {
    @GetMapping("/flight")
    public String getData()
    {
        return "Please book your fight";
    }

//    public String getDa add your basic info";}
}
