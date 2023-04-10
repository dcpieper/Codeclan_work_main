package players;

import behaviours.IDefend;
import behaviours.ISpell;

public class Wizard extends Mage{
    private ISpell spell;
    public Wizard(String name, int health, IDefend defend, ISpell spell) {
        super(name, health, defend);
        this.spell = spell;
    }
}
