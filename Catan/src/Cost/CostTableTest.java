package Cost;

public class CostTableTest {

	public static void main(String[] args) {
		String key ="ore";
		CostTable roads=new CostTable();
		roads.add("wheat", 5);
        assertFalse(roads.isEmpty());
	}

}
