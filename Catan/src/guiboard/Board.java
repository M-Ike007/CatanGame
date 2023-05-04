package guiboard;

import java.io.File;
import java.awt.*;
import location.LocationJunction;
import passivepayout.PassivePayout;
import player.Player;
import player.PlayerColour;
import tradebank.TradeBank;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import cards.*;
import dice.Dice;
import guimenu.BuildingSelectionMenu;
import hand.Hand;
import hand.HandActivePlayer;
import game.TurnManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// we make the main Board class in which we put everything

public class Board {
	private JFrame f = new JFrame("Catan - Game"); 
	private JPanel turn_Phase_Panel;
	private Dice diceRoll = new Dice();
	private String outputString = new String("");
	private JLabel lblDiceResult = new JLabel(outputString); 
	private JLabel TurnTitle = new JLabel();
	private JLabel WhoseTurnIsIt = new JLabel();
	private JPanel p = new JPanel();
	private int round = 1;
	private Player player1 = new Player(new Hand(), PlayerColour.BLUE, "1");
	private Player player2 = new Player(new Hand(), PlayerColour.RED, "2"); 
	private ArrayList<Player> playerList = new ArrayList<>(Arrays.asList(player1, player2));
	private TurnManager manager = new TurnManager(playerList);
	private Player activePlayer = player1;
	private LocationJunction loc = new LocationJunction();
	private HashSet<ArrayList<Integer>> hexCorners = loc.getLocationJunction();		//HashSet with all the coordinates for building
	private JButton[] buttons = new JButton[hexCorners.size()];						//List of JButtons for building
	private JLabel[] labels = new JLabel[hexCorners.size()];						//List of JLabels for building
	private HashMap<Point, Integer> lblCords = new HashMap<Point, Integer>();		//HashMap for labels and location for building
	private TilesNumbers data = new TilesNumbers();
	
	// PREPARING ALL THE IMAGES
    // Wood image loading and preparing 
    ImageIcon wood = loadImageIcon("Images/Tile_Wood.png", 100, 100);
    // brick image loading and preparing 
    ImageIcon brick = loadImageIcon("Images/Tile_Brick.png", 100, 100);
    // Ore image loading and preparing
    ImageIcon ore = loadImageIcon("Images/Tile_Ore.png" , 100, 100);
    // Wool image loading and preparing
    ImageIcon wool = loadImageIcon("Images/Tile_Wool.png" , 100, 100);
    // Wheat image loading and preparing	
    ImageIcon wheat = loadImageIcon("Images/Tile_Wheat.png", 100, 100);    
    // Desert image loading and preparing
    ImageIcon desert = loadImageIcon("Images/Tile_Desert.png", 100, 100);
    // Sea image loading and preparing
    ImageIcon sea = loadImageIcon("Images/Tile_Sea.png" , 100, 100); 
    // Village image loading and preparing
    ImageIcon village = loadImageIcon("Images/Building_Village.png", 25, 25);	    
    // City image loading and preparing
    ImageIcon city = loadImageIcon("Images/Building_City.png", 25, 25);	    
    // Cost image loading and preparing
    ImageIcon cost = loadImageIcon("Images/Cost_Table.jpg", 250, 333);	    
    // Red Village image loading and preparing (player 1)
    ImageIcon Red_Village = loadImageIcon("Images/Village_Red.png", 25, 25);
    // Blue Village image loading and preparing (player 2)
    ImageIcon Blue_Village = loadImageIcon("Images/Village_Blue.png", 25, 25);
    // Card brick image loading and preparing
    ImageIcon card_brick = loadImageIcon("Images/Card_Brick.jpg", 65, 95);
    // Card forest image loading and preparing
    ImageIcon card_forest = loadImageIcon("Images/Card_Forest.jpg", 65, 95);
    // Card ore image loading and preparing
    ImageIcon card_ore = loadImageIcon("Images/Card_Ore.jpg", 65, 95);
    // Card sheep image loading and preparing
    ImageIcon card_sheep = loadImageIcon("Images/Card_Sheep.jpg", 65, 95);
    // Card wheat image loading and preparing
    ImageIcon card_wheat = loadImageIcon("Images/Card_Wheat.jpg", 65, 95);
    // Card invention image loading and preparing
    ImageIcon card_invention = loadImageIcon("Images/Card_Invention.jpg", 65, 95);
 	// Card knight image loading and preparing
    ImageIcon card_knight = loadImageIcon("Images/Card_Knight.jpg", 65, 95);
    // Card monopoly image loading and preparing
    ImageIcon card_monopoly = loadImageIcon("Images/Card_Monopoly.jpg", 65, 95);
    // Card two roads image loading and preparing
    ImageIcon card_two_roads = loadImageIcon("Images/Card_TwoRoads.jpg", 65, 95);
    // Card victory image loading and preparing
    ImageIcon card_victory = loadImageIcon("Images/Card_VP.jpg", 65, 95);
	
	
	// The constructor class
	
