package com.example.demo;

public class AnimalApp {
    public static void main (String[] args)
    {
        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.purr());

        Fish f = new Fish();
        print(f.eat());
        print(f.sleep());
        print(f.swim());

        Monkey m = new Monkey();
        print(m.eat());
        print(m.sleep());
        print(m.swing());

        Unicorn u = new Unicorn();
        print(u.eat());
        print(u.sleep());
        print(u.magical());

        SaberToothTiger s = new SaberToothTiger();
        print(s.eat());
        print(s.sleep());
        print(s.hunt());
    }
    private static void print(String s){
        System.out.println(s);
    }
}
