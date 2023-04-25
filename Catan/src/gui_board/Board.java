package gui_board;

import java.awt.*;
import location.LocationJunction;
import trade_bank.TradeBank;
import trade_player.TradePlayer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import dice.Dice;
import gui_menu.BuildingSelectionMenu;
import hand.Hand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// we make the main Board class in which we put everything

public class Board {
	private JFrame f = new JFrame("Catan - Game"); 
	private JPanel turn_Phase_Panel;
	private Dice diceRoll = new Dice();
	private String outputString = new String("");
	private JLabel lblDiceResult = new JLabel(outputString); 
	
	// The constructor class
	public Board() { 
		
		LocationJunction loc = new LocationJunction();
		HashSet<ArrayList<Integer>> cords = loc.getLocationJunction();
		JButton[] buttons = new JButton[cords.size()];
		int count = 0;
		for(ArrayList<Integer> set: cords) {
			ButtonHandler but = new ButtonHandler();
			buttons[count] = new JButton();
			buttons[count].setBounds(set.get(0), set.get(1), 10,10);
			buttons[count].addActionListener(but);
			f.add(buttons[count]);
			count ++;

		};
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
 
	    //TURN PHASE PANEL
	    turn_Phase_Panel = new JPanel();
		turn_Phase_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		turn_Phase_Panel.setBounds(990, 350, 300, 250);

		turn_Phase_Panel.setLayout(null);
		
		
		
		JButton btnDevCard = new JButton("Development card");
		btnDevCard.setBounds(20, 130, 150, 23);
		turn_Phase_Panel.add(btnDevCard);
		
		JButton btnThrowDice = new JButton("Throw dice");
		btnThrowDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleDiceroll();
				}
		});
		btnThrowDice.setBounds(20, 10, 150, 23);
		turn_Phase_Panel.add(btnThrowDice);
		
		JButton btnTradeBank = new JButton("Trade with bank");
		btnTradeBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hand hello = new Hand();
				new TradeBank(hello);
			}
		});
		
		btnTradeBank.setBounds(20, 50, 150, 23);
		turn_Phase_Panel.add(btnTradeBank);
		
		JButton btnBuild = new JButton("Build");
		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				built_elements();
				
			}
		});
		btnBuild.setBounds(20, 170, 150, 23);
		turn_Phase_Panel.add(btnBuild);
		
		JButton btnTradePlayer = new JButton("Trade with player");
		btnTradePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handlePlayerTrade();
			}
			
		});
		btnTradePlayer.setBounds(20, 90, 150, 23);
		turn_Phase_Panel.add(btnTradePlayer);
		
		JLabel lblDiceTitle = new JLabel("Dice result");
		lblDiceTitle.setBounds(190, 10, 90, 23);
		turn_Phase_Panel.add(lblDiceTitle);
		
		lblDiceResult.setBounds(190, 35, 49, 14);
		turn_Phase_Panel.add(lblDiceResult);
		
		JButton btnEndTurn = new JButton("End turn");
		btnEndTurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Likely have to implement a code that calls a method which exits the system and
				// calls another method to process the end of a turn.
				// handleEndTurn();
			}
		});
		btnEndTurn.setBounds(20, 210, 150, 23);
		turn_Phase_Panel.add(btnEndTurn);	
		
		f.add(turn_Phase_Panel);
	    
	     
		//RESOURCE NUMBERS
		//HashMap with resource numbers per location
		HashMap<String, Integer> rNums = new HashMap<String, Integer>();

		// Add keys and values (Position, ResourceNumber) 
		//The numbers in the key represent rows and columns: Pos45 = row 4 and column 5
		rNums.put("Pos22", 6);
		rNums.put("Pos23", 3);
		rNums.put("Pos24", 8);
		rNums.put("Pos32", 2);
		rNums.put("Pos33", 4);
		rNums.put("Pos34", 5);
		rNums.put("Pos35", 10);
		rNums.put("Pos42", 5);
		rNums.put("Pos43", 9);
		rNums.put("Pos45", 6);
		rNums.put("Pos46", 9);
		rNums.put("Pos52", 10);
		rNums.put("Pos53", 11);
		rNums.put("Pos54", 3);
		rNums.put("Pos55", 12);
		rNums.put("Pos62", 8);
		rNums.put("Pos63", 4);
		rNums.put("Pos64", 11);
		
		//adding the resource numbers
        // 2nd row
        JLabel Pos22 = new JLabel();
        Pos22.setBounds(500, 100, 100, 100);
        Pos22.setSize(100, 100);
        Pos22.setHorizontalAlignment(JLabel.CENTER);
        Pos22.setText(Integer.toString(rNums.get("Pos22")));
        f.add(Pos22);
        
      	JLabel Pos23 = new JLabel();
        Pos23.setBounds(600, 100, 100, 100);
        Pos23.setSize(100, 100);
        Pos23.setHorizontalAlignment(JLabel.CENTER);
        Pos23.setText(Integer.toString(rNums.get("Pos23")));
        f.add(Pos23);
        
        JLabel Pos24 = new JLabel();
        Pos24.setBounds(700, 100, 100, 100);
        Pos24.setSize(100, 100);
        Pos24.setHorizontalAlignment(JLabel.CENTER);
        Pos24.setText(Integer.toString(rNums.get("Pos24")));
        f.add(Pos24);
       
        // 3th row
        JLabel Pos32 = new JLabel();
        Pos32.setBounds(450, 175, 100, 100);
        Pos32.setSize(100, 100);
        Pos32.setHorizontalAlignment(JLabel.CENTER);
        Pos32.setText(Integer.toString(rNums.get("Pos32")));
        f.add(Pos32);
        
        JLabel Pos33 = new JLabel();
        Pos33.setBounds(550, 175, 100, 100);
        Pos33.setSize(100, 100);
        Pos33.setHorizontalAlignment(JLabel.CENTER);
        Pos33.setText(Integer.toString(rNums.get("Pos33")));
        f.add(Pos33);
        
        JLabel Pos34 = new JLabel();
        Pos34.setBounds(650, 175, 100, 100);
        Pos34.setSize(100, 100);
        Pos34.setHorizontalAlignment(JLabel.CENTER);
        Pos34.setText(Integer.toString(rNums.get("Pos34")));
        f.add(Pos34);
        
        JLabel Pos35 = new JLabel();
        Pos35.setBounds(750, 175, 100, 100);
        Pos35.setSize(100, 100);
        Pos35.setHorizontalAlignment(JLabel.CENTER);
        Pos35.setText(Integer.toString(rNums.get("Pos35")));
        f.add(Pos35);
               
        // 4th row
        JLabel Pos42 = new JLabel();
        Pos42.setBounds(400, 250, 100, 100);
        Pos42.setSize(100, 100);
        Pos42.setHorizontalAlignment(JLabel.CENTER);
        Pos42.setText(Integer.toString(rNums.get("Pos42")));
        f.add(Pos42);
        
        JLabel Pos43 = new JLabel();
        Pos43.setBounds(500, 250, 100, 100);
        Pos43.setSize(100, 100);
        Pos43.setHorizontalAlignment(JLabel.CENTER);
        Pos43.setText(Integer.toString(rNums.get("Pos43")));
        f.add(Pos43);
        
        JLabel Pos45 = new JLabel();
        Pos45.setBounds(700, 250, 100, 100);
        Pos45.setSize(100, 100);
        Pos45.setHorizontalAlignment(JLabel.CENTER);
        Pos45.setText(Integer.toString(rNums.get("Pos45")));
        f.add(Pos45);
        
        JLabel Pos46 = new JLabel();
        Pos46.setBounds(800, 250, 100, 100);
        Pos46.setSize(100, 100);
        Pos46.setHorizontalAlignment(JLabel.CENTER);
        Pos46.setText(Integer.toString(rNums.get("Pos46")));
        f.add(Pos46);
                 
        // 5th row
        JLabel Pos52 = new JLabel();
        Pos52.setBounds(450, 325, 100, 100);
        Pos52.setSize(100, 100);
        Pos52.setHorizontalAlignment(JLabel.CENTER);
        Pos52.setText(Integer.toString(rNums.get("Pos52")));
        f.add(Pos52);
        
        JLabel Pos53 = new JLabel();
        Pos53.setBounds(550, 325, 100, 100);
        Pos53.setSize(100, 100);
        Pos53.setHorizontalAlignment(JLabel.CENTER);
        Pos53.setText(Integer.toString(rNums.get("Pos53")));
        f.add(Pos53);
        
        JLabel Pos54 = new JLabel();
        Pos54.setBounds(650, 325, 100, 100);
        Pos54.setSize(100, 100);
        Pos54.setHorizontalAlignment(JLabel.CENTER);
        Pos54.setText(Integer.toString(rNums.get("Pos54")));
        f.add(Pos54);
        
        JLabel Pos55 = new JLabel();
        Pos55.setBounds(750, 325, 100, 100);
        Pos55.setSize(100, 100);
        Pos55.setHorizontalAlignment(JLabel.CENTER);
        Pos55.setText(Integer.toString(rNums.get("Pos55")));
        f.add(Pos55);

        //6th row
        JLabel Pos62 = new JLabel();
        Pos62.setBounds(500, 400, 100, 100);
        Pos62.setSize(100, 100);
        Pos62.setHorizontalAlignment(JLabel.CENTER);
        Pos62.setText(Integer.toString(rNums.get("Pos62")));
        f.add(Pos62);
        
        JLabel Pos63 = new JLabel();
        Pos63.setBounds(600, 400, 100, 100);
        Pos63.setSize(100, 100);
        Pos63.setHorizontalAlignment(JLabel.CENTER);
        Pos63.setText(Integer.toString(rNums.get("Pos63")));
        f.add(Pos63);
        
        JLabel Pos64 = new JLabel();
        Pos64.setBounds(700, 400, 100, 100);
        Pos64.setSize(100, 100);
        Pos64.setHorizontalAlignment(JLabel.CENTER);
        Pos64.setText(Integer.toString(rNums.get("Pos64")));
        f.add(Pos64);
        
        JLabel Pos0 = new JLabel();
        Pos0.setBounds(500, 100, 100, 100);
        Pos0.setSize(100, 100);
        Pos0.setHorizontalAlignment(JLabel.CENTER);
        Pos0.setText("");
        f.add(Pos0);
	    
	    
	    
	    
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
	
    //action handlers
    
    //handle the hex buttons
    private class ButtonHandler implements ActionListener{

        @Override

        public void actionPerformed(ActionEvent e){
        	Point cords = ((JButton)e.getSource()).getLocation();
        	int x0 = cords.x;
        	int y0 = cords.y;
        	
            ImageIcon Img_village=new ImageIcon("Images/Building_Village.png");
    		Image imageVillage = Img_village.getImage(); // "transform" it to an Image
    	    Image villageImg = imageVillage.getScaledInstance(30, 30,
    	    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
    	    ImageIcon village = new ImageIcon(villageImg);
        	
        	JLabel Village = new JLabel();
        	Village.setIcon(village);
        	Village.setBounds(5, 5, x0, y0);
        	f.add(Village);
        	
        	SwingUtilities.updateComponentTreeUI(f);
        	
            System.out.println( ((JButton)e.getSource()).getLocation() );
            System.out.println(cords);
            System.out.println(x0);
            System.out.println(y0);
        }
    }
	protected void handleDiceroll () {
		diceRoll.setSum();
		int output = diceRoll.getSum();
		String outputString = Integer.toString(output);
		lblDiceResult.setText(outputString);			
	}
	
     protected void built_elements() {
    	 BuildingSelectionMenu.main(null);
     }
		
    // closing this window closes the board as well
	protected void handlePlayerTrade() {	
		TradePlayer.main(null);	
	} 
	
	// main
    public static void main(String[] args) {  
    new Board();  
    }
}