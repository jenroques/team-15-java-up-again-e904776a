package com.levelup.forestsandmonsters.cli;
import java.awt.Point;


public class Position {
    // decalred an attribute 
    Point coordinates;
    int xCoordinates, yCoordinates;

    // Adding a contructor 
    Position(int xCoordinates, int yCoordinates){
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
        coordinates = new Point(xCoordinates, yCoordinates);
    };

    public Point getPosition() {
        return coordinates;
    }

    public boolean isValid() {
        // if y is valid: when x is between and including 0 and 9 -> return true; if not, return false.
        // if x is valid: when y is between and including 0 and 9 -> return true; if not, return false.
        // if x are y are not valid, return false.
        if((yCoordinates >= 0 && yCoordinates <= 9) && (xCoordinates < 0 || xCoordinates > 9)) {
            return false;
        } else if((xCoordinates >= 0 && xCoordinates <= 9) && (yCoordinates < 0 || yCoordinates > 9)) {
            return false;
        } else if(((xCoordinates < 0 || xCoordinates > 9)) && (yCoordinates < 0 || yCoordinates > 9)) {
            return false;
        } else {
            return true;
        }
    }
}
