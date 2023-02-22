package web.service;

import web.model.Car;

import java.util.List;

public class CarService {
    public static List<Car> getFirstNCars(List<Car> cars, Integer n) {
        if (n == null || n >= cars.size()) return cars;
        return cars.subList(0, n);
    }


}
