package ua.lits.lesson12;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
       // HashMap, LinkedHashMap , TreeMap

//
//        Map<Integer, Integer> map = new HashMap(); //Map.of(1,2,3,4,55,67);
//
//        map.put(3,12);
//        map.put(2,22);
//        map.put(1,32);
//
//        Integer orDefault = map.getOrDefault(1, 42);
//        System.out.println(orDefault);
//        Set<Integer> set = map.keySet();
//        System.out.println(set);
//       // map.put(1,3);
//       // map.putIfAbsent(1,3);
//
//        System.out.println(map.get(1));
//        System.out.println(map);


//        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put(3,12);
//        linkedHashMap.put(2,22);
//        linkedHashMap.put(1,32);
//
//        System.out.println(linkedHashMap);


        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(31,12);
        treeMap.put(2,22);
        treeMap.put(11,32);
        System.out.println(treeMap);

        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.navigableKeySet());

        Integer o = (Integer) List.of(treeMap.keySet().toArray()).get(1);

        System.out.println(treeMap.get(o));



    }
}
