package players;

import behaviours.IWeapon;

public class Barbarian extends Fighter{

    public Barbarian(String name, int health, IWeapon weapon) {
        super(name, health, weapon);
    }

    public String battleShout(){
        return "Arrghh smash smash.";
    }
}
