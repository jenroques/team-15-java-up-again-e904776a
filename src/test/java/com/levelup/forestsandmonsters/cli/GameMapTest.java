package com.levelup.forestsandmonsters.cli;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMapTest {
    
    @Test
    public void getPositions() {
        GameMap gameMap = new GameMap();

        Position[][] actualPositionArray = gameMap.getPositions();
        Position[][] expectedPositionArray = new Position[10][10];

        assertArrayEquals(expectedPositionArray, actualPositionArray);
    }

    @Test
    public void calculatePositionMovingNorth() {    
        GameMap gameMap = new GameMap();

        Position startingPosition = new Position();
        startingPosition.setCharacterPosition(0,0);

        Position expectedPosition = new Position();
        expectedPosition.setCharacterPosition(0, 1);

        Position actualPosition = gameMap.calculatePosition(startingPosition, DIRECTION.NORTH);

        assertEquals(expectedPosition.xCoordinates, actualPosition.xCoordinates, 0);
        assertEquals(expectedPosition.yCoordinates, actualPosition.yCoordinates, 0);
    }

    @Test 
    public void calculatePositionMovingEast() { 
        GameMap gameMap = new GameMap();

        Position startingPosition = new Position();
        startingPosition.setCharacterPosition(0,0);

        Position expectedPosition = new Position();
        expectedPosition.setCharacterPosition(1, 0);

        Position actualPosition = gameMap.calculatePosition(startingPosition, DIRECTION.EAST);

        assertEquals(expectedPosition.xCoordinates, actualPosition.xCoordinates, 0);
        assertEquals(expectedPosition.yCoordinates, actualPosition.yCoordinates, 0);
    }   

    @Test 
    public void calculatePositionMovingSouth() { 
        GameMap gameMap = new GameMap();

        Position startingPosition = new Position();
        startingPosition.setCharacterPosition(5,7);

        Position expectedPosition = new Position();
        expectedPosition.setCharacterPosition(5, 6);

        Position actualPosition = gameMap.calculatePosition(startingPosition, DIRECTION.SOUTH);

        assertEquals(expectedPosition.xCoordinates, actualPosition.xCoordinates, 0);
        assertEquals(expectedPosition.yCoordinates, actualPosition.yCoordinates, 0);
    }

    @Test 
    public void calculatePositionMovingWest() { 
        GameMap gameMap = new GameMap();

        Position startingPosition = new Position();
        startingPosition.setCharacterPosition(8,3);

        Position expectedPosition = new Position();
        expectedPosition.setCharacterPosition(7, 3);

        Position actualPosition = gameMap.calculatePosition(startingPosition, DIRECTION.WEST);

        assertEquals(expectedPosition.xCoordinates, actualPosition.xCoordinates, 0);
        assertEquals(expectedPosition.yCoordinates, actualPosition.yCoordinates, 0);
    }
}

