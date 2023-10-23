package vending.machine;

import java.io.*;
import java.util.Arrays;
import java.util.List;
public class reandandwrite {


    public void writeCSV(String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("Name, Age, Country");

            List<String> records = Arrays.asList("John Doe,30,USA", "Jane Smith,25,Canada");
            for (String record : records) {
                writer.println(record);
            }

            System.out.println("Data written to CSV successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCSV(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
