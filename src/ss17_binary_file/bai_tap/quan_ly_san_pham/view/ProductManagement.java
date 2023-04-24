package ss17_binary_file.bai_tap.quan_ly_san_pham.view;

import ss17_binary_file.bai_tap.quan_ly_san_pham.controller.ProductController;

public class ProductManagement {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showMenuProduct();
    }
}
