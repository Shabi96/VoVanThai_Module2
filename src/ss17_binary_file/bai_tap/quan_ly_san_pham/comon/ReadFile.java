package ss17_binary_file.bai_tap.quan_ly_san_pham.comon;

import ss17_binary_file.bai_tap.quan_ly_san_pham.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static String PATH_BINARY_FILE = "src/ss17_binary_file/bai_tap/quan_ly_san_pham/binary_file/product";

    public static List<Product> read() {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        List<Product> list = null;
        try {
            File file = new File(PATH_BINARY_FILE);
            if (file.length() == 0) {
                list = new ArrayList<>();
            } else {
                fileInputStream = new FileInputStream(PATH_BINARY_FILE);
                objectInputStream = new ObjectInputStream(fileInputStream);
                list = (List<Product>) objectInputStream.readObject();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
