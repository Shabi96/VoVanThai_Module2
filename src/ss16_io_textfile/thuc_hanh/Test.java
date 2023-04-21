package ss16_io_textfile.thuc_hanh;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write("Hello!");
            writer.write("What's your name?");
            writer.write("How old are you?");
            writer.write("Bye!!!!!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File inFile = new File("Hello.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
