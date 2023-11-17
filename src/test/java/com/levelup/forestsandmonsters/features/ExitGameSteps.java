package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController;
import com.levelup.forestsandmonsters.GameController.DIRECTION;
import com.levelup.forestsandmonsters.cli.Position;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ExitGameSteps {

    GameController gc;
    String characterName;
    Point coordinates;

    @When("{string} exits the game")
    public void playerExistsGame(String characterName) {
        gc = new GameController();
        gc.exitGame(characterName);
    }

    @Then("the Game stats for {string} are displayed as {int} , {int} , {int} , {int} , {int}")
    public void displayGameStats(String characterName, int startingPositionX, int startingPositionY, int endingPositionX, int endingPositionY, int moveCount) {
        gc = new GameController();
        assertEquals(startingPositionX, coordinates.x);
        assertEquals(startingPositionX, coordinates.y);
        gc.move(DIRECTION.NORTH);
        assertEquals(endingPositionX, gc.getStatus().currentPosition.x);
        assertEquals(endingPositionY, gc.getStatus().currentPosition.y);
        assertEquals(moveCount,gc.getStatus().moveCount);
    }

}
