package rougelikeclasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WorldMapTest {

    Character character = new Character("Bob");
    Creature character2 = new Creature("Bobby", 250, 250, 100, 10);
    WorldMap worldMap = new WorldMap(character2,1000,1000);
    WorldMap worldMap2 = new WorldMap(character2,1000,500);
    Creature creature = new Creature("Enemy",5,5, 5 ,5);

    @Test
    @DisplayName("Create world map larger than maximum size")
    public void testCreateOversizedWorldMap(){
        assertThrows(IllegalArgumentException.class, () -> { WorldMap worldMap = new WorldMap(character2,1001,1001); });
    }

    @Test
    @DisplayName("Test Map Array")
    public void testMapArray(){
        assertEquals(1000, worldMap.map.length);
        assertEquals(1000, worldMap.map[0].length);
        assertEquals(500, worldMap2.map[0].length);



    }

    @Test
    @DisplayName("Test fillmap function")
    public void testFillMap(){
        String type = worldMap.map[500][450].getType();
        assertEquals("Mountain", worldMap.map[0][0].getType());
        assertEquals("Mountain", worldMap.map[999][999].getType());
            assertTrue(type.equals("Grass")||type.equals("Forest")||type.equals("Mountain")||type.equals("Water"));
    }

    @Test
    @DisplayName("Test Map isBlocked")
    public void testMapBlocked(){
        // lägg till test
        worldMap.playerMove(1, 0);
        // assertEquals();
    }

    @Test
    @DisplayName("Test Simulate Combat ")
    public void testSimulateCombat(){
        assertTrue(worldMap.simulateCombat(character,creature));
    }

    @Test
    @DisplayName("Test Health Change in combat")
    public void testHealthInCombat(){
        worldMap.simulateCombat(character,creature);
        assertEquals(95,character.getHealth());
        assertEquals(0,creature.getHealth());
    }








}
