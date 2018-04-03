package com.example.demo;
/*
*All Birds are Animals but all Animals are not Birds
 */
public class Fish extends Animal{
    public Fish()
    {
        //super();
        System.out.println("A fish is hatched...");
    }

    @Override
    public String sleep(){
        return "A fish sleep...";
    }

    @Override
    public String eat(){
        return "A fish eat...";
    }

    public String swim()
    {
        //Fish can swim but other animals can't so this method
        //is unique to the Fish class
        return "A fish swims...";
    }
}
