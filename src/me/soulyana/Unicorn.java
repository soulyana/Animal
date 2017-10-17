package me.soulyana;

public class Unicorn extends Animal {
    private String name;

    public Unicorn() {
        System.out.println("Nothing unreal exisits.");
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
        return "A unicorn eats wishes & dreams!";
    }

    @Override
    public String sleep() {
        return "A unicorn magically disappers when asleep";
    }

    public String magical() {
        return "Woah! Magical unicorn at your command!";
    }

    public String fly() {
        return "Up, Up, up & Away!";
    }
}
