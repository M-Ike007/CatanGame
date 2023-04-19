package board;

// we used this tutorial: https://www.javatpoint.com/java-swing

// These packages are needed for making a Frame
// and *draw* images in that Frame

import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// we make the main Board class in which we put everything (for now!)

public class NewBoard { //extends Canvas is needed to draw, we think   
	private JFrame f = new JFrame("Catan - Game");
	
	// The constructor class
	public NewBoard() {  
		//JFrame frame = new JFrame();
		//JPanel panel = new JPanel();
		
		// Brick image loading and preparing
		ImageIcon Img_brick=new ImageIcon("Images/Tile_Brick.png");
		Image imageBrick = Img_brick.getImage(); // "transform" it to an Image
	    Image brickImg = imageBrick.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon brick = new ImageIcon(brickImg);
	    
	    // Wood image loading and preparing
        ImageIcon Img_wood=new ImageIcon("Images/Tile_Wood.png");
		Image imageWood = Img_wood.getImage(); // "transform" it to an Image
	    Image woodImg = imageWood.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon wood = new ImageIcon(woodImg);
	    
	    // Ore image loading and preparing
        ImageIcon Img_ore=new ImageIcon("Images/Tile_Ore.png");
		Image imageOre = Img_ore.getImage(); // "transform" it to an Image
	    Image oreImg = imageOre.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon ore = new ImageIcon(oreImg);
	    
	    // Wool image loading and preparing
        ImageIcon Img_wool=new ImageIcon("Images/Tile_Wool.png");
		Image imageWool = Img_wool.getImage(); // "transform" it to an Image
	    Image woolImg = imageWool.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon wool = new ImageIcon(woolImg);
	    
	    // Wheat image loading and preparing	
        ImageIcon Img_wheat=new ImageIcon("Images/Tile_Wheat.png");
		Image imageWheat = Img_wheat.getImage(); // "transform" it to an Image
	    Image wheatImg = imageWheat.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon wheat = new ImageIcon(wheatImg);
	    
	    // Desert image loading and preparing
        ImageIcon Img_desert=new ImageIcon("Images/Tile_Desert.png");
		Image imageDesert = Img_desert.getImage(); // "transform" it to an Image
	    Image desertImg = imageDesert.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon desert = new ImageIcon(desertImg);

        // Sea image loading and preparing
        ImageIcon Img_sea=new ImageIcon("Images/Tile_Sea.png");
        Image imageSea = Img_sea.getImage(); // "transform" it to an Image
	    Image seaImg = imageSea.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon sea = new ImageIcon(seaImg);
	    
	    // Village image loading and preparing
        ImageIcon Img_village=new ImageIcon("Images/Building_Village.png");
		Image imageVillage = Img_village.getImage(); // "transform" it to an Image
	    Image villageImg = imageVillage.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon village = new ImageIcon(villageImg);
	    
	    // City image loading and preparing
        ImageIcon Img_city=new ImageIcon("Images/Building_City.png");
		Image imageCity = Img_city.getImage(); // "transform" it to an Image
	    Image cityImg = imageCity.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon city = new ImageIcon(cityImg);
	    
	    // Cost image loading and preparing
        ImageIcon Img_cost=new ImageIcon("Images/Cost_Table.jpg");
		Image imageCost = Img_cost.getImage(); // "transform" it to an Image
	    Image costImg = imageCost.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon cost = new ImageIcon(costImg);
        
	    // Card brick image loading and preparing
        ImageIcon Img_card_brick=new ImageIcon("Images/Card_Brick.jpg");
		Image imageCardBrick = Img_card_brick.getImage(); // "transform" it to an Image
	    Image cardBrickImg = imageCardBrick.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_brick = new ImageIcon(cardBrickImg);
	    
	    // Card forest image loading and preparing
        ImageIcon Img_card_forest=new ImageIcon("Images/Card_Forest.jpg");
        Image imageCardForest = Img_card_forest.getImage(); // "transform" it to an Image
	    Image cardForestImg = imageCardForest.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_forest = new ImageIcon(cardForestImg);
	    
	    // Card ore image loading and preparing
        ImageIcon Img_card_ore=new ImageIcon("Images/Card_Ore.jpg");
        Image imageCardOre = Img_card_ore.getImage(); // "transform" it to an Image
	    Image cardOreImg = imageCardOre.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_ore = new ImageIcon(cardOreImg);
	    
	    // Card sheep image loading and preparing
        ImageIcon Img_card_sheep=new ImageIcon("Images/Card_Sheep.jpg");
        Image imageCardSheep = Img_card_sheep.getImage(); // "transform" it to an Image
	    Image cardSheepImg = imageCardSheep.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_sheep = new ImageIcon(cardSheepImg);
	    
	    // Card wheat image loading and preparing
        ImageIcon Img_card_wheat=new ImageIcon("Images/Card_Wheat.jpg");
        Image imageCardWheat = Img_card_wheat.getImage(); // "transform" it to an Image
	    Image cardWheatImg = imageCardWheat.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_wheat = new ImageIcon(cardWheatImg);
	    
	    // Card invention image loading and preparing
        ImageIcon Img_card_invention=new ImageIcon("Images/Card_Invention.jpg");
        Image imageCardInvention = Img_card_invention.getImage(); // "transform" it to an Image
	    Image cardInventionImg = imageCardInvention.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_invention = new ImageIcon(cardInventionImg);
	    
	 	// Card knight image loading and preparing
        ImageIcon Img_card_knight=new ImageIcon("Images/Card_Knight.jpg");
        Image imageCardKnight = Img_card_knight.getImage(); // "transform" it to an Image
	    Image cardKnightImg = imageCardKnight.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_knight = new ImageIcon(cardKnightImg);
	    
	    // Card monopoly image loading and preparing
        ImageIcon Img_card_monopoly=new ImageIcon("Images/Card_Monopoly.jpg");
        Image imageCardMonopoly = Img_card_monopoly.getImage(); // "transform" it to an Image
	    Image cardMonopolyImg = imageCardMonopoly.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_monopoly = new ImageIcon(cardMonopolyImg);
	    
	    // Card two roads image loading and preparing
        ImageIcon Img_card_two_roads=new ImageIcon("Images/Card_TwoRoads.jpg");
        Image imageCardTwoRoads = Img_card_two_roads.getImage(); // "transform" it to an Image
	    Image cardTwoRoadsImg = imageCardTwoRoads.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_two_roads = new ImageIcon(cardTwoRoadsImg);
	    
	    // Card victory image loading and preparing
        ImageIcon Img_card_victory=new ImageIcon("Images/Card_VP.jpg");
        Image imageCardVictory = Img_card_victory.getImage(); // "transform" it to an Image
	    Image cardVictoryImg = imageCardVictory.getScaledInstance(100, 100,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_victory = new ImageIcon(cardVictoryImg);
        
        //1st row
//        JLabel Row1Col1 = new JLabel();
//        Row1Col1.setIcon(sea);
//        Row1Col1.setBounds(450, 25, 100, 100);
//        Row1Col1.setSize(100, 150);
//        f.add(Row1Col1);
	    
//        g.drawImage(Img_sea, 450, 25, 100, 100, this);
//        g.drawImage(Img_sea, 550, 25, 100, 100, this);
//        g.drawImage(Img_sea, 650, 25, 100, 100, this);
//        g.drawImage(Img_sea, 750, 25, 100, 100, this);
//        
//        // 2nd row
//        g.drawImage(Img_sea, 400, 100, 100, 100, this);
//        g.drawImage(Img_wood, 500, 100, 100, 100, this);
//        g.drawImage(Img_wool, 600, 100, 100, 100, this);
//        g.drawImage(Img_wool, 700, 100, 100, 100, this);
//        g.drawImage(Img_sea, 800, 100, 100, 100, this);
//        
//        // 3th row
//        g.drawImage(Img_sea, 350, 175, 100, 100, this);
//        g.drawImage(Img_wheat, 450, 175, 100, 100, this);
//        g.drawImage(Img_ore, 550, 175, 100, 100, this);
//        g.drawImage(Img_wheat, 650, 175, 100, 100, this);
//        g.drawImage(Img_wood, 750, 175, 100, 100, this);
//        g.drawImage(Img_sea, 850, 175, 100, 100, this);
//        
//        // 4th row
//        g.drawImage(Img_sea, 300, 250, 100, 100, this);
//        g.drawImage(Img_wood, 400, 250, 100, 100, this);
//        g.drawImage(Img_brick, 500, 250, 100, 100, this);
//        g.drawImage(Img_desert, 600, 250, 100, 100, this);
//        g.drawImage(Img_ore, 700, 250, 100, 100, this);
//        g.drawImage(Img_wheat, 800, 250, 100, 100, this);
//        g.drawImage(Img_sea, 900, 250, 100, 100, this);       
//      
//        // 5th row
//        g.drawImage(Img_sea, 350, 325, 100, 100, this);
//        g.drawImage(Img_wheat, 450, 325, 100, 100, this);
//        g.drawImage(Img_ore, 550, 325, 100, 100, this);
//        g.drawImage(Img_wood, 650, 325, 100, 100, this);
//        g.drawImage(Img_wool, 750, 325, 100, 100, this);
//        g.drawImage(Img_sea, 850, 325, 100, 100, this);
//
//        //6th row
//        g.drawImage(Img_sea, 400, 400, 100, 100, this);
//        g.drawImage(Img_brick, 500, 400, 100, 100, this);
//        g.drawImage(Img_wool, 600, 400, 100, 100, this);
//        g.drawImage(Img_brick, 700, 400, 100, 100, this);
//        g.drawImage(Img_sea, 800, 400, 100, 100, this);
//        
//        //7th row
//        g.drawImage(Img_sea, 450, 475, 100, 100, this);
//        g.drawImage(Img_sea, 550, 475, 100, 100, this);
//        g.drawImage(Img_sea, 650, 475, 100, 100, this);
//        g.drawImage(Img_sea, 750, 475, 100, 100, this);
//        
//        
//        //example villages+cities
//        g.drawImage(Img_village, 635, 385, 30, 30, this);
//        g.drawImage(Img_village, 785, 310, 30, 30, this);
//        
//        g.drawImage(Img_city, 685, 160, 30, 30, this);    
//        g.drawImage(Img_city, 435, 235, 30, 30, this);
//        
//        //example cost table
//        g.drawImage(Img_cost, 1015, 10, 250, 333, this);
//        
//        //example card locations
//        g.drawImage(Img_card_brick, 320, 590, 65, 95, this);
//        g.drawImage(Img_card_forest, 390, 590, 65, 95, this);
//        g.drawImage(Img_card_ore, 460, 590, 65, 95, this);
//        g.drawImage(Img_card_sheep, 530, 590, 65, 95, this);
//        g.drawImage(Img_card_wheat, 600, 590, 65, 95, this);
//        g.drawImage(Img_card_invention, 670, 590, 65, 95, this);
//        g.drawImage(Img_card_knight, 740, 590, 65, 95, this);       
//        g.drawImage(Img_card_monopoly, 810, 590, 65, 95, this);
//        g.drawImage(Img_card_two_roads, 880, 590, 65, 95, this);
//        g.drawImage(Img_card_victory, 950, 590, 65, 95, this);
//        
//        
//        //example road
//        Graphics2D g2d = (Graphics2D)g; //We have to create the awesome object first so we can use its methods!
//        Rectangle rect = new Rectangle(560, 160, 30, 30);
//        g2d.rotate(Math.toRadians(25)); 
//        g2d.draw(rect);
//        f.setVisible(true);
//	    f.setSize(300,300);  

//       panel.setVisible(true);
//       panel.repaint();
//       frame.add(panel); 
//	   frame.setSize(300,300);  
//	   frame.setLayout(null);  
//	   frame.setVisible(true);  
    }
}