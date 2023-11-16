package com.levelup.forestsandmonsters.cli;

import static org.junit.Assert.assertEquals;

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
}
