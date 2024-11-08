package com.example.demo;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class WeatherRepository {
    private List<WeatherService> services = new ArrayList<>();

    public WeatherRepository(){
        services.add(new WeatherService("New York", "http://api.weather-ny.com"));
        services.add(new WeatherService("Los Angeles", "http://api.weather-la.com"));
    }

    public List<WeatherService> findAll(){
        return services;
    }
}
