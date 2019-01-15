package com.betait.test.services;

import com.betait.test.domains.Car;
import com.betait.test.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository repository;

    public List<Car> findAll(){
        List<Car> list = new ArrayList<Car>();

        repository.findAll().forEach(list::add);

        return list;
    }
}
