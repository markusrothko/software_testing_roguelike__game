package rougelikeclasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.IllegalFormatException;

public class CharacterTest {
    Character character = new Character("Bob");
    // Tests for health
    //leo

    @Test
    public void testHealthLooseMoreThanMinimum() {
        character.subtractHealth(character.getHealth() + 1);
        assertEquals(-1, character.getHealth());
    }

    @Test
    public void testHealthGainMoreThanMaximum() {
        character.addHealth(character.getHealth() + 1);
        assertEquals(100, character.getHealth());


    }
    @Test
    @DisplayName("Set health above max health")
    public void testSetHealthAboveMaximum(){
        character.setHealth(character.maxHealth +1);
        assertEquals(100, character.getHealth());
    }

    @Test
    @DisplayName("Set health below minimum health")
    public void testSetHealthBelowMinimum(){
        character.setHealth(-105);
        assertEquals(0, character.getHealth());
    }




    @Test
    @DisplayName("Add negative health")
    public void testAddNegativeHealth(){
        character.setHealth(50);
        character.addHealth(-25);
        assertEquals(25, character.getHealth());
    }
    @Test
    @DisplayName("Subtract negative health")
    public void testSubtractNegativeHealth(){
        character.setHealth(50);
        character.subtractHealth(-25);
        assertEquals(25, character.getHealth());
    }



    //noel

    @Test
    public void testSubtractHealth() {
        character.subtractHealth(50);
        assertEquals(50, character.getHealth());
    }

    @Test
    public void testAddHealth() {
        character.setHealth(50);
        character.addHealth(25);
        assertEquals(75, character.getHealth());
    }
    // Tests for velocity

    @Test
    public void testVelocityMoveFasterThanMaxSpeed() {
        character.setVelocity(character.getVelocity() + 1);
        assertEquals(101, character.getVelocity());
    }
    //markus
    // test of DisplayName below

    @Test
    @DisplayName("Test Negative Velocity")
    public void testNegativeVelocity() {
        character.setVelocity(character.getVelocity() - 101);
        assertEquals(-1, character.getVelocity());
    }

    @Test
    public void testZeroVelocity() {
        character.setVelocity(0);
        assertEquals(0, character.getVelocity());
    }
}
