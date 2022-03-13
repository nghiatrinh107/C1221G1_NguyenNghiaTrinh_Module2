package ss16_io_text_file.bai_tap.copy_test;

import java.io.*;

public class CopyFileText {
    public static String stringList = "";
    public static String read(String pathName){
        File file = new File(pathName);
        FileReader fileReader = null;
        try {
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            String line = "";
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null){
                stringList = line;
            }

            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(stringList);
        return stringList;
    }
    public static void write(String target,String pathName){
        try {
            FileWriter fileWriter = new FileWriter(target);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(pathName);
            bufferedWriter.close();
            fileWriter.close();
            if(!target.isEmpty()){
                System.out.println("file exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CopyFileText.read("src\\ss16_io_text_file\\bai_tap\\copy_test\\Source");
        System.out.println("target before copy !");
        CopyFileText.write("src\\ss16_io_text_file\\bai_tap\\copy_test\\Target",stringList);
        CopyFileText.read("src\\ss16_io_text_file\\bai_tap\\copy_test\\Target");
    }
}
