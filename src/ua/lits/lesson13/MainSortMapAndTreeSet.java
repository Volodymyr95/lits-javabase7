package ua.lits.lesson13;

import java.util.*;

public class MainSortMapAndTreeSet {
    Comparator<User> comparator = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.getLastname().compareTo(o2.getLastname());
        }
    };

    Comparator<User> comp = (o1, o2) -> o1.getLastname().compareTo(o2.getLastname());

    Set<User> one = new TreeSet<>(comparator);
    Set<User> two = new TreeSet<>(Comparator.comparing(user -> user.getLastname()));
    Set<User> three = new TreeSet<>(Comparator.comparing(User::getLastname));
    Set<User> four = new TreeSet<>(comp);

    Comparator<String> comparatorForMap = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {

            return o1.compareTo(o2);
        }
    };

    SortedMap<String, User> sortedMap = new TreeMap<>(comparatorForMap);


    private class User {
        private String name;
        private String lastname;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
    }
}
