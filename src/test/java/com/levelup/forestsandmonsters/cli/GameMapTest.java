package com.levelup.forestsandmonsters.cli;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.awt.Point;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController;
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

        Position expectedPosition = new Position(0, 1);

        Position actualPosition = gameMap.calculatePosition(startingPosition, DIRECTION.NORTH);

        assertEquals(expectedPosition, actualPosition);
    }

    @Test 
    public void calculatePositionMovingEast() { 
        GameMap gameMap = new GameMap();

        Position startingPosition = new Position();
        startingPosition.setCharacterPosition(0,0);

        Point expectedPosition = new Point(0, 1);

        Position actualPosition = gameMap.calculatePosition(startingPosition, DIRECTION.EAST);

        assertEquals(expectedPosition, actualPosition);
    }   

    @Test 
    public void calculatePositionMovingSouth() { 
        GameMap gameMap = new GameMap();

        Position startingPosition = new Position();
        startingPosition.setCharacterPosition(0,0);

        Point expectedPosition = new Point(0, 1);

        Position actualPosition = gameMap.calculatePosition(startingPosition, DIRECTION.SOUTH);

        assertEquals(expectedPosition, actualPosition);
    }

    @Test 
    public void calculatePositionMovingWest() { 
        GameMap gameMap = new GameMap();

        Position startingPosition = new Position();
        startingPosition.setCharacterPosition(0,0);

        Position expectedPosition = new Position (0, 1);

        Position actualPosition = gameMap.calculatePosition(startingPosition, DIRECTION.WEST);

        assertEquals(expectedPosition, actualPosition);
    }
}

