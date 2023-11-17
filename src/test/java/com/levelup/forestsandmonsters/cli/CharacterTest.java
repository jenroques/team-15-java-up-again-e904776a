package com.levelup.forestsandmonsters.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import java.awt.Point;

import org.junit.Test;

public class CharacterTest {
    
    @Test
    public void characterHasName() {
        Character character = new Character("Karen");
        String actualName = character.characterName;
        String expectedName = "Karen";
        assertEquals(expectedName, actualName);
    }

    @Test
    public void characterHasDefaultNameWhenNoNameIsGiven() {
        Character character = new Character();
        String actualName = character.characterName;
        String expectedName = "Thor";
        assertEquals(expectedName, actualName);
        
    }

     @Test
    public void characterClassGetNameFunctionReturnsSetName() {
        Character character = new Character("Jenny");
        String actualName = character.getCharacterName();
        String expectedName = "Jenny";
        assertEquals(expectedName, actualName);     
    }

    @Test
    public void characterClassGetNameFunctionReturnsDefaultName() {
        Character character2 = new Character();
        String actualName2 = character2.getCharacterName();
        String expectedName2 = "Thor";
        assertEquals(expectedName2, actualName2);
    }

    @Test 
    public void getPosition() {
        Character character = new Character();
        Point actualPoint = character.getPosition();
        Point expectPoint = new Point(0,0);

        assertEquals(expectPoint, actualPoint);
    }
}
