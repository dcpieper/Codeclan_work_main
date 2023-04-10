package Spells;

import behaviours.ISpell;

public class Curse implements ISpell {

    public String cast(){
        return "You are cursed, zappy zap.";
    }

    public int damage(){
        return 10;
    }
}
