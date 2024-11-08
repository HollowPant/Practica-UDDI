package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherRepository repository;

    @GetMapping("/services")
    public List<WeatherService> getWeatherServices(@RequestParam String location){
        return repository.findAll().stream()
                .filter(service -> service.getLocation().equalsIgnoreCase(location)).toList();
    }    
}
