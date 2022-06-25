package org.example.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList {

    public static void main(String[] args) {

        List<String> list = new java.util.LinkedList<>();

        list.add("Naman");
        list.add("Sarovar");
        list.add("parivesh");

        int size = list.size();
        System.out.println(size);
        System.out.println("-----------------------");
        System.out.println(list);
        System.out.println("-----------------------");


        /**
         * Iterator Concepts
         */

        //method 1 using forEach
        list.forEach(e -> {
            System.out.println(e);
        });

        // advance for loop/forloop
        for (String e : list) {
            System.out.println(e);
        }

        //Iterator-forward
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Iterator-backward
        ListIterator<String> rItr = list.listIterator(list.size());
        while (rItr.hasPrevious()) {
            System.out.println(rItr.previous());
        }

        /**
         * Operations
         */

        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);//sorting by index
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        List list2 = new java.util.LinkedList<>();
        list2.add("Hello");
        list2.add(true);
        list2.add(5);
        list2.add("World");

        list2.forEach(str -> {
            Class cls = str.getClass();
            if (cls.getName().equals("java.lang.Integer")) {
                System.out.println(str);
            }
        });
    }

}
