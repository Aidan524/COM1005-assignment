
public class RamblersLink {

	private Coords point1;
	private Coords point2;
	private int cost;
	
	public RamblersLink(Coords p1, Coords p2, int c) {
		
		point1 = p1;
		point2 = p2;
		cost = c;
	
	}
	
	public Coords getPoint1() {
		
		return point1;
		
	}
	
	public Coords getpoint2() {
		
		return point2;
		
	}
	
	public int getCost() {
		
		return cost;
		
	}
	
	public String toString() {
		
		return point1 + " <--> " + point2 + " " + cost;
		
	}
	
}
