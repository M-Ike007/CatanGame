package gui_board;

import java.awt.Image;

import javax.swing.ImageIcon;

// imports
//import java.awt.*;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;


/**
 * Class to store 
 * Methods: Select_Junction(): select junction to construct a village or city
 * 			Select_Road(): select tile border to construct a road
 * @author SDH & LAK
 * @param None
 * @return None
 */
//The constructor class
public class Build_Structures {
	
	// Importing village images
	// Red Village image loading and preparing
	ImageIcon Img_village_red=new ImageIcon("Images/Village_Red.png");
	Image imageVillage_Red = Img_village_red.getImage(); // "transform" it to an Image
    Image Red_Village_Img = imageVillage_Red.getScaledInstance(100, 100,
    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
    ImageIcon Red_Village = new ImageIcon(Red_Village_Img);
    
	// White Village image loading and preparing
	ImageIcon Img_village_white=new ImageIcon("Images/Village_White.png");
	Image imageVillage_White = Img_village_white.getImage(); // "transform" it to an Image
    Image White_Village_Img = imageVillage_White.getScaledInstance(100, 100,
    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
    ImageIcon White_Village = new ImageIcon(White_Village_Img);
    
	// Orange Village image loading and preparing
	ImageIcon Img_village_orange=new ImageIcon("Images/Village_Orange.png");
	Image imageVillage_Orange = Img_village_orange.getImage(); // "transform" it to an Image
    Image Orange_Village_Img = imageVillage_Orange.getScaledInstance(100, 100,
    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
    ImageIcon Orange_Village = new ImageIcon(Orange_Village_Img);

	// Blue Village image loading and preparing
	ImageIcon Img_village_blue=new ImageIcon("Images/Village_Blue.png");
	Image imageVillage_Blue = Img_village_blue.getImage(); // "transform" it to an Image
    Image Blue_Village_Img = imageVillage_Blue.getScaledInstance(100, 100,
    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
    ImageIcon Blue_Village = new ImageIcon(Blue_Village_Img);
    
    // Impporting city images
    // Red City image loading and preparing
    ImageIcon Img_city_red=new ImageIcon("Images/Building_City_Red.png");
	Image imageCity_Red = Img_city_red.getImage(); // "transform" it to an Image
	Image Red_City_Img = imageCity_Red.getScaledInstance(100, 100,
 		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	ImageIcon Red_City = new ImageIcon(Red_City_Img);
    
	//White City image loading and preparing
	ImageIcon Img_city_white=new ImageIcon("Images/Building_City_White.png");
	Image imageCity_White = Img_city_white.getImage(); // "transform" it to an Image
	Image White_City_Img = imageCity_White.getScaledInstance(100, 100,
 		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	ImageIcon White_City = new ImageIcon(White_City_Img);
	 
	// Orange City image loading and preparing
	ImageIcon Img_city_orange=new ImageIcon("Images/Building_City_Orange.png");
	Image imageCity_Orange = Img_city_orange.getImage(); // "transform" it to an Image
	Image Orange_City_Img = imageCity_Orange.getScaledInstance(100, 100,
 		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	ImageIcon Orange_City = new ImageIcon(Orange_City_Img);

	// Blue City image loading and preparing
	ImageIcon Img_city_blue=new ImageIcon("Images/Building_City_Blue.png");
	Image imageCity_Blue = Img_city_blue.getImage(); // "transform" it to an Image
	Image Blue_City_Img = imageCity_Blue.getScaledInstance(100, 100,
		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
	ImageIcon Blue_City = new ImageIcon(Blue_City_Img);
    
    // Importing road images
	// Red Village image loading and preparing
	ImageIcon Img_road_red=new ImageIcon("Images/Road_Red.png");
	Image imageRoad_Red = Img_road_red.getImage(); // "transform" it to an Image
    Image Red_Road_Img = imageRoad_Red.getScaledInstance(100, 100,
    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
    ImageIcon Red_Road = new ImageIcon(Red_Road_Img);
    
	// White Village image loading and preparing
	ImageIcon Img_road_white=new ImageIcon("Images/Road_White.png");
	Image imageRoad_White = Img_road_white.getImage(); // "transform" it to an Image
    Image White_Road_Img = imageRoad_White.getScaledInstance(100, 100,
    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
    ImageIcon Road_Village = new ImageIcon(White_Road_Img);
    
	// Orange Village image loading and preparing
	ImageIcon Img_road_orange=new ImageIcon("Images/Road_Orange.png");
	Image imageRoad_Orange = Img_road_orange.getImage(); // "transform" it to an Image
    Image Orange_Road_Img = imageRoad_Orange.getScaledInstance(100, 100,
    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
    ImageIcon Orange_Road = new ImageIcon(Orange_Road_Img);

	// Blue Village image loading and preparing
	ImageIcon Img_road_blue=new ImageIcon("Images/Road_Blue.png");
	Image imageRoad_Blue = Img_road_blue.getImage(); // "transform" it to an Image
    Image Blue_Road_Img = imageRoad_Blue.getScaledInstance(100, 100,
    		java.awt.Image.SCALE_SMOOTH); // scale it the "smooth" way
    ImageIcon Blue_Road = new ImageIcon(Blue_Road_Img);
    
    

}
