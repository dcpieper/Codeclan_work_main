package weapons;

import behaviours.IWeapon;

public class Spear implements IWeapon {

    public String attack() {
        return "Pokey poke!";
    }

    public int damage() {
        return 15;
    }
}
