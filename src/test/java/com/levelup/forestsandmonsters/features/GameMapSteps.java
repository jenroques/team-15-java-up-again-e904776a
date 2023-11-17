package com.levelup.forestsandmonsters.features;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GameMapSteps {

    GameController testObj;
    
    @Given("the player has created the character")
    public void whenThePlayerCreatesACharacter() {
        testObj = new GameController();
        testObj.createCharacter("Thor");
    }

    @When("the player starts the game")
    public void whenThePlayerStartsTheGame() {
        testObj = new GameController();
        testObj.startGame();
    }

    @Then("the map will have a total of 100 spaces")
    public void theMapWillHave100Spaces() {
        testObj = new GameController();
        testObj.getTotalPositions();
    }
}
