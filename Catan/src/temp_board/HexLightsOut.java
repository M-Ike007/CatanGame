package temp_board;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.*;

import java.util.Random;
import java.util.ArrayList;

public class HexLightsOut extends JPanel{
	
	public HexLightsOut() {
		int[][] cornersX = new int[BOARD_WIDTH * BOARD_HEIGHT][NUM_HEX_CORNERS];
		int[][] cornersY = new int[BOARD_WIDTH * BOARD_HEIGHT][NUM_HEX_CORNERS];
		int n = 0;
	    for (int j = 0; j < BOARD_HEIGHT; j++) {
	        for (int i = 0; i < BOARD_WIDTH; i++) {
	            mCellMetrics.setCellIndex(i, j);
            	mCellMetrics.computeCorners(mCornersX, mCornersY);
            	cornersX[n] = Arrays.copyOf(mCornersX, mCornersX.length);
                cornersY[n] = Arrays.copyOf(mCornersY, mCornersY.length);
            	n ++;
	        }
	    }
	    this.allcorX = cornersX;
	    this.allcorY = cornersY;
	}
	
	private static final long serialVersionUID = 1L;

    private static final int BOARD_WIDTH = 1;
    private static final int BOARD_HEIGHT = 18;

    private static final int NUM_HEX_CORNERS = 6;
    private static final int CELL_RADIUS = 40;
   
    public int[] mCornersX = new int[NUM_HEX_CORNERS];
    public int[] mCornersY = new int[NUM_HEX_CORNERS];
    
    public int[][] allcorX;
    public int[][] allcorY;
   
    public HexGridCell mCellMetrics = new HexGridCell(CELL_RADIUS);

    private BufferedImage loadImage(File file) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
    
    public void paint(Graphics g) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 3, 4, 4, 5, 5, 6, 6, 8, 8, 9, 9, 10, 10, 11, 11, 12));

        for (int n = 0; n < BOARD_HEIGHT * BOARD_WIDTH; n++) {
            File file = new File("Images/hex2.jpg"); 
            Polygon poly = new Polygon(allcorX[n], allcorY[n], 6);
            BufferedImage image = loadImage(file);

            Graphics2D g2d = (Graphics2D) g;
            g2d.setClip(poly); 
            g2d.fillPolygon(allcorX[n], allcorY[n], NUM_HEX_CORNERS);
            g2d.drawImage(image, allcorX[n][0], allcorY[n][0] - mCellMetrics.RADIUS/2, null); // shift image 0.5* radius 

            g2d.setColor(Color.BLACK);
            g2d.drawPolygon(allcorX[n], allcorY[n], NUM_HEX_CORNERS);
            g2d.setClip(null); 

            // display numbers
            Font font = new Font("Arial", Font.PLAIN, 20);
            g.setFont(font);
            FontMetrics metrics = g.getFontMetrics(font);
            int index = rand.nextInt(numbers.size());
            String number = String.valueOf(numbers.get(index));
            numbers.remove(index);
            
            int x = allcorX[n][0] + (mCellMetrics.RADIUS - metrics.stringWidth(number)) / 2;
            int y = allcorY[n][0] + (mCellMetrics.RADIUS - metrics.getHeight()) / 2 + metrics.getAscent();

            g.setColor(Color.WHITE);
            g.drawString(number, x, y);
        }
    }


    public int[] getCornerX() {
    	return mCornersX;
    }
    public int[] getCornerY() {
    	return mCornersY;
    }
    public int[][] getallX(){
    	return allcorX;
    }
    public int[][] getallY(){
    	return allcorY;
    }

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Hexagonal Grid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HexLightsOut hexLightsOut = new HexLightsOut();
        frame.add(hexLightsOut);

        frame.pack();
        frame.setVisible(true);
        System.out.println( Arrays.deepToString(hexLightsOut.allcorX));
       
  
    }
   
}