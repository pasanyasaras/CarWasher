package com.carWasher.carWasher.web;

import com.carWasher.carWasher.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/carWasherController")
public class CarWasherController {
    public List<Car> getCars()
    {
         List<Car> cars = new ArrayList<Car>();
         new Driver(1,"WALTER","WHITE",phone, address)
    }
}
