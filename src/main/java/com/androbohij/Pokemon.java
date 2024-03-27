package com.androbohij;

public class Pokemon {

    private String name;
    private int health;
    private int damage;
    private int level;
    
    /**
     * @param name the name of the pokemon
     * @param health the health of the pokemon
     * @param damage the damage the pokemon deals
     * @param level the level of the pokemon
     */
    public Pokemon(String name, int health, int damage, int level) {
        this.name = name;
        if (health < 1)
            this.health = 1;
        else
            this.health = health;
        this.damage = damage;
        this.level = level;
    }

    /**
     * @param name the name of the pokemon
     */
    public Pokemon(String name) {
        this.name = name;
        health = 25;
        damage = 5;
        level = 1;
    }

    /**
     * @return pokemon's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return pokemon's health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @return pokemon's damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @return pokemon's level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param health value to set the pokemon's health to
     */
    public void setHealth(int health) {
        this.health = health;
    }

}
