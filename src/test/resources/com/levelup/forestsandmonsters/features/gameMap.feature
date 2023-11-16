Feature: GameMap
![GameMap](images/gameMap.png)

I want to establish the total map spaces and fantasy land play space. 

Scenario Outline:: Establish the Total Map Spaces and Area

    Given the player has created the character 
    When the player starts the game
    Then the map will have a total of 100 spaces
    Examples: 
        | numPositions | 
        | 100 


