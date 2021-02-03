package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBoss(700, 50, "Lucy");
        System.out.println("Здоровье босса:" + boss.getHealthOfBoss() + ", Урон босса:" + boss.getDamageBoss() + ", Тип зашиты босса: " + boss.getProtectionTypeBoss());
        System.out.println("__________________________");
        createHeroes();
    }

    public static void createHeroes() {
        // 1 герой
        Hero heroOne = new Hero(250, 20, "Berserk");
        // 2 герой
        Hero heroTwo = new Hero(230, 25);
        // 3 герой
        Hero heroThree = new Hero(200, 15, "Lucky");
        int[] healthOfHeroes = {heroOne.getHealthOfHeroes(), heroTwo.getHealthOfHeroes(), heroThree.getHealthOfHeroes()};
        int[] heroDamage = {heroOne.getHeroDamage(), heroTwo.getHeroDamage(), heroTwo.getHeroDamage()};
        String[] superpower = {heroOne.getSuperpower(), heroTwo.getSuperpower(), heroThree.getSuperpower()};
        for (int i = 0; i < healthOfHeroes.length; i++) {
            System.out.println("Здоровье:" + healthOfHeroes[i] + ", Урон:" + heroDamage[i] + ", Супер сила героев:" + superpower[i]);


        }



    }
}