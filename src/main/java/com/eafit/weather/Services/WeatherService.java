package com.eafit.weather.Services;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class WeatherService {

    @GetMapping("/weather")
    public String getWeather() {
        //Here we call the API (which can be a method of another class)
        //Here we store in mongo
        return "Here return the json";
    }

    @GetMapping("/weather/{location}")
    public String getWeatherLocation(@PathVariable String location) {
        //Here we call the API (which can be a method of another class)
        //Here we store in mongo
        return "Here return the json based on location";
    }
}
