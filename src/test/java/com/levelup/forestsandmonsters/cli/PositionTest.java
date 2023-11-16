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
    public void invalidXCoordinates() {
        Position position = new Position(10, 0);
        assertFalse(position.isValid());
    }

}
