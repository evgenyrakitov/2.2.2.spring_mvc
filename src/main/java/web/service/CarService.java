package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    Car car1 = new Car("toyota", "black", "1");
    Car car2 = new Car("mercedes", "white", "2");
    Car car3 = new Car("volvo", "green", "3");
    public List<Car> getAllCar() {
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        return carList;
    }


}
