package case_study.utils.facility_write_and_read;

import case_study.model.facility.Room;
import java.io.*;
import java.util.LinkedHashMap;

public class RoomWriteAndRead {
    public static void writeToFile(LinkedHashMap<Room, Integer> houseList, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Room r : houseList.keySet()) {
                bufferedWriter.write(r.writeToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LinkedHashMap<Room, Integer> readFromFile(String path) {
        LinkedHashMap<Room, Integer> roomList = new LinkedHashMap<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String[] arr = temp.split(",");
                roomList.put((new Room((arr[0]), arr[1], Double.parseDouble(arr[2]),
                        Double.parseDouble(arr[3]), Integer.parseInt(arr[4]),
                        (arr[5]), arr[6])), 0);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }
}
