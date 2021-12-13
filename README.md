# Low-Level-Design-SnakeAndLadders
Snake and Ladder Game low level system design.

REQUIREMENTS:-
► Multiplayer Game

► Customizable Board in terms of snake and ladder placement and Board size

► Customizable in terms of number of dice used

▶ When Game Board loads it should :

A. Load the configured Board size

B. Load the configured snake and ladder

c. Load the configured number of dice

D. Load the number of players who will play the game and all players should be at starting location


EXPLANATION:-
In the class player I gave player name and player Id as input. We can also extend by how many games played by the player,how many games he won,how many games he lost and so on.And we  can also calculate his success rate and rank.
The second class I came up with is Dice class.In this class I declared the number of dice used ,so that I can use any number of dice.I also used rollDice method .The main job of this method is to generate random numbers based on number of dice used.I came up with math.random and multiplied with higher bound and lower bound and added 1 to it.For example if we use 2 dice, lower dice value is  2 and upper dice value is 12.
Next class I came up with is jumperClass.I created this class for both ladder and snake.For ladder start point is less than end point and for snake start point is greater than end point.Next I created a GameBoardclass I added dice because when the gameboard starts to execute the dice should be at ready to roll.I also used Queue DS because the player should have turns to play again. When the first player turn is over then he should be added to the end of the queue inorder to play again.In this way the game can be repeated between the players.I also used another Ds that is map inorder to store the string playerName and current position of the player which is taken as 0 initially.In this class I also used the constructor and passed the parameters like current position,board size and so on.If there are two players left fnally and one won the game then we may not wait for the other player to win.  
This is the summary of the game snake and ladders.
