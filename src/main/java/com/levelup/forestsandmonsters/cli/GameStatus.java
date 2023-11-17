package com.levelup.forestsandmonsters.cli;

import java.awt.Point;

public class GameStatus {
    String characterName;
    Point startingPoint, endingPoint;
    int moveCount;
    Point coordinates;

    GameStatus(Character character) {
        this.characterName = character.getCharacterName();
        this.startingPoint = new Point(0,0);
        this.endingPoint = character.getPosition();
        this.moveCount = character.getMoveCount();
    }

    @Override
    public String toString() {
        return "Congrats " + this.characterName + "! You've survived the Level Up forest!\nYou made " 
        + this.moveCount + " moves, starting at (0,0) and ending at " 
        + "(" + this.endingPoint.x + "," + this.endingPoint.y + ").";
    }
}
