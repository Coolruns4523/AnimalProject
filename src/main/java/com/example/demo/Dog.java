package com.example.demo;
/*
*All Dogs are Animals but all Animals are not Dogs
 */
public class Dog extends Animal {

    public Dog() {
        super();
        System.out.println("Now I am a Dog!");
    }

    @Override
    public String sleep(){
        return "A dog sleep...";
    }

    @Override
    public String eat(){
        return "A dog eat...";
    }

    public String purr(){
        return "bark...";
    }
}
