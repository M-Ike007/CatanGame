package location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;



/**
 * This method calculate all coordinates for each Hexagon.
 *
 */

public class LocationJunction {
	public HashSet<ArrayList<Integer>> all_xy = new HashSet<ArrayList<Integer>>();
	
	/**
	 * This methods g
	 *
	 */
	
	public HashSet<ArrayList<Integer>>getLocationJunction(){
		setLocationJunction();
		return all_xy;
		}
	
	private void setLocationJunction() {
		LocationJunction loc = new LocationJunction();
		ArrayList<Integer>[][] t = new ArrayList[19][2];
		
		ArrayList<Integer> all_x = new ArrayList<Integer>(Arrays.asList(
				500,600,700,450,550,650,750,400,500,600,700,800,
				450,550,650,750,500,600,700));
		ArrayList<Integer> all_y = new ArrayList<Integer>(Arrays.asList(100,100,100,175,175,175,175,
				250,250,250,250,250,325,325,325,325,400,400,400));
		for (int i = 0; i < all_x.size(); i++) {
			ArrayList<Integer> x = loc.getCorX(all_x.get(i));
			ArrayList<Integer> y = loc.getCorY(all_y.get(i));
			t = loc.getAllCor(x,y,t,i);
		}
		HashSet<ArrayList<Integer>> s = loc.removeReplicates(t);
		this.all_xy = s;

	}
	public ArrayList<Integer> getCorX(int x){
		ArrayList<Integer> cor = new ArrayList<Integer>();
		int width= 100;
		
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
	

		return cor;
	
	}
	public ArrayList<Integer> getCorY(int y){
		ArrayList<Integer> cor = new ArrayList<Integer>();
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
	
		return cor;
	
	}
	private ArrayList<Integer>[][] getAllCor(ArrayList<Integer> x, ArrayList<Integer> y, ArrayList<Integer> [][] all_cor, int hex_number){
		all_cor[hex_number][0] = x;
		all_cor[hex_number][1] = y;
		return all_cor;
		};
		
	private HashSet<ArrayList<Integer>> removeReplicates(ArrayList<Integer>[][] all_cor){
		HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		for (int r=0; r < all_cor.length; r++) {
			for(int e = 0; e< 6 ; e++) {
				int x = all_cor[r][0].get(e);
				int y = all_cor[r][1].get(e);
				ArrayList<Integer> xy = new ArrayList<Integer>();
				xy.add(x);
				xy.add(y);
				set.add(xy);
			}
		}
		return set;
	}

}
