package com.carWasher.carWasher;

import com.carWasher.carWasher.model.Car;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class CarWasherControllerTest {

    private RestTemplate restTemplate;

    @Before
    public void init()
    {
        restTemplate = new RestTemplate();
    }

    @Test
    public void getCarsTest()
    {
        List cars = restTemplate.getForObject("http://localhost:8081/carWasherController/cars", List.class);
        System.out.println("Size of the car list: "+cars.size());

    }

    @Test
    public void getCar()
    {
        ResponseEntity<Car> car = restTemplate.getForEntity("http://localhost:8081/carWasherController/car/0", Car.class);
        System.out.println("Car model: "+car.getBody().getModel());
        System.out.println("Status code is: "+car.getStatusCodeValue());
    }
}
