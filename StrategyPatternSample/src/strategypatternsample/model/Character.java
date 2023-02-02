/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypatternsample.model;

import strategypatternsample.behavior.WeaponBehavior;

/**
 *
 * @author ThinhLD
 */
public abstract class Character implements WeaponBehavior {

    WeaponBehavior weaponBehavior = new WeaponBehavior() {
        @Override
        public void useWeapon() {
            System.out.println("Get me a weapon hungry up !");
        }
    };

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public Character() {
    }

    public void fight() {
        System.out.println("Fighting !");
    }

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }
    
}
