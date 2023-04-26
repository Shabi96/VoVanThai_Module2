package case_study.comon.employee_write_and_read;

import case_study.model.employee.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeWriteAndRead {
    public static void writeToFile(List<Employee> employees, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : employees) {
                bufferedWriter.write(e.writeToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFromFile(String path) {
        File file = new File(path);
        List<Employee> employeeArrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String[] arr = temp.split(",");
                employeeArrayList.add(new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Integer.parseInt(arr[4]),
                        Integer.parseInt(arr[5]), arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeArrayList;
    }
}
