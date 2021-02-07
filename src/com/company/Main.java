package com.company;

public class Main {

    public static void main(String[] args) {

        Hero h1 = new Hero(100, 50, "Fire");
        System.out.println(h1.getHealth() + " " + h1.getDamage() + " " + h1.getMagic());


        Hero h2 = new Hero(22, 55);

        System.out.println(h2.getHealth() + " " + h2.getDamage());


        Boss B1 = new Boss(100, 50, "beat");


        System.out.println( B1.getHealth() + " " + B1.getDamage() + " " + B1.getFight());

        B1.setHealth(150);
        B1.setDamage(30);
        B1.setFight("Beat");
        System.out.println("Сеттеры" + " " + B1.getHealth() + " " + B1.getDamage() + " " + B1.getFight());







   }





















}

/*

 Создать класс Героя (Hero), с приватными полями здоровье, урон и
суперспособность. Написать 2 разных конструктора для создания объекта. В
одном конструкторе задаются все поля, в другом только здоровье и урон. Добавить
в класс Hero геттеры для всех полей.


Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
Добавить в класс геттеры и сеттеры для всех полей.


● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
полям). Затем распечатать всю информацию о боссе.

 */
