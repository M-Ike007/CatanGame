package gui_board;

import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// we make the main Board class in which we put everything

public class Board {
	private JFrame f = new JFrame("Catan - Game");
	
	// The constructor class
	public Board() {  
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
	    Image costImg = imageCost.getScaledInstance(250, 333,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon cost = new ImageIcon(costImg);
        
	    // Card brick image loading and preparing
        ImageIcon Img_card_brick=new ImageIcon("Images/Card_Brick.jpg");
		Image imageCardBrick = Img_card_brick.getImage(); // "transform" it to an Image
	    Image cardBrickImg = imageCardBrick.getScaledInstance(65, 95,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_brick = new ImageIcon(cardBrickImg);
	    
	    // Card forest image loading and preparing
        ImageIcon Img_card_forest=new ImageIcon("Images/Card_Forest.jpg");
        Image imageCardForest = Img_card_forest.getImage(); // "transform" it to an Image
	    Image cardForestImg = imageCardForest.getScaledInstance(65, 95,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_forest = new ImageIcon(cardForestImg);
	    
	    // Card ore image loading and preparing
        ImageIcon Img_card_ore=new ImageIcon("Images/Card_Ore.jpg");
        Image imageCardOre = Img_card_ore.getImage(); // "transform" it to an Image
	    Image cardOreImg = imageCardOre.getScaledInstance(65, 95,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_ore = new ImageIcon(cardOreImg);
	    
	    // Card sheep image loading and preparing
        ImageIcon Img_card_sheep=new ImageIcon("Images/Card_Sheep.jpg");
        Image imageCardSheep = Img_card_sheep.getImage(); // "transform" it to an Image
	    Image cardSheepImg = imageCardSheep.getScaledInstance(65, 95,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_sheep = new ImageIcon(cardSheepImg);
	    
	    // Card wheat image loading and preparing
        ImageIcon Img_card_wheat=new ImageIcon("Images/Card_Wheat.jpg");
        Image imageCardWheat = Img_card_wheat.getImage(); // "transform" it to an Image
	    Image cardWheatImg = imageCardWheat.getScaledInstance(65, 95,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_wheat = new ImageIcon(cardWheatImg);
	    
	    // Card invention image loading and preparing
        ImageIcon Img_card_invention=new ImageIcon("Images/Card_Invention.jpg");
        Image imageCardInvention = Img_card_invention.getImage(); // "transform" it to an Image
	    Image cardInventionImg = imageCardInvention.getScaledInstance(65, 95,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_invention = new ImageIcon(cardInventionImg);
	    
	 	// Card knight image loading and preparing
        ImageIcon Img_card_knight=new ImageIcon("Images/Card_Knight.jpg");
        Image imageCardKnight = Img_card_knight.getImage(); // "transform" it to an Image
	    Image cardKnightImg = imageCardKnight.getScaledInstance(65, 95,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_knight = new ImageIcon(cardKnightImg);
	    
	    // Card monopoly image loading and preparing
        ImageIcon Img_card_monopoly=new ImageIcon("Images/Card_Monopoly.jpg");
        Image imageCardMonopoly = Img_card_monopoly.getImage(); // "transform" it to an Image
	    Image cardMonopolyImg = imageCardMonopoly.getScaledInstance(65, 95,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_monopoly = new ImageIcon(cardMonopolyImg);
	    
	    // Card two roads image loading and preparing
        ImageIcon Img_card_two_roads=new ImageIcon("Images/Card_TwoRoads.jpg");
        Image imageCardTwoRoads = Img_card_two_roads.getImage(); // "transform" it to an Image
	    Image cardTwoRoadsImg = imageCardTwoRoads.getScaledInstance(65, 95,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_two_roads = new ImageIcon(cardTwoRoadsImg);
	    
	    // Card victory image loading and preparing
        ImageIcon Img_card_victory=new ImageIcon("Images/Card_VP.jpg");
        Image imageCardVictory = Img_card_victory.getImage(); // "transform" it to an Image
	    Image cardVictoryImg = imageCardVictory.getScaledInstance(65, 95,
	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	    ImageIcon card_victory = new ImageIcon(cardVictoryImg);
        
        // Adding the tiles.
        
        //1st row
        JLabel Row1Col1 = new JLabel();
        Row1Col1.setIcon(sea);
        Row1Col1.setBounds(450, 25, 100, 100);
        Row1Col1.setSize(100, 100);
        f.add(Row1Col1);
	    
        JLabel Row1Col2 = new JLabel();
        Row1Col2.setIcon(sea);
        Row1Col2.setBounds(550, 25, 100, 100);
        Row1Col2.setSize(100, 100);
        f.add(Row1Col2);
        
        JLabel Row1Col3 = new JLabel();
        Row1Col3.setIcon(sea);
        Row1Col3.setBounds(650, 25, 100, 100);
        Row1Col3.setSize(100, 100);
        f.add(Row1Col3);

        JLabel Row1Col4 = new JLabel();
        Row1Col4.setIcon(sea);
        Row1Col4.setBounds(750, 25, 100, 100);
        Row1Col4.setSize(100, 100);
        f.add(Row1Col4);

        // 2nd row
        JLabel Row2Col1 = new JLabel();
        Row2Col1.setIcon(sea);
        Row2Col1.setBounds(400, 100, 100, 100);
        Row2Col1.setSize(100, 100);
        f.add(Row2Col1);
		
        JLabel Row2Col2 = new JLabel();
        Row2Col2.setIcon(wood);
        Row2Col2.setBounds(500, 100, 100, 100);
        Row2Col2.setSize(100, 100);
        f.add(Row2Col2);
        
      	JLabel Row2Col3 = new JLabel();
        Row2Col3.setIcon(wool);
        Row2Col3.setBounds(600, 100, 100, 100);
        Row2Col3.setSize(100, 100);
        f.add(Row2Col3);
        
        JLabel Row2Col4 = new JLabel();
        Row2Col4.setIcon(wool);
        Row2Col4.setBounds(700, 100, 100, 100);
        Row2Col4.setSize(100, 100);
        f.add(Row2Col4);
        
        JLabel Row2Col5 = new JLabel();
        Row2Col5.setIcon(sea);
        Row2Col5.setBounds(800, 100, 100, 100);
        Row2Col5.setSize(100, 100);
        f.add(Row2Col5);
       
        // 3th row
        JLabel Row3Col1 = new JLabel();
        Row3Col1.setIcon(sea);
        Row3Col1.setBounds(350, 175, 100, 100);
        Row3Col1.setSize(100, 100);
        f.add(Row3Col1);
        
        JLabel Row3Col2 = new JLabel();
        Row3Col2.setIcon(wheat);
        Row3Col2.setBounds(450, 175, 100, 100);
        Row3Col2.setSize(100, 100);
        f.add(Row3Col2);
        
        JLabel Row3Col3 = new JLabel();
        Row3Col3.setIcon(ore);
        Row3Col3.setBounds(550, 175, 100, 100);
        Row3Col3.setSize(100, 100);
        f.add(Row3Col3);
        
        JLabel Row3Col4 = new JLabel();
        Row3Col4.setIcon(wheat);
        Row3Col4.setBounds(650, 175, 100, 100);
        Row3Col4.setSize(100, 100);
        f.add(Row3Col4);
        
        JLabel Row3Col5 = new JLabel();
        Row3Col5.setIcon(wood);
        Row3Col5.setBounds(750, 175, 100, 100);
        Row3Col5.setSize(100, 100);
        f.add(Row3Col5);
        
        JLabel Row3Col6 = new JLabel();
        Row3Col6.setIcon(sea);
        Row3Col6.setBounds(850, 175, 100, 100);
        Row3Col6.setSize(100, 100);
        f.add(Row3Col6);
              
        // 4th row
        JLabel Row4Col1 = new JLabel();
        Row4Col1.setIcon(sea);
        Row4Col1.setBounds(300, 250, 100, 100);
        Row4Col1.setSize(100, 100);
        f.add(Row4Col1);
        
        JLabel Row4Col2 = new JLabel();
        Row4Col2.setIcon(wood);
        Row4Col2.setBounds(400, 250, 100, 100);
        Row4Col2.setSize(100, 100);
        f.add(Row4Col2);
        
        JLabel Row4Col3 = new JLabel();
        Row4Col3.setIcon(brick);
        Row4Col3.setBounds(500, 250, 100, 100);
        Row4Col3.setSize(100, 100);
        f.add(Row4Col3);
        
        JLabel Row4Col4 = new JLabel();
        Row4Col4.setIcon(desert);
        Row4Col4.setBounds(600, 250, 100, 100);
        Row4Col4.setSize(100, 100);
        f.add(Row4Col4);
        
        JLabel Row4Col5 = new JLabel();
        Row4Col5.setIcon(ore);
        Row4Col5.setBounds(700, 250, 100, 100);
        Row4Col5.setSize(100, 100);
        f.add(Row4Col5);
        
        JLabel Row4Col6 = new JLabel();
        Row4Col6.setIcon(wheat);
        Row4Col6.setBounds(800, 250, 100, 100);
        Row4Col6.setSize(100, 100);
        f.add(Row4Col6);
        
        JLabel Row4Col7 = new JLabel();
        Row4Col7.setIcon(sea);
        Row4Col7.setBounds(900, 250, 100, 100);
        Row4Col7.setSize(100, 100);
        f.add(Row4Col7);
                   
        // 5th row
        JLabel Row5Col1 = new JLabel();
        Row5Col1.setIcon(sea);
        Row5Col1.setBounds(350, 325, 100, 100);
        Row5Col1.setSize(100, 100);
        f.add(Row5Col1);
        
        JLabel Row5Col2 = new JLabel();
        Row5Col2.setIcon(wheat);
        Row5Col2.setBounds(450, 325, 100, 100);
        Row5Col2.setSize(100, 100);
        f.add(Row5Col2);
        
        JLabel Row5Col3 = new JLabel();
        Row5Col3.setIcon(ore);
        Row5Col3.setBounds(550, 325, 100, 100);
        Row5Col3.setSize(100, 100);
        f.add(Row5Col3);
        
        JLabel Row5Col4 = new JLabel();
        Row5Col4.setIcon(wood);
        Row5Col4.setBounds(650, 325, 100, 100);
        Row5Col4.setSize(100, 100);
        f.add(Row5Col4);
        
        JLabel Row5Col5 = new JLabel();
        Row5Col5.setIcon(wool);
        Row5Col5.setBounds(750, 325, 100, 100);
        Row5Col5.setSize(100, 100);
        f.add(Row5Col5);
        
        JLabel Row5Col6 = new JLabel();
        Row5Col6.setIcon(sea);
        Row5Col6.setBounds(850, 325, 100, 100);
        Row5Col6.setSize(100, 100);
        f.add(Row5Col6);

        //6th row
        JLabel Row6Col1 = new JLabel();
        Row6Col1.setIcon(sea);
        Row6Col1.setBounds(400, 400, 100, 100);
        Row6Col1.setSize(100, 100);
        f.add(Row6Col1);
        
        JLabel Row6Col2 = new JLabel();
        Row6Col2.setIcon(brick);
        Row6Col2.setBounds(500, 400, 100, 100);
        Row6Col2.setSize(100, 100);
        f.add(Row6Col2);
        
        JLabel Row6Col3 = new JLabel();
        Row6Col3.setIcon(wool);
        Row6Col3.setBounds(600, 400, 100, 100);
        Row6Col3.setSize(100, 100);
        f.add(Row6Col3);
        
        JLabel Row6Col4 = new JLabel();
        Row6Col4.setIcon(brick);
        Row6Col4.setBounds(700, 400, 100, 100);
        Row6Col4.setSize(100, 100);
        f.add(Row6Col4);
        
        JLabel Row6Col5 = new JLabel();
        Row6Col5.setIcon(sea);
        Row6Col5.setBounds(800, 400, 100, 100);
        Row6Col5.setSize(100, 100);
        f.add(Row6Col5);
              
        //7th row
        JLabel Row7Col1 = new JLabel();
        Row7Col1.setIcon(sea);
        Row7Col1.setBounds(450, 475, 100, 100);
        Row7Col1.setSize(100, 100);
        f.add(Row7Col1);
        
        JLabel Row7Col2 = new JLabel();
        Row7Col2.setIcon(sea);
        Row7Col2.setBounds(550, 475, 100, 100);
        Row7Col2.setSize(100, 100);
        f.add(Row7Col2);
        
        JLabel Row7Col3 = new JLabel();
        Row7Col3.setIcon(sea);
        Row7Col3.setBounds(650, 475, 100, 100);
        Row7Col3.setSize(100, 100);
        f.add(Row7Col3);
        
        JLabel Row7Col4 = new JLabel();
        Row7Col4.setIcon(sea);
        Row7Col4.setBounds(750, 475, 100, 100);
        Row7Col4.setSize(100, 100);
        f.add(Row7Col4);  

	    // Cost card
		JLabel CostCard = new JLabel();
		CostCard.setIcon(cost);
		CostCard.setBounds(1015, 10, 250, 333);
		CostCard.setSize(250, 333);
		f.add(CostCard);
		
		// brick card
		JLabel BrickCard = new JLabel();
		BrickCard.setIcon(card_brick);
		BrickCard.setBounds(320, 590, 65, 95);
		BrickCard.setSize(65, 95);
		f.add(BrickCard);
		
		// forest card
		JLabel ForestCard = new JLabel();
		ForestCard.setIcon(card_forest);
		ForestCard.setBounds(390, 590, 65, 95);
		ForestCard.setSize(65, 95);
		f.add(ForestCard);

		// ore card
		JLabel OreCard = new JLabel();
		OreCard.setIcon(card_ore);
		OreCard.setBounds(460, 590, 65, 95);
		OreCard.setSize(65, 95);
		f.add(OreCard);
		
		// sheep card
		JLabel SheepCard = new JLabel();
		SheepCard.setIcon(card_sheep);
		SheepCard.setBounds(530, 590, 65, 95);
		SheepCard.setSize(65, 95);
		f.add(SheepCard);
		
		// wheat card
		JLabel WheatCard = new JLabel();
		WheatCard.setIcon(card_wheat);
		WheatCard.setBounds(600, 590, 65, 95);
		WheatCard.setSize(65, 95);
		f.add(WheatCard);
		
		// Knight card
		JLabel KnightCard = new JLabel();
		KnightCard.setIcon(card_knight);
		KnightCard.setBounds(670, 590, 65, 95);
		KnightCard.setSize(65, 95);
		f.add(KnightCard);
		
		// Invention card
		JLabel InventionCard = new JLabel();
		InventionCard.setIcon(card_invention);
		InventionCard.setBounds(740, 590, 65, 95);
		InventionCard.setSize(65, 95);
		f.add(InventionCard);
		
		// Monopoly card
		JLabel MonopolyCard = new JLabel();
		MonopolyCard.setIcon(card_monopoly);
		MonopolyCard.setBounds(810, 590, 65, 95);
		MonopolyCard.setSize(65, 95);
		f.add(MonopolyCard);
		
		// Two roads card
		JLabel TwoRoadsCard = new JLabel();
		TwoRoadsCard.setIcon(card_two_roads);
		TwoRoadsCard.setBounds(880, 590, 65, 95);
		TwoRoadsCard.setSize(65, 95);
		f.add(TwoRoadsCard);
		
		// Victory card
		JLabel VictoryCard = new JLabel();
		VictoryCard.setIcon(card_victory);
		VictoryCard.setBounds(950, 590, 65, 95);
		VictoryCard.setSize(65, 95);
		f.add(VictoryCard);
		
		// To fix the problem of the last JLabel location
		JLabel last = new JLabel();
		f.add(last);
		
		// Settings of the JFrame
        f.setVisible(true);
        f.setResizable(false);
	    f.setSize(1920,1080);  
    }
	
    public static void main(String[] args) {  
    new Board();  
    }
}
}