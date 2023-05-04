package location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * This class calculates all coordinates for each hexagon. It provides methods
 * for getting the x and y coordinates of a hexagon and for obtaining all the
 * coordinates for all the hexagons.
 */

public class LocationJunction {

	/**
	 * The unique_xy field represents a HashSet that stores all the unique x and y
	 * coordinates.
	 */

	public HashSet<ArrayList<Integer>> unique_xy = new HashSet<ArrayList<Integer>>();

	/**
	 * The all_cor field represents an ArrayList that stores all the coordinates for
	 * all the hexagons.
	 */

	private ArrayList<Integer>[][] all_cor = new ArrayList[19][2];


	/**
	 * This method sets all the coordinates for all the hexagons by calling the
	 * necessary private methods.
	 */

	private void setLocationJunction() {

		LocationJunction loc = new LocationJunction();

		ArrayList<Integer> all_x = new ArrayList<Integer>(Arrays.asList(500, 600, 700, 450, 550, 650, 750, 400, 500,
				600, 700, 800, 450, 550, 650, 750, 500, 600, 700));
		ArrayList<Integer> all_y = new ArrayList<Integer>(Arrays.asList(100, 100, 100, 175, 175, 175, 175, 250, 250,
				250, 250, 250, 325, 325, 325, 325, 400, 400, 400));

		for (int i = 0; i < all_x.size(); i++) {
			ArrayList<Integer> x = loc.getCorX(all_x.get(i));
			ArrayList<Integer> y = loc.getCorY(all_y.get(i));
			loc.setAllCor(x, y, all_cor, i);
		}
		loc.removeReplicates();
		HashSet<ArrayList<Integer>> unique_cor = loc.getUniqueCor();

		this.unique_xy = unique_cor;

	}
	
	/**
	 * This method gets all the coordinates for all the hexagons by calling
	 * setLocationJunction.
	 * 
	 * @return unique_xy A HashSet containing all the coordinates for all the hexagons
	 */

	public HashSet<ArrayList<Integer>> getLocationJunction() {
		setLocationJunction();

		return unique_xy;
	}

	/**
	 * This method gets the x coordinates for a hexagon.
	 * 
	 * @param x an integer representing the x coordinate of the hexagon
	 * @return cor An ArrayList containing the x coordinates for all the corners of
	 *         the hexagon
	 */

	public ArrayList<Integer> getCorX(int x) {

		ArrayList<Integer> cor = new ArrayList<Integer>();
		int width = 100;

		int x_lt = x;
		cor.add(x_lt - 5);

		int x_mt = (int) (0.5 * width + x);
		cor.add(x_mt - 5);

		int x_rt = width + x;
		cor.add(x_rt - 5);

		int x_rb = width + x;
		cor.add(x_rb - 5);

		int x_mb = (int) (0.5 * width + x);
		cor.add(x_mb - 5);

		int x_lb = x;
		cor.add(x_lb - 5);

		return cor;

	}

	/**
	 * This method gets the y coordinates for a hexagon.
	 * 
	 * @param x an integer representing the y coordinate of the hexagon
	 * @return cor An ArrayList containing the y coordinates for all the corners of
	 *         the hexagon
	 */

	public ArrayList<Integer> getCorY(int y) {

		ArrayList<Integer> cor = new ArrayList<Integer>();
		int height = 100;

		int y_lt = (int) (y + (0.25 * height));
		cor.add(y_lt - 5);

		int y_mt = y;
		cor.add(y_mt - 5);

		int y_rt = (int) (y + 0.25 * height);
		cor.add(y_rt - 5);

		int y_rb = (int) (y + 0.75 * height);
		cor.add(y_rb - 5);

		int y_mb = y + height;
		cor.add(y_mb - 5);

		int y_lb = (int) (y + 0.75 * height);
		cor.add(y_lb - 5);

		return cor;

	}

	/**
	 * This method sets all the x and y coordinates for all the hexagons into
	 * ArrayLsts
	 */

	public void setAllCor(ArrayList<Integer> x, ArrayList<Integer> y, ArrayList<Integer>[][] all_cor, int hex_number) {

		all_cor[hex_number][0] = x;
		all_cor[hex_number][1] = y;

		this.all_cor = all_cor;
	};

	/**
	 * This method gets all the x and y coordinates for all the hexagons into
	 * ArrayLsts
	 */
	private ArrayList<Integer>[][] getAllCor() {

		return all_cor;
	};

	/**
	 * This method deletes all replicate the x and y coordinate sets.
	 */
	
	public void removeReplicates() {
		HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();

		for (int r = 0; r < all_cor.length; r++) {
			for (int e = 0; e < 6; e++) {
				int x = all_cor[r][0].get(e);
				int y = all_cor[r][1].get(e);
				ArrayList<Integer> xy = new ArrayList<Integer>();
				xy.add(x);
				xy.add(y);
				set.add(xy);
			}
		}
		this.unique_xy = set;
	}

	/**
	 * This method gets all unique the x and y coordinate sets.
	 * 
	 * @return this.all_xy a HashSet or ArrayList containing unique x and y
	 *         coordinates.
	 */
	public HashSet<ArrayList<Integer>> getUniqueCor() {

		return this.unique_xy;
	}

}