	public Board() { 
		manager.setActiveplayer(activePlayer);
		
		// BUTTONS AND LABELS FOR BUILDING
		int count = 0;
		for(ArrayList<Integer> set: hexCorners) {
			ButtonHandler but = new ButtonHandler();
			buttons[count] = new JButton();
			buttons[count].setBounds(set.get(0), set.get(1), 10, 10);
			buttons[count].addActionListener(but);
			f.add(buttons[count]);
			count ++;
		}	
			
		int count2 = 0;
		for(ArrayList<Integer> set: hexCorners) {
			labels[count2] = new JLabel();		
			labels[count2].setBounds(set.get(0),set.get(1), 30, 30);
			f.add(labels[count2]);		
			Point c = new Point(set.get(0),set.get(1));			
			lblCords.put(c,count2);			
			count2 ++;
		}
 
	    // TURN PHASE PANEL
	    turn_Phase_Panel = new JPanel();
		turn_Phase_Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		turn_Phase_Panel.setBounds(997, 350, 300, 250);
		turn_Phase_Panel.setLayout(null);				
		
		JButton btnDevCard = new JButton("Buy DEV card");
		btnDevCard.setBounds(20, 130, 150, 23);
		btnDevCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleBuyDevCard();
				}
			});
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
				handleBankTrade();
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
		
