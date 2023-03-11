package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarRepository;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;
    public List<Car> getFirstNCars(Integer n) {
        List<Car> cars = carRepository.getCars();
        if (n == null || n >= cars.size()) return cars;
        return cars.subList(0, n);
    }


}
