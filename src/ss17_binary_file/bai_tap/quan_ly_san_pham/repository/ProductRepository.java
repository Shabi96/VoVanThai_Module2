package ss17_binary_file.bai_tap.quan_ly_san_pham.repository;

import ss17_binary_file.bai_tap.quan_ly_san_pham.comon.ReadFile;
import ss17_binary_file.bai_tap.quan_ly_san_pham.comon.WriteFile;
import ss17_binary_file.bai_tap.quan_ly_san_pham.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> getProductList() {
        return ReadFile.read();
    }

    @Override
    public void addProduct(Product product) {
        List<Product> list = ReadFile.read();
        list.add(product);
        WriteFile.write(list);
    }

    @Override
    public List<Product> findProductName(String name) {
        List<Product> list = ReadFile.read();
        List<Product> list1 = new ArrayList<>();
        for (Product product : list) {
            if (product.getName().contains(name)) {
                list1.add(product);
            }
        }
        return list1;
    }
}
