package enemies;

import behaviours.IDefend;

public class Orc extends Enemy implements IDefend {
    public Orc(int health) {
        super(health);
    }

    public int defend() {
        return 2;
    }
}
