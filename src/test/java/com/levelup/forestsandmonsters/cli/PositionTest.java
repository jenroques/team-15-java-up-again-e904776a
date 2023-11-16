package com.levelup.forestsandmonsters.cli;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController;

public class PositionTest {
    @Test
    public void positionNotNull() {
        Position position = new Position(0,0);
        assertNotNull(position.getPosition());
    }
}
