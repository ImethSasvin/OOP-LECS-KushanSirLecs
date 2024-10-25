package com.iit.oop.week4.DesignPatterns;

public class Singleton {
    private static Singleton instance;

    private String name;
    private String age;


    private Singleton(){

    }


    /**
     * This method is used to create a single instance of the class
     * @return instance
     */

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(String age){
        this.age = age;
    }
    public String getAge(){
        return age;
    }

    public String toString(){
        return "Name: "+name+" Age: "+age;
    }


}
