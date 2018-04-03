package com.example.demo;
/*
 *All SaberToothTiger are Animals but all Animals are not SaberToothTiger
 */
public class SaberToothTiger extends Animal {

    public SaberToothTiger() {
        super();
        System.out.println("Now I am a SaberToothTiger!");
    }

    @Override
    public String sleep(){
        return "A saberToothTiger sleep...";
    }

    @Override
    public String eat(){
        return "A saberToothTiger eat...";
    }

    public String hunt(){
        return "hunt...";
    }
}
