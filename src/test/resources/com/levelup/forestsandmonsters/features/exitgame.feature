Feature: ExitGame
![Gamer](images/gamerErin.png)

I want to exit the game and receive information about game play including start position, ending position and total move count.

Scenario Outline:: Show user game stats 

    Given player exits the game
    When the final screen displays
    Then the Game stats are displayed as <startingPositionX> , <startingPositionY> , <endingPositionX> , <endingPositionY> , <endingMoveCount>
    Examples:
        | startingPositionX | startingPositionY | endingPositionX | endingPositionY | endingMoveCount
        | "0"               | "0"               |"5"              |"9"              | 79
        | "0"               | "0"               |"8"              |"0"              | 286

