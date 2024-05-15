package com.sparta.pcw.codesmellsrefactoring;

public class Weapon implements Shootable{
    
    
    private final WeaponType weaponType;
    private final String brand;

    public Weapon(WeaponType type, String brand)
    {
        this.weaponType = type;
        this.brand = brand;
    }

    public String shoot()
    {
        return String.format("%s - %s", weaponType.shoot(), brand);
    }
}
