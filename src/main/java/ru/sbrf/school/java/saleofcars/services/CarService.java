package ru.sbrf.school.java.saleofcars.services;

import ru.sbrf.school.java.saleofcars.entities.Car;

import java.util.List;

public interface CarService {

    List<Car> findCarsByMark(String mark);

    List<Car> findCarsByModel(String model);

    List<Car> findCarsByYearReleaseAfter(Integer yearRelease);

    List<Car> findCarsByYearReleaseBetween(Integer beginYearRelease, Integer endYearRelease);

    List<Car> findCarsByYearReleaseBefore(Integer yearRelease);

    List<Car> findCarsByPriceAfter(Integer price);

    List<Car> findCarsByPriceBetween(Integer beginPrice, Integer endPrice);

    List<Car> findCarsByPriceBefore(Integer price);
}
