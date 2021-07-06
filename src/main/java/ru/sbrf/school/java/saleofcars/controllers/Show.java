package ru.sbrf.school.java.saleofcars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sbrf.school.java.saleofcars.entities.Car;
import ru.sbrf.school.java.saleofcars.entities.User;
import ru.sbrf.school.java.saleofcars.repositories.CarRepository;
import ru.sbrf.school.java.saleofcars.repositories.UserRepository;

import java.util.List;

@Controller
public class Show {
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/show-cars")
    public String showCars(Model model) {
        List<Car> cars = carRepository.findAll();
        model.addAttribute("cars", cars);
        return "show-cars";
    }

    @RequestMapping("/show-users")
    public String showUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "show-users";
    }




}
