package ss12_java_collection_framework.bai_tap.quan_ly_san_pham.service;

import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.Car;
import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.repository.CarRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    CarRepository carRepository = new CarRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayCarList() {
        List<Car> carList = carRepository.getProductList();
        carList.sort(Comparator.comparing(Car::getPrice));
        for (Car s : carList) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewCar() {
        System.out.println("Nhập id Car:");
        int carId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên Car:");
        String carName = scanner.nextLine();
        System.out.println("Nhập giá Car:");
        double carPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng Car:");
        int carAmount = Integer.parseInt(scanner.nextLine());
        Car car = new Car(carId, carName, carPrice, carAmount);
        carRepository.addNewCar(car);
        System.out.println("Thêm thành công Car!");
    }

    @Override
    public void deleteCar() {
        this.displayCarList();
        System.out.print("Nhập id Car muốn xóa: ");
        int carIdDelete = Integer.parseInt(scanner.nextLine());
        boolean isId = carRepository.checkById(carIdDelete);
        if (isId) {
            System.out.print("Bạn có chắc chắc muốn xóa Car " + carIdDelete + "????? \n" +
                    "1. Xóa \n" +
                    "Nhập bất cứ gì để Hủy \n" +
                    "Mời xác nhận lại: ");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                boolean isDelete = carRepository.deleteCarById(carIdDelete);
                if (isDelete) {
                    System.out.println("Xóa thành công car!");
                } else {
                    System.out.println("Không tìm thấy!");
                }
            }
        }
    }

    @Override
    public void editCar() {
        this.displayCarList();
        System.out.println("Nhập id Car muốn sửa:");
        int carIdEdit = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập id Car mới: ");
        int carNewId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên Car mới: ");
        String carNewName = scanner.nextLine();
        System.out.println("Nhập giá Car mới: ");
        double carNewPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng Car mới: ");
        int carNewAmount = Integer.parseInt(scanner.nextLine());
        Car car = new Car(carNewId, carNewName, carNewPrice, carNewAmount);
        boolean isEdit = carRepository.editCarById(carIdEdit, car);
        if (isEdit) {
            System.out.println("Sửa thành công Car!");
        } else {
            System.out.println("Không tìm thấy!");
        }
    }

    @Override
    public void findCar() {
        System.out.print("Nhập tên Car muốn tìm:");
        String carFindName = scanner.nextLine();
        boolean isFound = carRepository.findCarByName(carFindName);
        if (isFound) {
            System.out.println("Đã tìm thấy!");
        } else {
            System.out.println("Không tìm thấy!");
        }
    }
}
