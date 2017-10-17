package me.soulyana;

public class SaberToothTiger extends Animal {
    private String name;

    public SaberToothTiger() {
        System.out.println("A saber tooth tiger is generated at Umberalla Corp.");
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
        return "A saber tooth tiger eats the flesh of its enemies!";
    }

    @Override
    public String sleep() {
        return "A saber tooth tiger doesnt sleep. Ever watchful for intruders.";
    }

    public String attack() {
        return "CLAWED TO DEATH!";
    }

    public String roar() {
        return "ROOOOOAAAAAARRRRRRR!";
    }
}
