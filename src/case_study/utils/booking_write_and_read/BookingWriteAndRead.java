package case_study.utils.booking_write_and_read;

import case_study.model.booking.Booking;
import java.io.*;
import java.util.TreeSet;

public class BookingWriteAndRead {
    public static void writeToFile(TreeSet<Booking> bookings, String path) {
        File file = new File(path);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking b : bookings) {
                bufferedWriter.write(b.writeToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static TreeSet<Booking> readToFile(String path) {
        TreeSet<Booking> bookingList = new TreeSet<>();
        File file = new File(path);
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String[] arr = temp.split(",");
                bookingList.add(new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingList;
    }
}
