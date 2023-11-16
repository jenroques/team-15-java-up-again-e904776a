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
}
