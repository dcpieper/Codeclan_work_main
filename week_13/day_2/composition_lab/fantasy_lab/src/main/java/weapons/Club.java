package weapons;

import behaviours.IWeapon;

public class Club implements IWeapon {
    public String attack() {
        return "Smashy smash!";
    }


    public int damage() {
        return 10;
    }
}
