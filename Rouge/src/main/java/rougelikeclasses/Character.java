package rougelikeclasses;

public class Character {

    private String name;
    private Creature player;

    final int maxHealth = 100;
    private int health;
    private int velocity;
    private int strength = 5;

    public Character(String name) {
        this.name = name;
        this.health = this.maxHealth;
        this.velocity = 5;
        this.player = new Creature(name, 250, 250, health, strength);
    }

    public int getHealth() {
        return health;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getStrength(){
        return strength;
    }

    public void setHealth(int newHealth) {
        health = newHealth;
        if(newHealth>maxHealth)
            health = maxHealth;
        if(newHealth<0)
            health=0;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void addHealth(int healthToBeAdded) {
        health = Math.abs(health + healthToBeAdded);
        if(health>100)
            health = 100;
    }

    public void subtractHealth(int healthToBeSubtracted) {
        health = health - Math.abs(healthToBeSubtracted);
    }

    public Creature getPlayer() {
        return player;
    }
}
