package case_study.utils.facility_write_and_read;

import case_study.model.facility.House;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class HouseWriteAndRead {
    public static void writeToFile(LinkedHashMap<House, Integer> houseList, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (House h : houseList.keySet()) {
                bufferedWriter.write(h.writeToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LinkedHashMap<House, Integer> readFromFile(String path) {
        LinkedHashMap<House, Integer> houseList = new LinkedHashMap<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String[] arr = temp.split(",");
                houseList.put((new House((arr[0]), arr[1], Double.parseDouble(arr[2]),
                        Double.parseDouble(arr[3]), Integer.parseInt(arr[4]),
                        (arr[5]), arr[6], Integer.parseInt(arr[7]))), 0);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }
}
