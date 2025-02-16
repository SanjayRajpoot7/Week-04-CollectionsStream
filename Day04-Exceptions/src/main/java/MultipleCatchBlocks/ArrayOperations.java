package MultipleCatchBlocks;

import java.util.Scanner;

public class ArrayOperations {
    public static void performArrayOperations(int[] array){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter index for accessing value: ");
            int idx = sc.nextInt();
            System.out.println("Value at index "+idx+": "+array[idx]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("Array is not initialized");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter array element: ");
        for(int i = 0; i < 5; i++){
            array[i] = sc.nextInt();
        }
        performArrayOperations(array);
    }
}
