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

    public Position calculatePosition(Position startingPosition, DIRECTION direction) {
        int x = startingPosition.xCoordinates;
        int y = startingPosition.yCoordinates;

        // if(direction == DIRECTION.NORTH) {
        //     startingPosition.setCharacterPosition(x, y + 1);
        // }
        switch (direction) {
            case NORTH:
                startingPosition.setCharacterPosition(x, y + 1);
                break;
            case SOUTH:
                startingPosition.setCharacterPosition(x, y - 1);
                break;
            case WEST:
                startingPosition.setCharacterPosition(x - 1, y);
                break;
            case EAST:
                startingPosition.setCharacterPosition(x + 1, y);
                break;
            default:
                break;
        }
        

        return startingPosition;
    }
}
