/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Paige
 */
public class Inventory {
    
    private double item;
    private double upgradeShip;
    private double upgradeWeapon;
    private double upgradeArmor;
    private double health;

    public Inventory() {
    }
    
    
    
    public double getItem() {
        return item;
    }

    public void setItem(double item) {
        this.item = item;
    }

    public double getUpgradeShip() {
        return upgradeShip;
    }

    public void setUpgradeShip(double upgradeShip) {
        this.upgradeShip = upgradeShip;
    }

    public double getUpgradeWeapon() {
        return upgradeWeapon;
    }

    public void setUpgradeWeapon(double upgradeWeapon) {
        this.upgradeWeapon = upgradeWeapon;
    }

    public double getUpgradeArmor() {
        return upgradeArmor;
    }

    public void setUpgradeArmor(double upgradeArmor) {
        this.upgradeArmor = upgradeArmor;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.item) ^ (Double.doubleToLongBits(this.item) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.upgradeShip) ^ (Double.doubleToLongBits(this.upgradeShip) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.upgradeWeapon) ^ (Double.doubleToLongBits(this.upgradeWeapon) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.upgradeArmor) ^ (Double.doubleToLongBits(this.upgradeArmor) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "item=" + item + ", upgradeShip=" + upgradeShip + ", upgradeWeapon=" + upgradeWeapon + ", upgradeArmor=" + upgradeArmor + ", health=" + health + '}';
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.item) != Double.doubleToLongBits(other.item)) {
            return false;
        }
        if (Double.doubleToLongBits(this.upgradeShip) != Double.doubleToLongBits(other.upgradeShip)) {
            return false;
        }
        if (Double.doubleToLongBits(this.upgradeWeapon) != Double.doubleToLongBits(other.upgradeWeapon)) {
            return false;
        }
        if (Double.doubleToLongBits(this.upgradeArmor) != Double.doubleToLongBits(other.upgradeArmor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        return true;
    }
    
    
    
}
