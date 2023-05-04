package player;

/**
 * Enum to store player colour.
 * 
 * Colours stored are blue, red.
 */
public enum PlayerColour {
	BLUE {
		@Override
		public String toString() {
			return "blue";
		}
	},
	RED {
		@Override
		public String toString() {
			return "red";
		}
	},
}
