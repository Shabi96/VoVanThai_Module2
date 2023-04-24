package ss17_binary_file.bai_tap.quan_ly_san_pham.service;

import ss17_binary_file.bai_tap.quan_ly_san_pham.model.Product;
import ss17_binary_file.bai_tap.quan_ly_san_pham.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private ProductRepository productRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void showProductList() {
        List<Product> list = productRepository.getProductList();
        for (Product s : list) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewProduct() {
        System.out.println("Nhập id product: ");
        int idProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên product: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập giá product: ");
        double productPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất product: ");
        String companyProduct = scanner.nextLine();
        System.out.println("Nhập mô tả: ");
        String describe = scanner.nextLine();
        Product product = new Product(idProduct, nameProduct, productPrice, companyProduct, describe);
        productRepository.addProduct(product);
    }

    @Override
    public void findProductByName() {
        System.out.println("Nhập tên sản phẩm muốn tìm");
        String name = scanner.nextLine();
        List<Product> products = productRepository.findProductName(name);
        if (products.size() == 0) {
            System.out.println("Không có sản phẩm!");
        } else {
            for (Product s : products) {
                System.out.println(s);
            }
        }
    }
}
