package com.levelup.forestsandmonsters.cli;

import java.awt.Point;

public class Character {

    public String characterName;
    static final String DEFAULT_NAME = "Thor";

    public Character(String characterName) {
        this.characterName = characterName;
    }

    public Character() {
        this.characterName = DEFAULT_NAME;
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public int getMoveCount() {
        return 0;
    }

    public Point getPosition() {
        return null;
    }
   
}
