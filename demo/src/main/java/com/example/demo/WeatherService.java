package com.example.demo;

public class WeatherService {
    private String location;
    private String serviceUrl;

    public WeatherService(String location, String serviceUrl){
        this.location = location;
        this.serviceUrl = serviceUrl;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getServiceUrl(){
        return serviceUrl;
    }
    public void setServiceUrl(String serviceUrl){
        this.serviceUrl = serviceUrl;
    }
}
