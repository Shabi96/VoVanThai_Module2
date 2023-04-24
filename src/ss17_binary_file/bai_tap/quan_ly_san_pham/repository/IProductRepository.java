package ss17_binary_file.bai_tap.quan_ly_san_pham.repository;

import ss17_binary_file.bai_tap.quan_ly_san_pham.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getProductList();

    void addProduct(Product product);

    List<Product> findProductName(String name);
}
