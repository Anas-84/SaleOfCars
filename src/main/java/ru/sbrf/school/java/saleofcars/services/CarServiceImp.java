package ru.sbrf.school.java.saleofcars.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sbrf.school.java.saleofcars.entities.Car;
import ru.sbrf.school.java.saleofcars.repositories.CarRepository;

import java.util.List;

@Service
public class CarServiceImp implements CarService{
    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> findCarsByMark(String mark) {
        List<Car> cars = carRepository.findCarsByMark(mark);
        return cars;
    }

    @Override
    public List<Car> findCarsByModel(String model) {
        List<Car> cars = carRepository.findCarsByModel(model);
        return cars;
    }

    @Override
    public List<Car> findCarsByYearReleaseAfter(Integer year) {
        List<Car> cars = carRepository.findCarsByYearReleaseAfter(year);
        return cars;
    }

    @Override
    public List<Car> findCarsByYearReleaseBetween(Integer beginYear, Integer endYear) {
        List<Car> cars = carRepository.findCarsByYearReleaseBetween(beginYear, endYear);
        return cars;
    }

    @Override
    public List<Car> findCarsByYearReleaseBefore(Integer yearRelease) {
        List<Car> cars = carRepository.findCarsByYearReleaseBefore(yearRelease);
        return cars;
    }

    @Override
    public List<Car> findCarsByPriceAfter(Integer price) {
        List<Car> cars = carRepository.findCarsByPriceAfter(price);
        return cars;
    }

    @Override
    public List<Car> findCarsByPriceBetween(Integer beginPrice, Integer endPrice) {
        List<Car> cars = carRepository.findCarsByPriceBetween(beginPrice, endPrice);
        return cars;
    }

    @Override
    public List<Car> findCarsByPriceBefore(Integer price) {
        List<Car> cars = carRepository.findCarsByPriceBefore(price);
        return cars;
    }
}
