package ReadUserInputFromConsole;

import java.io.*;
import java.util.Scanner;

public class UserInputReadFromConsole {
    public static void main(String[] args) {
        String filePath = "D:\\capgeminiTraining\\week-04-collections,streams\\Day03-JavaStreams\\src\\main\\java\\ReadUserInputFromConsole\\SavedData.txt";
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)){

            System.out.println("Enter your name: ");
            String name = reader.readLine();

            System.out.println("Enter your age: ");
            String age = reader.readLine();

            System.out.println("Enter your favorite programming language: ");
            String ProgrammingLanguage = reader.readLine();

            bufferedWriter.write("Name "+name);
            bufferedWriter.write("\nAge "+age);
            bufferedWriter.write("\nLanguage "+ProgrammingLanguage);

            System.out.println("Data has been successfully saved in file");

        }
        catch (IOException e){
          e.printStackTrace();
        }
    }
}
