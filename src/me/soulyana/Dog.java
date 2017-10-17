package me.soulyana;

public class Dog extends Animal{
    private String name;

    public Dog() {
        //super();
        System.out.println("A dog is born in a litter of puppies!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String eat() {
        return "A dog eats dog food! yum!";
    }

    @Override
    public String sleep() {
        return "A dog sleeps with his owners";
    }

    public String bark() {
        return "WOOF! WOOF!";
    }

    public String sit() {
        return "sits";
    }










}
