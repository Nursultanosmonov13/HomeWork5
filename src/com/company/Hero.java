package com.company;

public class Hero {
    private int healthOfHeroes; //здоровье героев
    private int heroDamage; // урон героев
    private String superpower; // Супер сила героев
    //public int test;

    public Hero(int healthOfHeroes, int heroDamage, String superpower) {
        this.healthOfHeroes = healthOfHeroes;
        this.heroDamage = heroDamage;
        this.superpower = superpower;
    }
    public  Hero(){};
    public Hero(int healthOfHeroes, int heroDamage) {
        this.healthOfHeroes = healthOfHeroes;
        this.heroDamage = heroDamage;
    }

    public void setHealthOfHeroes(int healthOfHeroes) {
        this.healthOfHeroes = healthOfHeroes;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }


    public int getHealthOfHeroes() {
        return healthOfHeroes;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getSuperpower() {
        return superpower;
    }
}
