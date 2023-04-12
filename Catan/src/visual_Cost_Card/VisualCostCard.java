package visual_Cost_Card;

//These packages are needed for making a Frame and *draw* images in that Frame
import java.awt.*;  
import javax.swing.JFrame;

/**
 * Description	: This code displays an image of the cost table to the game screen. It will remain the same
 * 				  throughout the course of the game and is therefore static
 * 				  It features a class and 2 methods based on the tutorial: https://www.javatpoint.com/java-swing
 * Classes		: VisualCostCard (contains the paint() and the main() methods
 * Methods		: Paint(): Defines the image in size and position: image is to be provided in the code
 * 				: Main(): comprises the JFrame library to display the image to the screen
 * @author MI & LAK (Mees Ike & Laurens Adriaan Klinkien)
 * Parameters	: None
 * Returns		: None / void
 * Test			: No test, static image is displayed
 */
public class VisualCostCard extends Canvas{
	private static final long serialVersionUID = 1L; // Code likely defines settings within used imports
	public void paint(Graphics g) {

	Toolkit t=Toolkit.getDefaultToolkit(); // With this we define an object as an image and give the file path. 

	// Inserting image to be displayed	
	Image Img_costcard=t.getImage("Tile_Images/Cost_Table.jpg"); 
			
		// draw the image: name, x, y, size_x, size_y
        g.drawImage(Img_costcard, 600, 250, 300, 400, this);
}
	
	// this displays the cost card in a JFrame
	public static void main(String[] args) {  
	VisualCostCard m=new VisualCostCard();  
	JFrame f=new JFrame();  
	f.add(m); // adds the cost card to the JFrame
	f.setSize(1920,1080);  // sets the size of the JFrame window (1920x1080 is full screen (usually))
	f.setVisible(true);  
	}
}
