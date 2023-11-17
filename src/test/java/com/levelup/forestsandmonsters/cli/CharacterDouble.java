package com.levelup.forestsandmonsters.cli;

import java.awt.Point;

public class CharacterDouble extends Character {
String characterName;
Point endingPoint;
int moveCount;

    CharacterDouble(String characterName, Point endingPoint, int moveCount) {
        this.characterName = characterName;
        this.endingPoint = endingPoint;
        this.moveCount = moveCount;
    }

    @Override
    public String getCharacterName() {
        return this.characterName;
    }

    @Override
    public Point getPosition() {
        return this.endingPoint;
    }

    @Override
    public int getMoveCount() {
        return this.moveCount;
    }

}
