package ss12_java_collection_framework.bai_tap.quan_ly_san_pham.repository;

import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.Car;

import java.util.List;

public interface ICarRepository {
    List<Car> getProductList();

    void addNewCar(Car car);

    boolean deleteCarById(int id);

    boolean editCarById(int id, Car car);

    boolean findCarByName(String name);

    boolean checkById(int id);
}
