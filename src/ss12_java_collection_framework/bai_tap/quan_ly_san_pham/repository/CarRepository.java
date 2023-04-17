package ss12_java_collection_framework.bai_tap.quan_ly_san_pham.repository;

import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private static ArrayList<Car> carArrayList = new ArrayList<>();

    static {
        carArrayList.add(new Car(101, "BMW", 1700, 10));
        carArrayList.add(new Car(102, "Mercedes", 1500, 5));
        carArrayList.add(new Car(103, "Ferrari", 5000, 7));
        carArrayList.add(new Car(104, "Lamborghini", 5500, 15));
    }

    @Override
    public List<Car> getProductList() {
        return carArrayList;
    }

    @Override
    public void addNewCar(Car car) {
        carArrayList.add(car);
    }

    @Override
    public boolean deleteCarById(int id) {
        for (int i = 0; i < carArrayList.size(); i++) {
            if (id == carArrayList.get(i).getId()) {
                carArrayList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean editCarById(int id, Car car) {
        for (int i = 0; i < carArrayList.size(); i++) {
            if (id == carArrayList.get(i).getId()) {
                carArrayList.set(i, car);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean findCarByName(String name) {
        for (Car car : carArrayList) {
            if (car.getName().equals(name)) {
                System.out.println(car);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkById(int id) {
        for (Car car : carArrayList) {
            if (id == car.getId()) {
                return true;
            }
        }
        return false;
    }
}
