package ss17_binary_file.bai_tap.quan_ly_san_pham.comon;

import ss17_binary_file.bai_tap.quan_ly_san_pham.model.Product;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteFile {
    private static String PATH_BINARY_FILE = "src/ss17_binary_file/bai_tap/quan_ly_san_pham/binary_file/product";

    public static void write(List<Product> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PATH_BINARY_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
