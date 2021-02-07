package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBoss(700, 50, "Lucy");
        System.out.println("Здоровье босса:" + boss.getHealthOfBoss() + ", Урон босса:"
                + boss.getDamageBoss() + ", Тип зашиты босса: " + boss.getProtectionTypeBoss());
        System.out.println("__________________________");
        for (Hero infoHero: createHeroes()) {
            System.out.println("Здоровье:" + infoHero.getHealthOfHeroes() + ", Урон:"
                    + infoHero.getHeroDamage() + ", Супер способность: " + infoHero.getSuperpower());
        }
    }

   public static Hero[] createHeroes() {
       Hero hero = new Hero(250,15,"Lucy");
       Hero hero1 = new Hero(250,20);
       Hero hero2 = new Hero(300,25,"Thor");
       Hero [] a = {hero, hero1, hero2};
        return a;
    }
}