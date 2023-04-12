package board;

// we used this tutorial: https://www.javatpoint.com/java-swing

// These packages are needed for making a Frame
// and *draw* images in that Frame

import java.awt.*;  
import javax.swing.JFrame;  
  

// we make the main Board class in which we put everything (for now!)

public class Board extends Canvas{ //extends Canvas is needed to draw, we think   
	private static final long serialVersionUID = 1L; // This is needed, not sure what it is but probably defines some settings regarding these packages
	public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  //This does something, just leave it 
        // with this we define an object as an image and give the file path. The pictures are already in the java project folder
        // Importing images for tiles, cities and cost tables
        Image Img_brick=t.getImage("Images/Tile_Brick.png");  
        Image Img_wood=t.getImage("Images/Tile_Wood.png");
        Image Img_ore=t.getImage("Images/Tile_Ore.png");
        Image Img_wool=t.getImage("Images/Tile_Wool.png");
        Image Img_wheat=t.getImage("Images/Tile_Wheat.png");
        Image Img_desert=t.getImage("Images/Tile_Desert.png");
        Image Img_sea=t.getImage("Images/Tile_Sea.png");
        Image Img_village=t.getImage("Images/Building_Village.png");
        Image Img_city=t.getImage("Images/Building_City.png");
        Image Img_cost=t.getImage("Images/Cost_Table.jpg");
        
        // Importing images for resource and development cards
        Image Img_card_brick=t.getImage("Images/Card_Brick.jpg");
        Image Img_card_forest=t.getImage("Images/Card_Forest.jpg");
        Image Img_card_ore=t.getImage("Images/Card_Ore.jpg");
        Image Img_card_sheep=t.getImage("Images/Card_Sheep.jpg");
        Image Img_card_wheat=t.getImage("Images/Card_Wheat.jpg");
        Image Img_card_invention=t.getImage("Images/Card_Invention.jpg");
        Image Img_card_knight=t.getImage("Images/Card_Knight.jpg");
        Image Img_card_monopoly=t.getImage("Images/Card_Monopoly.jpg");
        Image Img_card_two_roads=t.getImage("Images/Card_TwoRoads.jpg");
        Image Img_card_victory=t.getImage("Images/Card_VP.jpg");
        
        // draw the images: name, x, y, size_x, size_y
        // the location of the tiles currently depends on your screen ratio
        
        //1st row
        g.drawImage(Img_sea, 450, 25, 100, 100, this);
        g.drawImage(Img_sea, 550, 25, 100, 100, this);
        g.drawImage(Img_sea, 650, 25, 100, 100, this);
        g.drawImage(Img_sea, 750, 25, 100, 100, this);
        
        // 2nd row
        g.drawImage(Img_sea, 400, 100, 100, 100, this);
        g.drawImage(Img_wood, 500, 100, 100, 100, this);
        g.drawImage(Img_wool, 600, 100, 100, 100, this);
        g.drawImage(Img_wool, 700, 100, 100, 100, this);
        g.drawImage(Img_sea, 800, 100, 100, 100, this);
        
        // 3th row
        g.drawImage(Img_sea, 350, 175, 100, 100, this);
        g.drawImage(Img_wheat, 450, 175, 100, 100, this);
        g.drawImage(Img_ore, 550, 175, 100, 100, this);
        g.drawImage(Img_wheat, 650, 175, 100, 100, this);
        g.drawImage(Img_wood, 750, 175, 100, 100, this);
        g.drawImage(Img_sea, 850, 175, 100, 100, this);
        
        // 4th row
        g.drawImage(Img_sea, 300, 250, 100, 100, this);
        g.drawImage(Img_wood, 400, 250, 100, 100, this);
        g.drawImage(Img_brick, 500, 250, 100, 100, this);
        g.drawImage(Img_desert, 600, 250, 100, 100, this);
        g.drawImage(Img_ore, 700, 250, 100, 100, this);
        g.drawImage(Img_wheat, 800, 250, 100, 100, this);
        g.drawImage(Img_sea, 900, 250, 100, 100, this);       
      
        // 5th row
        g.drawImage(Img_sea, 350, 325, 100, 100, this);
        g.drawImage(Img_wheat, 450, 325, 100, 100, this);
        g.drawImage(Img_ore, 550, 325, 100, 100, this);
        g.drawImage(Img_wood, 650, 325, 100, 100, this);
        g.drawImage(Img_wool, 750, 325, 100, 100, this);
        g.drawImage(Img_sea, 850, 325, 100, 100, this);

        //6th row
        g.drawImage(Img_sea, 400, 400, 100, 100, this);
        g.drawImage(Img_brick, 500, 400, 100, 100, this);
        g.drawImage(Img_wool, 600, 400, 100, 100, this);
        g.drawImage(Img_brick, 700, 400, 100, 100, this);
        g.drawImage(Img_sea, 800, 400, 100, 100, this);
        
        //7th row
        g.drawImage(Img_sea, 450, 475, 100, 100, this);
        g.drawImage(Img_sea, 550, 475, 100, 100, this);
        g.drawImage(Img_sea, 650, 475, 100, 100, this);
        g.drawImage(Img_sea, 750, 475, 100, 100, this);
        
        
        //example villages+cities
        g.drawImage(Img_village, 635, 385, 30, 30, this);
        g.drawImage(Img_village, 785, 310, 30, 30, this);
        
        g.drawImage(Img_city, 685, 160, 30, 30, this);    
        g.drawImage(Img_city, 435, 235, 30, 30, this);
        
        //example cost table
        g.drawImage(Img_cost, 1015, 10, 250, 333, this);
        
        //example card locations
        g.drawImage(Img_card_brick, 320, 590, 65, 95, this);
        g.drawImage(Img_card_forest, 390, 590, 65, 95, this);
        g.drawImage(Img_card_ore, 460, 590, 65, 95, this);
        g.drawImage(Img_card_sheep, 530, 590, 65, 95, this);
        g.drawImage(Img_card_wheat, 600, 590, 65, 95, this);
        g.drawImage(Img_card_invention, 670, 590, 65, 95, this);
        g.drawImage(Img_card_knight, 740, 590, 65, 95, this);       
        g.drawImage(Img_card_monopoly, 810, 590, 65, 95, this);
        g.drawImage(Img_card_two_roads, 880, 590, 65, 95, this);
        g.drawImage(Img_card_victory, 950, 590, 65, 95, this);
        
        
        //example road
        Graphics2D g2d = (Graphics2D)g; //We have to create the awesome object first so we can use its methods!
        Rectangle rect = new Rectangle(560, 160, 30, 30);
        g2d.rotate(Math.toRadians(25)); 
        g2d.draw(rect);
        
    }  

	}