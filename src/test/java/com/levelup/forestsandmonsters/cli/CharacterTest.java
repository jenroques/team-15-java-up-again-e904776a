package com.levelup.forestsandmonsters.cli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacterTest {
    
    @Test
    public void characterHasName() {
        Character character = new Character("Karen");
        String actual = character.characterName;
        String expected = "Karen";
        assertEquals(expected, actual);
    }
}
