package _15_io_textfile.optional.exercises;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        List<String> nationalList = new ArrayList<>();
        String filePath = "F:\\C1220G2_NguyenThanhTam_Module2\\src\\_15_io_textfile\\optional\\exercises\\national";

        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        String[] temp;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                nationalList.add(Arrays.toString(temp));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String national : nationalList) {
            System.out.println(national);
        }
    }
}
