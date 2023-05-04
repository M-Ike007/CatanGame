**ID:** 28

**Title:** Switch Turn

---

*As a:* user

*I want to:* be able to end my turn.

*So that:* the next player can do their turn


*Acceptance criteria:* I click a button and I see that the current player is now somebody else than me. I want to see on which turn I am currently on when it is my turn.

*Acceptance test:* 
Run the main menu, the codes provides a GUI. 
For now, it should show 2 buttons; 'Start game' and 'Game score'. 
Each 2 of these buttons will open a new frame. 
Click the start game button.
This opens a new window where you see the board, the cost card, your current hand with cards and six buttons. In the bottom right you see "current turn: 1/10" and "player 1" in red.
This means that it is currently player 1 their turn. This game is for 2 players so discuss with your opponent who can start. This person is automatically player 1. The game always starts with player 1. If player 1 has finished their turn, look for the button "End Turn" at the bottom of a row of buttons. 
By pressing this button, we see some elements change: current turn changed to 2/10 and the "player 1" in red changed to player 2 in blue. This means we are currently in the second turn and it is currently also player 2 their turn. 
