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

	public HashSet<ArrayList<Integer>> uniqueXY = new HashSet<ArrayList<Integer>>();

	/**
	 * The all_cor field represents an ArrayList that stores all the coordinates for
	 * all the hexagons.
	 */

	private ArrayList<Integer>[][] allCor = new ArrayList[19][2];

	/**
	 * This method sets all the coordinates for all the hexagons by calling the
	 * necessary private methods.
	 */

	private void setLocationJunction() {

		LocationJunction loc = new LocationJunction();

		ArrayList<Integer> allX = new ArrayList<Integer>(Arrays.asList(500, 600, 700, 450, 550, 650, 750, 400, 500, 600,
				700, 800, 450, 550, 650, 750, 500, 600, 700));
		ArrayList<Integer> allY = new ArrayList<Integer>(Arrays.asList(100, 100, 100, 175, 175, 175, 175, 250, 250, 250,
				250, 250, 325, 325, 325, 325, 400, 400, 400));

		for (int i = 0; i < allX.size(); i++) {
			ArrayList<Integer> x = loc.getCorX(allX.get(i));
			ArrayList<Integer> y = loc.getCorY(allY.get(i));
			loc.setAllCor(x, y, allCor, i);
		}
		loc.removeReplicates();
		HashSet<ArrayList<Integer>> uniqueCor = loc.getUniqueCor();

		this.uniqueXY = uniqueCor;

	}

	/**
	 * This method gets all the coordinates for all the hexagons by calling
	 * setLocationJunction.
	 * 
	 * @return unique_xy A HashSet containing all the coordinates for all the
	 *         hexagons
	 */

	public HashSet<ArrayList<Integer>> getLocationJunction() {
		setLocationJunction();

		return uniqueXY;
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

		int xLT = x;
		cor.add(xLT - 5);

		int xMT = (int) (0.5 * width + x);
		cor.add(xMT - 5);

		int xRT = width + x;
		cor.add(xRT - 5);

		int xRB = width + x;
		cor.add(xRB - 5);

		int xMB = (int) (0.5 * width + x);
		cor.add(xMB - 5);

		int xLB = x;
		cor.add(xLB - 5);

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

		int yLT = (int) (y + (0.25 * height));
		cor.add(yLT - 5);

		int yMT = y;
		cor.add(yMT - 5);

		int yRT = (int) (y + 0.25 * height);
		cor.add(yRT - 5);

		int yRB = (int) (y + 0.75 * height);
		cor.add(yRB - 5);

		int yMB = y + height;
		cor.add(yMB - 5);

		int yLB = (int) (y + 0.75 * height);
		cor.add(yLB - 5);

		return cor;

	}

	/**
	 * This method sets all the x and y coordinates for all the hexagons into
	 * ArrayLsts
	 */

	public void setAllCor(ArrayList<Integer> x, ArrayList<Integer> y, ArrayList<Integer>[][] allCor, int hex_number) {

		allCor[hex_number][0] = x;
		allCor[hex_number][1] = y;

		this.allCor = allCor;
	};

	/**
	 * This method gets all the x and y coordinates for all the hexagons into
	 * ArrayLsts
	 */
	private ArrayList<Integer>[][] getAllCor() {

		return allCor;
	};

	/**
	 * This method deletes all replicate the x and y coordinate sets.
	 */

	public void removeReplicates() {
		HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();

		for (int r = 0; r < allCor.length; r++) {
			for (int e = 0; e < 6; e++) {
				int x = allCor[r][0].get(e);
				int y = allCor[r][1].get(e);
				ArrayList<Integer> xy = new ArrayList<Integer>();
				xy.add(x);
				xy.add(y);
				set.add(xy);
			}
		}
		this.uniqueXY = set;
	}

	/**
	 * This method gets all unique the x and y coordinate sets.
	 * 
	 * @return this.all_xy a HashSet or ArrayList containing unique x and y
	 *         coordinates.
	 */
	public HashSet<ArrayList<Integer>> getUniqueCor() {

		return this.uniqueXY;
	}

}
