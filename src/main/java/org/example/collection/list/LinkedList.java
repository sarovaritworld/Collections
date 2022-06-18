package org.example.collection.list;

import java.util.*;

public class LinkedList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("India");
        list.add("Norway");
        list.add("Norway"); // Duplicates allowed
        list.add("Sweden");
        list.add("NY");
        list.add(null); // null allowed

        //print entire list
        System.out.println(list);//Insertion order maintained

        int size = list.size();
        System.out.println(size);

        //traversing list
            //Iterator
            Iterator itr = list.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }

            //for loop
            for(String str : list){
                System.out.println(str);
            }

            //ForEach
            list.forEach(e ->{
                System.out.println(e.toUpperCase());
            });


            //ListIterator - HW

    }
}


