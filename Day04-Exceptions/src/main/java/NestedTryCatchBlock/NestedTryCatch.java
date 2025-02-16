package NestedTryCatchBlock;

import java.util.Scanner;

public class NestedTryCatch {
    public static void checkNestedTryCatch(int[] array, int divisorElement){
        try{
            int value = array[divisorElement];
            int divide = value / divisorElement;
            System.out.println("division result: "+divide);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index!");
        }
        catch (ArithmeticException e){
            System.out.println("Can not divide by zero!");
        }
    }
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i = 0; i < 3; i++){
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter a element that you want to divide from : ");
        int divisorElement = scanner.nextInt();
        checkNestedTryCatch(array,divisorElement);
    }
}
