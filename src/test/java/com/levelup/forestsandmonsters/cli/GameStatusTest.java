package com.levelup.forestsandmonsters.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Point;

import org.junit.Test;

public class GameStatusTest {
    @Test
    public void displayGameStats() {
        Point point = new Point(5,5);
        CharacterDouble doubleTest = new CharacterDouble("Renee", point, 205);
       
        GameStatus status = new GameStatus(doubleTest);
        String expectedValue = "Congrats Renee! You've survived the Level Up forest!\nYou made 205 moves, starting at (0,0) and ending at (5,5).";
        String actualValue = status.toString();
        
        assertTrue(expectedValue.equals(actualValue));
    }
}