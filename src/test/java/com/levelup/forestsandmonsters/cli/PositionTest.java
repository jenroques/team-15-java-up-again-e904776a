package com.levelup.forestsandmonsters.cli;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import com.levelup.forestsandmonsters.cli.Position;

public class PositionTest {
    @Test
    public void positionNotNull() {
        Position position = new Position(0,0);
        assertNotNull(position.getPosition());
    }

    // @Test
    // public void setPosition() {

    // }

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
