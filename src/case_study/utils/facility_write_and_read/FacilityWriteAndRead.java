package case_study.utils.facility_write_and_read;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import java.io.*;
import java.util.LinkedHashMap;

public class FacilityWriteAndRead {
    public static void writeToFile(LinkedHashMap<Facility, Integer> facilityLinkedHashMap, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility f : facilityLinkedHashMap.keySet()) {
                if (f instanceof House) {
                    bufferedWriter.write(((House) f).writeToFile());
                    bufferedWriter.newLine();
                } else if (f instanceof Room) {
                    bufferedWriter.write(((Room) f).writeToFile());
                    bufferedWriter.newLine();
                } else if (f instanceof Villa) {
                    bufferedWriter.write(((Villa) f).writeToFile());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LinkedHashMap<Facility, Integer> readFromFile(String path) {
        LinkedHashMap<Facility, Integer> facilityLinkedHashMap = new LinkedHashMap<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String[] arr = temp.split(",");
                if (temp.contains("HO")) {
                    facilityLinkedHashMap.put((new House((arr[0]), arr[1], Double.parseDouble(arr[2]),
                            Double.parseDouble(arr[3]), Integer.parseInt(arr[4]),
                            (arr[5]), arr[6], Integer.parseInt(arr[7]))), 0);
                } else if (temp.contains("RO")) {
                    facilityLinkedHashMap.put((new Room((arr[0]), arr[1], Double.parseDouble(arr[2]),
                            Double.parseDouble(arr[3]), Integer.parseInt(arr[4]),
                            (arr[5]), arr[6])), 0);
                } else if (temp.contains("VL")) {
                    facilityLinkedHashMap.put((new Villa((arr[0]), arr[1], Double.parseDouble(arr[2]),
                            Double.parseDouble(arr[3]), Integer.parseInt(arr[4]),
                            (arr[5]), arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]))), 0);
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityLinkedHashMap;
    }
}
