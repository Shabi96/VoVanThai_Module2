package ss17_binary_file.bai_tap.copy_binary;

import java.io.*;
import java.util.Scanner;

public class CopyBinary implements Serializable {
    private static final String PATH_SOURCE_FILE = "src/ss17_binary_file/bai_tap/copy_binary/source_file";
    private static final String PATH_TARGET_FILE = "src/ss17_binary_file/bai_tap/copy_binary/target_file";

    public static void write(String str) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(PATH_SOURCE_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeBytes(str);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(File source, File target) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = scanner.nextLine();
        write(str);
        File sourceFile = new File(PATH_SOURCE_FILE);
        File targetFile = new File(PATH_TARGET_FILE);
        copyFile(sourceFile, targetFile);
        System.out.println("Copy completed!");
        File file = new File(PATH_TARGET_FILE);
        System.out.println("Số byte là: " + file.length());
    }
}
