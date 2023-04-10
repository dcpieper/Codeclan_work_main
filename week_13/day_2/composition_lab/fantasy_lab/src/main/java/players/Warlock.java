package players;

import behaviours.IDefend;
import behaviours.ISpell;

public class Warlock extends Mage implements IDefend{
    private ISpell spell;
    public Warlock(String name, int health, IDefend defend, ISpell spell) {
        super(name, health, defend);
        this.spell = spell;
    }
    public int defend(){
        return 2;
    }
}
