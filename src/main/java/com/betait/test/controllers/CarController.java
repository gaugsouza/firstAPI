package com.betait.test.controllers;

import com.betait.test.domains.Car;
import com.betait.test.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService service;

    @GetMapping
    public List<Car> get(){
        return service.findAll();
    }
}
