package com.company;

public class Boss {
     private int health;
     private int  damage;
     private String Fight;


     public Boss (int health,int damage,String Fight){

         this.health = health;
         this.damage =  damage;
         this.Fight = Fight;
     }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getFight() {
        return Fight;
    }

    public void setFight(String fight) {
        this.Fight = fight;
    }
}
