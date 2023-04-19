package hand;

// we used this tutorial: https://www.javatpoint.com/java-swing

// These packages are needed for making a Frame
// and *draw* images in that Frame

import java.awt.*;

import javax.swing.JTextField;   

// we make the main Board class in which we put everything (for now!)

public class TempBoardForShowHand extends Canvas{ //extends Canvas is needed to draw, we think   
	private static final long serialVersionUID = 1L; // This is needed, not sure what it is but probably defines some settings regarding these packages
	
	Hand player_hand = new Hand();
	
	public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  //This does something, just leave it 

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
        
        //example card locations
        g.drawImage(Img_card_brick, 320, 590, 65, 95, this);
        g.drawImage(Img_card_forest, 390, 590, 65, 95, this);
        g.drawImage(Img_card_ore, 460, 590, 65, 95, this);
        g.drawImage(Img_card_sheep, 530, 590, 65, 95, this);
        g.drawImage(Img_card_wheat, 600, 590, 65, 95, this);
        
        g.drawImage(Img_card_knight, 670, 590, 65, 95, this);
        g.drawImage(Img_card_invention, 740, 590, 65, 95, this);       
        g.drawImage(Img_card_monopoly, 810, 590, 65, 95, this);
        g.drawImage(Img_card_two_roads, 880, 590, 65, 95, this);
        g.drawImage(Img_card_victory, 950, 590, 65, 95, this);
        
        // ShowHandTextfield(Hand player_hand, String card_class, String card, int x, int y, int width, int height)
        
        
        
    }  

	}