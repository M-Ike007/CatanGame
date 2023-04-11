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
        Image Img_brick=t.getImage("Tile_Images/Tile_Brick.png");  
        Image Img_wood=t.getImage("Tile_Images/Tile_Wood.png");
        Image Img_ore=t.getImage("Tile_Images/Tile_Ore.png");
        Image Img_wool=t.getImage("Tile_Images/Tile_Wool.png");
        Image Img_wheat=t.getImage("Tile_Images/Tile_Wheat.png");
        Image Img_desert=t.getImage("Tile_Images/Tile_Desert.png");
        Image Img_sea=t.getImage("Tile_Images/Tile_Sea.png");
        
        // draw the images: name, x, y, size_x, size_y
        // the location of the tiles currently depends on your screen ratio
        
        //1th row
        g.drawImage(Img_sea, 450, 25, 100, 100, this);
        g.drawImage(Img_sea, 550, 25, 100, 100, this);
        g.drawImage(Img_sea, 650, 25, 100, 100, this);
        g.drawImage(Img_sea, 750, 25, 100, 100, this);
        // 2th row
        g.drawImage(Img_sea, 400, 100, 100, 100, this);
        g.drawImage(Img_wood, 500, 100, 100, 100, this);
        g.drawImage(Img_wood, 600, 100, 100, 100, this);
        g.drawImage(Img_wood, 700, 100, 100, 100, this);
        g.drawImage(Img_sea, 800, 100, 100, 100, this);
        // 3th row
        g.drawImage(Img_sea, 350, 175, 100, 100, this);
        g.drawImage(Img_wood, 450, 175, 100, 100, this);
        g.drawImage(Img_wood, 550, 175, 100, 100, this);
        g.drawImage(Img_brick, 650, 175, 100, 100, this);
        g.drawImage(Img_brick, 750, 175, 100, 100, this);
        g.drawImage(Img_sea, 850, 175, 100, 100, this);
        
        // 4th row
        g.drawImage(Img_desert, 600, 250, 100, 100, this);
        g.drawImage(Img_wheat, 500, 250, 100, 100, this);
        g.drawImage(Img_wood, 700, 250, 100, 100, this);
        g.drawImage(Img_wheat, 800, 250, 100, 100, this);
        g.drawImage(Img_sea, 900, 250, 100, 100, this);
        g.drawImage(Img_wood, 400, 250, 100, 100, this);
        g.drawImage(Img_sea, 300, 250, 100, 100, this);
        
        // 5th row
        g.drawImage(Img_wool, 550, 325, 100, 100, this);
        g.drawImage(Img_ore, 650, 325, 100, 100, this);
        g.drawImage(Img_wool, 750, 325, 100, 100, this);
        g.drawImage(Img_sea, 850, 325, 100, 100, this);
        g.drawImage(Img_wool, 450, 325, 100, 100, this);
        g.drawImage(Img_sea, 350, 325, 100, 100, this);
        
        //6th row
        g.drawImage(Img_sea, 400, 400, 100, 100, this);
        g.drawImage(Img_wood, 500, 400, 100, 100, this);
        g.drawImage(Img_wood, 600, 400, 100, 100, this);
        g.drawImage(Img_wood, 700, 400, 100, 100, this);
        g.drawImage(Img_sea, 800, 400, 100, 100, this);
        
        //7th row
        g.drawImage(Img_sea, 450, 475, 100, 100, this);
        g.drawImage(Img_sea, 550, 475, 100, 100, this);
        g.drawImage(Img_sea, 650, 475, 100, 100, this);
        g.drawImage(Img_sea, 750, 475, 100, 100, this);



          
    }  
		// this generates the board in a JFrame
        public static void main(String[] args) {  
        Board m=new Board();  
        JFrame f=new JFrame();  
        f.add(m); // adds the board to the JFrame
        f.setState(Frame.NORMAL);
        f.setSize(1920,1080);  // sets the size of the JFrame window (1920x1080 is full screen (usually))
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.setVisible(true); 
        }

	}