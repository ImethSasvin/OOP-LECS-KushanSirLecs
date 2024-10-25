package com.iit.oop.week4.Week5Arrays;

import java.util.ArrayList;

public class CollectionsExample {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<String> list2 =  new ArrayList<String>();


        list1.add(5);
        list1.add(10);
        list1.add(15);
        list1.add(20);
        list1.add(25);


        System.out.println(list1);
        list1.set(3, 30);
        list1.remove(2);

        list2.add("Hello");
        list2.add("World");
        list2.add("Java");
        list2.add("Programming");
        System.out.println("Index of 10 is: "+list1.indexOf(10));



        for(int i= 0; i<list1.size(); i++){
//            System.out.print(list1.get(i)+" ");
            System.out.println(i);
        }

        try{
            System.out.println(list1.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }

        System.out.println();


        System.out.println(list2);





    }
}
