package guiboard;

import java.util.HashMap;

public class TilesNumbers {
	private HashMap<String, Integer> rNums;

	public TilesNumbers(HashMap<String, Integer> rNums) {
		this.rNums = rNums;
	}

	public HashMap<String, Integer> getrNums() {
		return rNums;
	}

	public void setrNums(HashMap<String, Integer> rNums) {
		this.rNums = rNums;
	}
}