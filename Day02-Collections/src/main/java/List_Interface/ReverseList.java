package List_Interface;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    public static void reverseArrayList(List<Integer> list){
        int j = list.size()-1;
        int i = 0;
        while(j >= 0){
            list.set(i,j+1);
            j--;
            i++;
        }
        System.out.println(list);
    }

    public static void reverseLinkedList(List<Integer> list2){
//        List<Integer> list = new LinkedList<>();
        int j = list2.size()-1;
        int i = 0;
        while(j >= 0){
            list2.set(i,j+1);
            j--;
            i++;

        }
        System.out.println(list2);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        // for arraylist
        int i = 0;
        while(i < 5){
            list.add(i+1);
            i++;
        }

        // for linked list
        int k = 0;
        while(k < 5){
            list2.add(k+1);
            k++;
        }

        System.out.println(list);
        reverseArrayList(list);
        System.out.println();
        System.out.println(list2);
        reverseLinkedList(list2);

    }
}
