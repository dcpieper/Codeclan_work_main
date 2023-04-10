package weapons;

import behaviours.IWeapon;

public class Sword implements IWeapon {
    public String attack() {
        return "Stabby slice!";
    }
    public int damage() {
        return 20;
    }
}
