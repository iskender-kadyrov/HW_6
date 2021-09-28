package com.company;

public class Boss extends GameEntity{
    private String defenceType;
    private Weapon weapon;

    public Boss(int health, int damage, String defenceType) {
        super(health, damage);
        this.defenceType = defenceType;

    }

    public Boss() {
        super();

    }

    public String getDefenceType() {
        return defenceType;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }

//    public String getInfo(){
//        System.out.println("Параметры босса: ");
//        return "Health: " + getHealth() + " Damage: " + getDamage() + "Defence Type: " + getDefenceType();
//    }
}

