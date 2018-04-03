package com.example.demo;
/*
 *All Unicorns are Animals but all Animals are not Unicorn
 */
public class Unicorn extends Animal {

    public Unicorn() {
        super();
        System.out.println("Now I am a Unicorn!");
    }

    @Override
    public String sleep(){
        return "A unicorn sleep...";
    }

    @Override
    public String eat(){
        return "A unicorn eat...";
    }

    public String magical(){
        return "magical...";
    }
}