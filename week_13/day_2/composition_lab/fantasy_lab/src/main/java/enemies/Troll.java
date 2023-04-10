package enemies;

import behaviours.IDefend;

public class Troll extends Enemy implements IDefend {
    public Troll(int health) {
        super(health);
    }

    public int defend() {
        return 7;
    }
}