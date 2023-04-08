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
        Image Img_brick=t.getImage("TileImages/Tile_Brick.png");  
        Image Img_wood=t.getImage("TileImages/Tile_Wood.png");
        Image Img_ore=t.getImage("TileImages/Tile_Ore.png");
        Image Img_wool=t.getImage("TileImages/Tile_Wool.png");
        Image Img_wheat=t.getImage("TileImages/Tile_Wheat.png");
        Image Img_desert=t.getImage("TileImages/Tile_Desert.png");
        Image Img_sea=t.getImage("TileImages/Tile_Sea.png");
        
        // draw the images: name, x, y, size_x, size_y
        // the location of the tiles currently depends on your screen ratio
        g.drawImage(Img_desert, 600, 250, 100, 100, this);
        g.drawImage(Img_wood, 550, 175, 100, 100, this);
        g.drawImage(Img_brick, 650, 175, 100, 100, this);
        g.drawImage(Img_wool, 550, 325, 100, 100, this);
        g.drawImage(Img_ore, 650, 325, 100, 100, this);
        g.drawImage(Img_wheat, 500, 250, 100, 100, this);
        g.drawImage(Img_wood, 700, 250, 100, 100, this);

          
    }  
		// this generates the board in a JFrame
        public static void main(String[] args) {  
        Board m=new Board();  
        JFrame f=new JFrame();  
        f.add(m); // adds the board to the JFrame
        f.setSize(1920,1080);  // sets the size of the JFrame window (1920x1080 is full screen (usually))
        f.setVisible(true);  
        }

	}