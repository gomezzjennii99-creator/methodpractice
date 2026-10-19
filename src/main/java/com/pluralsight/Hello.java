package com.pluralsight;

public class Hello {
    //create main method because that's where all our code runs
    public static void main (String[] args){
        sayHello();
        sayGoodbye();
        sayGoodMorning();
    }

    //other methods are going to be here


    //1. make a method called sayHello that prints hello world
    public static void sayHello(){
        System.out.print("Hello World");
    }
    public static void sayGoodbye() {
        System.out.print("Goodbye!");
    }
    public static void sayGoodMorning() {
        System.out.print("Good Morning");
    }






}
