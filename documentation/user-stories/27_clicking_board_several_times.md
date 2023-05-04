**ID:** 27

**Title:** Clicking board several times

---

**As a:** Player

**I want to:** Press a button on the board after having pressed on the button already. 

**So that:** a building is built on that location.

**Acceptance criteria:** a building has appeared after pressing the board button.

**Acceptance test:** 
Run the main menu, the code provides a GUI. 
For now, it should show 2 buttons; 'Start game' and 'Game score'. 
Each 2 of these buttons will open a new frame. 
Click the start game button.
This opens a new window where you see the board in the middle with the hexegonal tiles. On the intersections you see four houses of blue and red colors. 
When clicking on an intersection of three tiles, a house for the player is built. A black house appears on the screen on your clicked location. 
Exception: An intersection is a crossing point of three tiles and three tiles only. Building on the intersection of two sea tiles where there is no third tile (on the edge of the board) will not result in a house. A house can never be built there.
