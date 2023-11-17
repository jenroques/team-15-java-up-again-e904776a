Feature: ExitGame
![Gamer](images/gamerErin.png)

I want to exit the game and receive information about game play including start position, ending position and total move count.

Scenario Outline:: Show user game stats 

    When <characterName> exits the game
    Then the Game stats for <characterName> are displayed as <startingPositionX> , <startingPositionY> , <endingPositionX> , <endingPositionY> , <endingMoveCount>
    Examples:
       characterName | startingPositionX | startingPositionY | endingPositionX | endingPositionY | endingMoveCount
       "Brittany"    | "0"               | "0"               |"5"              |"9"              | 79
        "Renee"      | "0"               | "0"               |"8"              |"0"              | 286

