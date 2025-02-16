package CheckedException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompileTime {
    public static void checkException(){
        String path = "D:\\capgeminiTraining\\week-04-collections,streams\\Day04-Exceptions\\src\\main\\java\\CheckedException\\Data.txt";
        try(
                BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
                 String line = "";
                 while((line = bufferedReader.readLine()) != null){
                     System.out.println(line);
                 }
        }
        catch(IOException e){
            System.out.println("File not found.");
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        checkException();
    }
}
