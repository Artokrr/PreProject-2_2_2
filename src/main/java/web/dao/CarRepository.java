package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Lada", 5, 90));
        cars.add(new Car("Sedan", 6, 95));
        cars.add(new Car("Supra", 10, 300));
        cars.add(new Car("Mercedes", 7, 120));
        cars.add(new Car("Hyundai", 2, 80));
    }
    public List<Car> getCars() {
        return cars;
    }
}
