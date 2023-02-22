package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false)
                            Integer count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", 5, 90));
        cars.add(new Car("Sedan", 6, 95));
        cars.add(new Car("Supra", 10, 300));
        cars.add(new Car("Mercedes", 7, 120));
        cars.add(new Car("Hyundai", 2, 80));
        model.addAttribute("cars",
                CarService.getFirstNCars(cars, count));
        return "cars";
    }
}
