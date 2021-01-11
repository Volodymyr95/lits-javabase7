package ua.lits.lesson10.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        list.add(12);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        list.remove(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


//        int [] arr = {1,2,3,4,5,65};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.addFirst(1);
        integerLinkedList.getFirst();


        //integerLinkedList.
        //FIFO - First In First Out
        //LIFO - Last In First Out

    }
}