//		JButton btnTradePlayer = new JButton("Trade with player");
		JButton btnTradePlayer = new JButton("Update hand");
		btnTradePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDiceResult.setText("");
				updateActivePlayer();
				lblDiceResult.setText(" ");
			}			
		});		
		btnTradePlayer.setBounds(20, 90, 150, 23);
		turn_Phase_Panel.add(btnTradePlayer);
		
		JLabel lblDiceTitle = new JLabel("Dice result");
		lblDiceTitle.setBounds(188, 10, 90, 23);
		turn_Phase_Panel.add(lblDiceTitle);
		
		lblDiceResult.setBounds(205, 35, 49, 14);
		turn_Phase_Panel.add(lblDiceResult);
		
		JButton btnEndTurn = new JButton("End turn");
		btnEndTurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleEndTurn();
			}

		});
		btnEndTurn.setBounds(20, 210, 150, 23);
		turn_Phase_Panel.add(btnEndTurn);	
		
		f.add(turn_Phase_Panel);
		
		
		//TURN TRACKER
		TurnTitle.setBounds(1020, 565, 140, 120);
		TurnTitle.setHorizontalAlignment(JLabel.CENTER);
		TurnTitle.setFont(new Font("arial", Font.PLAIN, 16));
		TurnTitle.setText("Current turn: "+ round + "/10");
        f.add(TurnTitle);
		
        WhoseTurnIsIt.setBounds(1028, 600, 100, 100);
        WhoseTurnIsIt.setHorizontalAlignment(JLabel.CENTER);
        WhoseTurnIsIt.setText("Player 1");
        WhoseTurnIsIt.setForeground(Color.RED);
        WhoseTurnIsIt.setFont(new Font("arial", Font.PLAIN, 25));
        f.add(WhoseTurnIsIt);
  
	     
		// RESOURCE NUMBERS
        data.setTileNumbers();
        HashMap<String, Integer> rNums = data.getTileNumbers();
		
		// Adding the resource numbers to the frame
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
	    
	    
	    
	    // RESOURCE TILES
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

               
	    // COST TABLE
		JLabel CostCard = new JLabel();
		CostCard.setIcon(cost);
		CostCard.setBounds(1015, 10, 250, 333);
		CostCard.setSize(250, 333);
		f.add(CostCard);
		
		
		// CARDS
		// Brick card
		JLabel BrickCard = new JLabel();
		BrickCard.setIcon(card_brick);
		BrickCard.setBounds(302, 590, 65, 95);
		BrickCard.setSize(65, 95);
		f.add(BrickCard);
		
		// Forest card
		JLabel ForestCard = new JLabel();
		ForestCard.setIcon(card_forest);
		ForestCard.setBounds(372, 590, 65, 95);
		ForestCard.setSize(65, 95);
		f.add(ForestCard);

		// Ore card
		JLabel OreCard = new JLabel();
		OreCard.setIcon(card_ore);
		OreCard.setBounds(442, 590, 65, 95);
		OreCard.setSize(65, 95);
		f.add(OreCard);
		
		// Sheep card
		JLabel SheepCard = new JLabel();
		SheepCard.setIcon(card_sheep);
		SheepCard.setBounds(512, 590, 65, 95);
		SheepCard.setSize(65, 95);
		f.add(SheepCard);
		
		// Wheat card
		JLabel WheatCard = new JLabel();
		WheatCard.setIcon(card_wheat);
		WheatCard.setBounds(582, 590, 65, 95);
		WheatCard.setSize(65, 95);
		f.add(WheatCard);
		
		// Knight card
		JLabel KnightCard = new JLabel();
		KnightCard.setIcon(card_knight);
		KnightCard.setBounds(652, 590, 65, 95);
		KnightCard.setSize(65, 95);
		f.add(KnightCard);
		
		// Invention card
		JLabel InventionCard = new JLabel();
		InventionCard.setIcon(card_invention);
		InventionCard.setBounds(722, 590, 65, 95);
		InventionCard.setSize(65, 95);
		f.add(InventionCard);
		
		// Monopoly card
		JLabel MonopolyCard = new JLabel();
		MonopolyCard.setIcon(card_monopoly);
		MonopolyCard.setBounds(792, 590, 65, 95);
		MonopolyCard.setSize(65, 95);
		f.add(MonopolyCard);
		
		// Two roads card
		JLabel TwoRoadsCard = new JLabel();
		TwoRoadsCard.setIcon(card_two_roads);
		TwoRoadsCard.setBounds(862, 590, 65, 95);
		TwoRoadsCard.setSize(65, 95);
		f.add(TwoRoadsCard);
		
		// Victory card
		JLabel VictoryCard = new JLabel();
		VictoryCard.setIcon(card_victory);
		VictoryCard.setBounds(932, 590, 65, 95);
		VictoryCard.setSize(65, 95);
		f.add(VictoryCard);		
		
		// To fix the problem of the last JLabel location
		JLabel last = new JLabel();
		f.add(last);
		
		updateActivePlayer();
		
		showHouses();
		
		// Settings of the JFrame
        f.setVisible(true);
        f.setResizable(false);
	    f.setSize(1920,1080);  
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	private void showHouses() {
    	labels[1].setIcon(Blue_Village);
    	labels[1].setBounds(795-8,270-12,30,30);
    	
    	labels[9].setIcon(Blue_Village);
    	labels[9].setBounds(545-8,345-12,30,30);
    	
    	labels[11].setIcon(Red_Village);
    	labels[11].setBounds(645-8,195-12,30,30);
    	
    	labels[2].setIcon(Red_Village);
    	labels[2].setBounds(745-8,395-12,30,30);
    	
	}
	
	
	private void updateActivePlayer() {
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		p.setBounds(300, 590, 260, 20);
		p.setLayout(null);

	    p = new HandActivePlayer(activePlayer.getHand(), p).plotHand();
	    f.add(p);
	    p.setVisible(true);
	}
	
	
    // Action handlers
    
    // Handle the build buttons on the board
    private class ButtonHandler implements ActionListener{

        @Override
    
        public void actionPerformed(ActionEvent e){
        	Point buildingCord = ((JButton)e.getSource()).getLocation();
        	int lblNum = lblCords.get(buildingCord);      	
 
        	labels[lblNum].setIcon(village);
        	labels[lblNum].setBounds(buildingCord.x-8,buildingCord.y-12,30,30);

            System.out.println(buildingCord);
            System.out.println(lblCords.get(buildingCord));
        }
    }
    
	protected void handleDiceroll () {		// Handle dice roll
		diceRoll.setSum();
		int output = diceRoll.getSum();
		String outputString = Integer.toString(output);
		lblDiceResult.setText("   ");
		lblDiceResult.setText(outputString);	
		
		PassivePayout payout = new PassivePayout();
		payout.setPayout(diceRoll.getSum(), player1.getHand(), 1);
		payout.setPayout(diceRoll.getSum(), player2.getHand(), 2);
		payout.getPayout();
		updateActivePlayer();
	}
	
    protected void built_elements() {		// Handle building
    	 BuildingSelectionMenu.main(null);
    }
	
	protected void handleBankTrade() {		// Handle bank trading
		new TradeBank(activePlayer.getHand());
	}
	
	/** Loading in a image icon from a file.
	 * @param filePath File from which the icon must be loaded
	 * @param scale1 First scale factor.
	 * @param scale2 Second scale factor.
	 * @return ImageIcon
	 */
	private ImageIcon loadImageIcon(String filePath, 
			int scale1,
			int scale2) {
		File file = new File(filePath);
		if (file.exists()) {
			ImageIcon Img = new ImageIcon(filePath);
			Image image = Img.getImage(); // "transform" it to an Image
		    Image iconImg = image.getScaledInstance(scale1, scale2,
		    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way 
		    ImageIcon icon = new ImageIcon(iconImg);
		    return icon;
		} else {
			String errMsg = filePath + " does not exist.";
			System.out.println(errMsg);
		}
		return null;		
	}
	
	private void handleBuyDevCard() {
		DevCard devCard = new DevCard();
		String drawnCard = devCard.getDevCard();
		devCard.transactDevelopmentCardPurchase(activePlayer.getHand(), drawnCard);
		lblDiceResult.setText("");
		updateActivePlayer();
		lblDiceResult.setText(" ");
	}
	
	private void handleEndTurn() {
		if (round < 10) {
			manager.setTurn();
			activePlayer = manager.getTurn();
			lblDiceResult.setText("");
			updateActivePlayer();
			lblDiceResult.setText(" ");
			WhoseTurnIsIt.setText("Player " + activePlayer.getName());
			round += 1;
			TurnTitle.setText("Current turn: " + round + "/10");
			if (activePlayer.getName() == "1") {
			    WhoseTurnIsIt.setForeground(Color.RED);
			}
			else {
				WhoseTurnIsIt.setForeground(Color.BLUE);
			}
		}
		else {
			f.dispose();
		}
	}
	
}