package me.soulyana;

public class Main {

    public static void main(String[] args) {

        Animal a = new Animal("The overloaded constructor has run");
        a.setName("Yogi Bear");
        System.out.println("The animal is called " + a.getName());
        System.out.println(a.eat());
        System.out.println(a.sleep());


        Animal b = new Animal();
        b.setName("Smokey the Bear");
        System.out.println("The animal is called " + b.getName());
        System.out.println(b.eat());
        System.out.println(b.sleep());

        Dog c = new Dog();
        c.setName("Buna");
        System.out.println("The dog is called " + c.getName());
        System.out.println(c.eat());
        System.out.println(c.sleep());
        System.out.println(c.bark());
        System.out.println(c.sit());



    }
}
