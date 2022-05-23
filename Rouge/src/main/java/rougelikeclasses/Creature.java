package rougelikeclasses;

public class Creature extends Thing {
    private int health;
    private int strength;

    public Creature(String name, int x, int y, int health, int strength) {
        super(name, x, y);
        this.health = health;
        this.strength = strength;
    }

    public void move(int dx, int dy){
        x += dx;
        y += dy;

    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int newHealth) {
        health = newHealth;
    }
    public int getStrength(){
        return strength;
    }
}
