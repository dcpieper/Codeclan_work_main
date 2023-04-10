package players;

import behaviours.IWeapon;

public class Dwarf extends Fighter{
    public Dwarf(String name, int health, IWeapon weapon) {
        super(name, health, weapon);
    }

    public String battleShout(){
        return "I like to mine, mine, mine.";
    }
}
