package player;

/** Enum to store player colour.
 * @author Jan, Sibbe
 * 
 * Colours stored are blue, red, green and yellow.
 */
public enum PlayerColour {
	BLUE {
		@Override
		public String toString() {
			return "blue";
		}
	},
	RED{
		@Override
		public String toString() {
			return "red";
		}
	},
	GREEN{
		@Override
		public String toString() {
			return "green";
		}
	},
	YELLOW{
		@Override
		public String toString() {
			return "yellow";
		}
	},
}
