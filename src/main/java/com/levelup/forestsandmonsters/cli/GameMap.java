package com.levelup.forestsandmonsters.cli;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMap {
    
    int numPositions = 100;
    
    Position[][] positions = new Position[10][10];
    Position position = new Position();
    Point point = position.getPosition();
    
    public Position[][] getPositions() {
        return this.positions;
    }

    public Boolean isPositionValid(Position coordinates) {
        return coordinates.isValid();
    }

    public Position calculatePosition(Position startingPosition, DIRECTION direction) {
        int x = startingPosition.xCoordinates;
        int y = startingPosition.yCoordinates;

        Position newPosition = new Position(x, y);

        switch (direction) {
            case NORTH:
                newPosition.setCharacterPosition(x, y + 1);
                break;
            case SOUTH:
                newPosition.setCharacterPosition(x, y - 1);
                break;
            case WEST:
                newPosition.setCharacterPosition(x - 1, y);
                break;
            case EAST:
                newPosition.setCharacterPosition(x + 1, y);
                break;
            default:
                break;
        }
        
        return newPosition.isValid() ? newPosition : startingPosition;   
    }

    public int getTotalPositions() {
        return this.numPositions;
    }

}
