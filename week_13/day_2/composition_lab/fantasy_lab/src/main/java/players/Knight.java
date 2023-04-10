package players;

import behaviours.IWeapon;

public class Knight extends Fighter {

    public Knight(String name, int health, IWeapon weapon) {
        super(name, health, weapon);
    }

    public String battleShout(){
        return "I love princesses.";
    }
}
