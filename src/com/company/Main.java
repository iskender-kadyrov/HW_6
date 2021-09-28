package com.company;

public class Main {


    public static void main(String[] args) {
        Boss boss = new Boss();
        Weapon weapon = new Weapon("Physical","Sword");
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenceType("");
        boss.setWeapon(weapon);
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss defence type: " + boss.getDefenceType());
        System.out.println("Boss weapon name: " + boss.getWeapon().getWeaponName());
        System.out.println("Boss weapon type: " + boss.getWeapon().getWeaponType());

    }
}

