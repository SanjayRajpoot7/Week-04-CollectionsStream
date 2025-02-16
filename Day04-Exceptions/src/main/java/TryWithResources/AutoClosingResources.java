package TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosingResources {
    public static void autoClosing(){
        String path = "D:\\capgeminiTraining\\week-04-collections,streams\\Day04-Exceptions\\src\\main\\java\\TryWithResources\\Data.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Error reading file.");
        }

    }
    public static void main(String[] args) {
         autoClosing();
    }
}
