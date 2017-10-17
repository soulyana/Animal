package me.soulyana;

public class Fish extends Animal {
    private String name;

    public Fish() {
        System.out.println("A fish is hatched...");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String eat() {
        return "A fish eats fish pellets!";
    }

    @Override
    public String sleep() {
        return "A fish sleeps soundly with his schoolmates";
    }

    public String swim() {
        return "swims fast!";
    }
}
