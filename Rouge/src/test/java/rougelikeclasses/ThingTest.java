package rougelikeclasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThingTest {

    Thing thing = new Thing("place", 0 , 1);

    @Test
    @DisplayName("Make thing")
    public void testThingExists(){
        assertEquals(null, thing) ;
    }

    @Test
    @DisplayName("Test position")
    public void testPosition() {
        assertEquals("place", thing.getType());
        assertEquals(0, thing.getX());
        assertEquals(1, thing.getY());
    }
}
