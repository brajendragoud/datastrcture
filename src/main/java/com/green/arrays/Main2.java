package com.green.arrays;

class Animal1 {
    String name = "animal";
}


class Dog2 extends Animal1 {
    String name = "Dog";
}


public class Main2 {
    public static void main(String[] args) {
        Animal1 animal = new Dog2();
        Dog2 dog = new Dog2();
//        Dog2 dog2 = (Dog2) new Animal1(); 
        System.out.println("Animal name :" + animal.name);
        System.out.println("Dog name :" + dog.name);

//        System.out.println("Dog2 name: "+dog2.name);
    }
}
