package Spells;

import behaviours.ISpell;

public class Judgement implements ISpell {
    @Override
    public String cast() {
        return "You have been judged, pew pew.";
    }

    @Override
    public int damage() {
        return 15;
    }
}
