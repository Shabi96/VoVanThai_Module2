package ss16_io_textfile.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;

public class CopyFileText {
    public static void main(String[] args) {
        String PATH = "src/ss16_io_textfile/bai_tap/copy_file_text/source_file";
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Welcome!!!!");
            bufferedWriter.newLine();
            bufferedWriter.write("Lady and gentlemen!!!!");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileReader fileReader;
        BufferedReader bufferedReader;
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                System.out.println(temp);
                arrayList.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String PATH1 = "src/ss16_io_textfile/bai_tap/copy_file_text/target_file";
        File file1 = new File(PATH1);
        FileWriter fileWriter1 = null;
        BufferedWriter bufferedWriter1;
        int count = 0;
        try {
            fileWriter1 = new FileWriter(file1);
            bufferedWriter1 = new BufferedWriter(fileWriter1);
            for (String s : arrayList) {
                bufferedWriter1.write(s);
                count += s.length();
                bufferedWriter1.newLine();
                bufferedWriter1.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Số lượng kí tự trong tệp là: " + count);
    }
}
