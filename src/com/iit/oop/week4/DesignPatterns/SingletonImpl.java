package com.iit.oop.week4.DesignPatterns;

public class SingletonImpl {
    public static void main(String[]args){

        Singleton object1 = Singleton.getInstance();

        object1.setName("John");
        object1.setAge("25");

        System.out.println(object1);
    }
}
