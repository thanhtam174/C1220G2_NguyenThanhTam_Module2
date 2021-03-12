package _15_io_textfile.exercises;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        System.out.println("Nhập đường dẫn file gốc: ");
        Scanner scanner = new Scanner(System.in);
        String sourceFilePath = scanner.nextLine();
        System.out.println("Nhập đường dẫn file copy: ");
        String targetFilePath = scanner.nextLine();

        File sourceFile = new File(sourceFilePath);
        FileReader fileReader=new FileReader(sourceFile);
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        File targetFile =new File(targetFilePath);
        FileWriter fileWriter=new FileWriter(targetFile);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        String targetFileText = null;

        while ((targetFileText = bufferedReader.readLine()) != null){
            bufferedWriter.write(targetFileText +"\n");
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
