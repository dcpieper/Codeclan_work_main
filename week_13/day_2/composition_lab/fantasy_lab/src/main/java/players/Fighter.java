package players;

import behaviours.IWeapon;

public abstract class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }
    public String attack(){
        return this.weapon.attack();
    }
    public int damage(){
        return this.weapon.damage();
    }
}
