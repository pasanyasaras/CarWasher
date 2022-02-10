package com.carWasher.carWasher.web;

import com.carWasher.carWasher.model.Car;
import com.carWasher.carWasher.model.Driver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/carWasherController")
public class CarWasherController {
    @RequestMapping("/cars")
    @ResponseBody
    public List<Car> getCars()
    {
         List<Car> cars = new ArrayList<Car>();
         Driver driver1 = new Driver(1,"WALTER","WHITE","0719685741", "MATARA");
         Driver driver2 = new Driver(2,"PASAN","YASARA","0719858741", "GALLE");
         Driver driver3 = new Driver(3,"JOHN","CENA","0719858742", "KANDY");

         Car car1 = new Car(1,"FIAT","RED",driver1,2018);
         Car car2 = new Car(2,"OPEL","BLUE",driver2,2019);
         Car car3 = new Car(3,"CITRION","WHITE",driver3,2020);

         cars.add(car1);
         cars.add(car2);
         cars.add(car3);

         return cars;

    }

    @RequestMapping("carNameFord")
    public ModelAndView fordJsp()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Ford Mustang");
        modelAndView.setViewName("ford");

        return modelAndView;
    }
}
