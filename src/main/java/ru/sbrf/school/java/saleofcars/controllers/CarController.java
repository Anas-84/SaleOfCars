package ru.sbrf.school.java.saleofcars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sbrf.school.java.saleofcars.entities.Car;
import ru.sbrf.school.java.saleofcars.services.CarService;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/mark/{mark}")
    public List<Car> showAllCarsByMark (@PathVariable String mark){
        List<Car> cars = carService.findCarsByMark(mark);
        return cars;
    }

    @GetMapping("/model/{model}")
    public List<Car> showAllCarsByModel (@PathVariable String model){
        List<Car> cars = carService.findCarsByModel(model);
        return cars;
    }

    @GetMapping("/year-after/{year}")
    public List<Car> showAllCarsByYearAfter (@PathVariable Integer year){
        List<Car> cars = carService.findCarsByYearReleaseAfter(year);
        return cars;
    }

    @GetMapping("/year-between/{beginYear}/{endYear}")
    public List<Car> showAllCarsByYearBetween (@PathVariable Integer beginYear, @PathVariable Integer endYear){
        List<Car> cars = carService.findCarsByYearReleaseBetween(beginYear, endYear);
        return cars;
    }

    @GetMapping("/year-before/{year}")
    public List<Car> showAllCarsByYearBefore (@PathVariable Integer year){
        List<Car> cars = carService.findCarsByYearReleaseBefore(year);
        return cars;
    }

    @GetMapping("/price-after/{price}")
    public List<Car> showAllCarsByPriceAfter (@PathVariable Integer price){
        List<Car> cars = carService.findCarsByPriceAfter(price);
        return cars;
    }

    @GetMapping("/price-between/{beginPrice}/{endPrice}")
    public List<Car> showAllCarsByPriceBetween (@PathVariable Integer beginPrice, @PathVariable Integer endPrice){
        List<Car> cars = carService.findCarsByPriceBetween(beginPrice, endPrice);
        return cars;
    }

    @GetMapping("/price-before/{price}")
    public List<Car> showAllCarsByPriceBefore (@PathVariable Integer price){
        List<Car> cars = carService.findCarsByPriceBefore(price);
        return cars;
    }

}