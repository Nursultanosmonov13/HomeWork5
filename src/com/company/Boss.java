package com.company;

public class Boss {
    private int healthOfBoss;   //здоровье босса
    private int damageBoss;     // урон босса
    private String protectionTypeBoss;        // тип защиты

    public Boss() {
    }

    public void setBoss(int healthOfBoss, int damageBoss, String protectionTypeBoss) {
        this.healthOfBoss = healthOfBoss;
        this.damageBoss = damageBoss;
        this.protectionTypeBoss = protectionTypeBoss;
    }

    public int getHealthOfBoss() {//здоровье босса
        return healthOfBoss;
    }

    public int getDamageBoss() { // урон босса
        return damageBoss;
    }

    public String getProtectionTypeBoss() { // тип защиты
        return protectionTypeBoss;
    }
}