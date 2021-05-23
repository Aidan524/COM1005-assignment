import java.util.*;
public class RunRamblersBB {

	public static void main(String[]args) {
		
		TerrainMap map1 = new TerrainMap("search3/tmc.pgm");
		RamblersSearch searcher = new RamblersSearch(map1, Coords);
	}
}
