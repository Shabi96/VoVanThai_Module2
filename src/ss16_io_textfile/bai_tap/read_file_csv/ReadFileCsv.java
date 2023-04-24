package ss16_io_textfile.bai_tap.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFileCsv {
    public static List<String> showCountryList(String csv) {
        List<String> stringList = new ArrayList<>();
        if (csv != null) {
            String[] arrayString = csv.split(",");
            Collections.addAll(stringList, arrayString);
        }
        return stringList;
    }

    public static void printCountry(List<String> country) {
        System.out.println("Country{" +
                "id=" + country.get(0) +
                ", code='" + country.get(1) + '\'' +
                ", name='" + country.get(2) + '\'' +
                '}');
    }

    public static void main(String[] args) {
        String PATH_FILE_CSV = "src/ss16_io_textfile/bai_tap/read_file_csv/file.csv";
        File file = new File(PATH_FILE_CSV);
        FileReader fileReader = null;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                printCountry(showCountryList(temp));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
