package ua.lits.lesson11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {

    public static void main(String[] args) {

//        HashSet<Integer> set = new HashSet<>();
//
//        set.add(1);
//        set.add(1);
//        set.add(1);
//        set.add(1);
//        set.add(1);
//        System.out.println(set);

//        Set<User> userHashSet = new HashSet();
//        userHashSet.add(new User("one"));
//        userHashSet.add(new User("two"));
//        userHashSet.add(new User("three"));
//        userHashSet.add(new User("four"));
//
//        System.out.println("HashSet: " +userHashSet);
//
//        Set<User> userLinkedHashSet = new LinkedHashSet<>();
//        userLinkedHashSet.add(new User("one"));
//        userLinkedHashSet.add(new User("two"));
//        userLinkedHashSet.add(new User("three"));
//        userLinkedHashSet.add(new User("four"));
//
//        System.out.println("LinkedHashSet:" + userLinkedHashSet);


        Set userTreeSet = new TreeSet();
        userTreeSet.add(new User("b"));
        userTreeSet.add(new User("c"));
        userTreeSet.add(new User("x"));
        userTreeSet.add(new User("a"));

        System.out.println("TreeSet:" + userTreeSet);

//TreeSet vs HashSet vs LinkedHashSet


    }
}
