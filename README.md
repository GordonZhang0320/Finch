# Purpose
This project is dedicated to the game Monopoly. When it is a player's turn, a `Finch` robot will carry two 3D printed dice for that player along the black line on the edge of the Monopoly board.

# Benefits
The benefit of this is that it prevents the dice from falling to the floor, so that the player may need to spend a lot of time picking up the dice.

# Logic
Every time a player rotates the dice on the `Finch` robot, the number on the dice is the sum of the number of steps the player has to move forward. After the player has completed all the operations, the robot can be told that it is the next player's turn by tapping the `Button A` of the `Finch` robot, and then move in the direction of the next player. While the robot is stopping, the player may also press `Button B` to told the robot that one player is eliminated. 

# Improvement
Some possible improvements are:
 - Change the program such that the player doesn't have to mannually rotate the robot if some players is eliminated
 - Choose different color to represent different player instead of note
 - Creat a `Player` class, so depends on how many time the `Button B` is pressed, the program eliminate the corresponding `Player`
 - Modify the code so when there is only two player, it turns 180 degrees instead of 90.
