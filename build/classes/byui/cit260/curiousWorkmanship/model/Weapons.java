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
public class Weapons {
    
    private double weaponType;
    private double weaponUpgrade;

    public Weapons() {
    }

    
    
    public double getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(double weaponType) {
        this.weaponType = weaponType;
    }

    public double getWeaponUpgrade() {
        return weaponUpgrade;
    }

    public void setWeaponUpgrade(double weaponUpgrade) {
        this.weaponUpgrade = weaponUpgrade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.weaponType) ^ (Double.doubleToLongBits(this.weaponType) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.weaponUpgrade) ^ (Double.doubleToLongBits(this.weaponUpgrade) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Weapons{" + "weaponType=" + weaponType + ", weaponUpgrade=" + weaponUpgrade + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Weapons other = (Weapons) obj;
        if (Double.doubleToLongBits(this.weaponType) != Double.doubleToLongBits(other.weaponType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weaponUpgrade) != Double.doubleToLongBits(other.weaponUpgrade)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
