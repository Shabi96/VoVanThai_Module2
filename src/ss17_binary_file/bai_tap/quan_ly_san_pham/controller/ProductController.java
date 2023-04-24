package ss17_binary_file.bai_tap.quan_ly_san_pham.controller;

import ss17_binary_file.bai_tap.quan_ly_san_pham.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private ProductService productService = new ProductService();
    Scanner scanner = new Scanner(System.in);

    public void showMenuProduct() {
        boolean flag = true;
        do {
            System.out.print("----Quản lý sản phẩm---- \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Hiển thị \n" +
                    "3. Tìm kiếm sản phẩm \n" +
                    "0. Thoát \n" +
                    "Mời bạn chọn: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    productService.addNewProduct();
                    break;
                case "2":
                    productService.showProductList();
                    break;
                case "3":
                    productService.findProductByName();
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn chọn chưa đúng chức năng!");
            }
        } while (flag);
    }
}
