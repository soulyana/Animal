package me.soulyana;

public class Monkey extends Animal {
    private String name;

    public Monkey() {
        System.out.println("A monkey is born! Humans are primates too.");
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
        return "A monkey eats banannas!";
    }

    @Override
    public String sleep() {
        return "A monkey sleeps soundly in a tree";
    }

    public String grab() {
        return "sticky fingers! Watch out for your stuff!";
    }

    public String climb() {
        return "Woah! Look at that monkey scale this object like a tree!";
    }
}
