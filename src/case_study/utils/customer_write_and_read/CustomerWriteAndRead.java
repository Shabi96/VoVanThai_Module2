package case_study.utils.customer_write_and_read;

import case_study.model.customer.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerWriteAndRead {
    public static void writeToFile(List<Customer> customers, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer c : customers) {
                bufferedWriter.write(c.WriteToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readFromFile(String path) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
                while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                    String[] arr = temp.split(",");
                    customerList.add(new Customer((arr[0]), arr[1], arr[2], arr[3],
                            (arr[4]), (arr[5]), arr[6], arr[7], arr[8]));
                }
                bufferedReader.close();
                fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
