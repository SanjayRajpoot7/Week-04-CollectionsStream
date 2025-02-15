package JUnit.BasicJUnitt;

import java.util.ArrayList;
import java.util.List;

public class ListManager {

    public static void addElement(List<Integer> list){
        list.add(5);
        list.add(2);
        list.add(1);
        System.out.println(list);
    }

    public static void removeElement(List<Integer> list){
        list.remove(0);
        System.out.println(list);
    }

    public static void getSize(List<Integer> list){
        System.out.println(list.size());
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addElement(list);
        removeElement(list);
        getSize(list);
    }
}
