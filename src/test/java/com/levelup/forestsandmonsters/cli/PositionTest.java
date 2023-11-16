package com.levelup.forestsandmonsters.cli;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.awt.Point;
import org.junit.Test;

public class PositionTest {
    @Test
    public void positionNotNull() {
        Position position = new Position(0,0);
        assertNotNull(position.getPosition());
    }

    @Test
    public void positionSetterTest() {
        Position position = new Position();
        position.setCharacterPosition(5,5);

        Point coordinates = new Point(5,5);
        assertEquals(position.xCoordinates,coordinates.x);
        assertEquals(position.yCoordinates,coordinates.y);
    }

    @Test
    public void xCoordinatesOver9() {
        Position position = new Position(10, 0);
        assertFalse(position.isValid());
    }
    @Test
    public void negativeXCoordinates() {
        Position position = new Position(-33, 9);
        assertFalse(position.isValid());
    }
    @Test
    public void yCoordinatesOver9() {
        Position position = new Position(8, 11);
        assertFalse(position.isValid());
    }
    @Test
    public void negativeYCoordinates() {
        Position position = new Position(1, -6);
        assertFalse(position.isValid());
    }
    @Test
    public void invalidXAndYCoordinates() {
        Position position = new Position(-123, 33);
        assertFalse(position.isValid());
    }
}
