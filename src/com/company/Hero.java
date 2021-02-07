package com.company;

public class Hero {
   //final константа то есть не изменна, если privat значит мы не хотим, что бы ее меняли
   private final int health;
    private final int damage;
    private String magic;


    public Hero(int health, int damage, String magic) {
        this.health = health;
        this.damage = damage;
        this.magic = magic;
    }

    public Hero (int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getMagic() {
        return magic;
    }


}











