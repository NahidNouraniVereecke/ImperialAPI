package com.example.imperialapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    ImperialApi imperialApi = new ImperialApi();
    @RequestMapping("/Centimeter")
    public double centimeter(@RequestParam double inch){
        return imperialApi.centimeter(inch);
    }
    @RequestMapping("/Meter")
    public double meter(@RequestParam double yard){
        return imperialApi.meter(yard);
    }

}
