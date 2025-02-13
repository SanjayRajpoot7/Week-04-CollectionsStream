package DataStreams;

import java.io.*;

public class StoreRetriveStudentDetails {

    static class Student {
        int rollNumber;
        String name;
        double gpa;

        public Student(int rollNumber, String name, double gpa) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.gpa = gpa;
        }
    }


    public static void storeStudentDetails(String filePath, Student student) {
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(filePath))) {

            dataOut.writeInt(student.rollNumber);
            dataOut.writeUTF(student.name);
            dataOut.writeDouble(student.gpa);
            System.out.println("Student details have been successfully stored.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student retrieveStudentDetails(String filePath) {
        Student student = null;
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream(filePath))) {

            int rollNumber = dataIn.readInt();
            String name = dataIn.readUTF();
            double gpa = dataIn.readDouble();

            student = new Student(rollNumber, name, gpa);
            System.out.println("Student details have been successfully retrieved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return student;
    }

    public static void main(String[] args) {

        String filePath = "D:\\capgeminiTraining\\week-04-collections,streams\\Day03-JavaStreams\\src\\main\\java\\DataStreams\\FileData.txt";


        Student student = new Student(101, "John Doe", 3.8);
        storeStudentDetails(filePath, student);
        Student retrievedStudent = retrieveStudentDetails(filePath);

        if (retrievedStudent != null) {
            System.out.println("Retrieved Student Details:");
            System.out.println("Roll Number: " + retrievedStudent.rollNumber);
            System.out.println("Name: " + retrievedStudent.name);
            System.out.println("GPA: " + retrievedStudent.gpa);
        }
    }
}

