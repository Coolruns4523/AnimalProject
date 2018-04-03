package com.example.demo;
/*
 *All Monkeys are Animals but all Animals are not Monkeys
 */
public class Monkey extends Animal {

    public Monkey() {
        super();
        System.out.println("Now I am a Monkey!");
    }

    @Override
    public String sleep(){
        return "A monkey sleep...";
    }

    @Override
    public String eat(){
        return "A monkey eat...";
    }

    public String swing(){
        return "swing...";
    }
}