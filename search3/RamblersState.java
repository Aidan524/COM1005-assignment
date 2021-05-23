import java.util.ArrayList;

public class RamblersState extends SearchState{

private Coords point;

public RamblersState(Coords pointCoords, int lc) {
	 
	point = pointCoords;
	 localCost = lc;
	
}

public Coords getPoint() {
	
	return point;
}


@Override
boolean goalPredicate(Search searcher) {
	// TODO Auto-generated method stub
	RamblersSearch rsearcher = (RamblersSearch) searcher;
	Coords tar = rsearcher.getGoal(); // get target point
	return (point == tar);
} 

@Override
ArrayList<SearchState> getSuccessors(Search searcher) {
	// TODO Auto-generated method stub
	RamblersSearch rsearcher = (RamblersSearch) searcher;
    TerrainMap map = rsearcher.getMap();   
    
    
   
    ArrayList<SearchState>succs = new ArrayList<SearchState>();
    
    
    
    
    
}

@Override
boolean sameState(SearchState s2) {
	// TODO Auto-generated method stub
	RamblersState rs2 = (RamblersState) s2;
	return (point == rs2.getPoint());
}

public String toString() {
	return ("Ramblers State: " + point);
}
}
