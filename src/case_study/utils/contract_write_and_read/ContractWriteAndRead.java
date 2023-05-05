package case_study.utils.contract_write_and_read;

import case_study.model.contract.Contract;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContractWriteAndRead {
    public static void write(List<Contract> contracts, String path) {
        File file = new File(path);
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Contract c : contracts) {
                bufferedWriter.write(c.writeToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Contract> read(String path) {
        List<Contract> contractList = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String[] arr = temp.split(",");
                contractList.add(new Contract(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3])));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contractList;
    }
}
