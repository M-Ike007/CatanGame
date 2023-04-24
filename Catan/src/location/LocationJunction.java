package location;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;



public class LocationJunction {
	public ArrayList<Integer> getCorX(int x){
		ArrayList<Integer> cor = new ArrayList<Integer>();
		int width= 100;
		int height= 100;
		
		int x_lt = x;		
		cor.add(x_lt -5);
		
		int x_mt = (int) (0.5 * width + x);
		cor.add(x_mt -5);
		
		int x_rt = width +x ;
		cor.add(x_rt-5);
		
		int x_rb = width+x;
		cor.add(x_rb-5);
		
		int x_mb = (int) (0.5 * width + x);
		cor.add(x_mb-5);
		
		int x_lb = x;	
		cor.add(x_lb-5);
		System.out.println(cor.toString());

		return cor;
	
	}
	public ArrayList<Integer> getCorY(int y){
		ArrayList<Integer> cor = new ArrayList<Integer>();
		int width= 100;
		int height= 100;
		
		int y_lt = (int)(y + (0.25*height));
		cor.add(y_lt -5);
		
		int y_mt = y;
		cor.add(y_mt-5);
		
		int y_rt = (int) (y + 0.25* height);
		cor.add(y_rt-5);
		
		int y_rb = (int) (y+ 0.75*height);
		cor.add(y_rb-5);
	
		int y_mb = y+height;
		cor.add(y_mb-5);
		
		int y_lb = (int) (y+0.75*height);	
		cor.add(y_lb-5);
		System.out.println(cor.toString());
		return cor;
	
	}
	public int[][] getAllCor(ArrayList<Integer> x, ArrayList<Integer> y, int [][] all_cor){
		int length= all_cor.length;
		System.out.println(length);
		return null;
	};
	
	
	public static void main(String[] args) {
		LocationJunction loc = new LocationJunction();
		int[][] t = new int[0][0];
		ArrayList<Integer> x = loc.getCorX(450);
		ArrayList<Integer> y = loc.getCorY(25);
		loc.getAllCor(x,y,t );
		loc.getAllCor(x,y,t );
	}
}
