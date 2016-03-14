import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class Route implements Comparable<Route> {
    //private final Tile start;
    //private final Tile end;
	private LinkedList<Tile> route;
    //private final int distance;

    /*
    public Route(Tile start, Tile end, int distance) {
        this.start = start;
        this.end = end;
        this.distance = distance;
    }
     */
    
    public Route(LinkedList<Tile> r) {
        this.route = r;
    }
    
 /*
    public Tile getStart() {
        return start;
    }

    public Tile getEnd() {
        return end;
    }
*/
    
    
    
    public int getDistance() {
        return this.route.size();
    }

    public LinkedList<Tile> getRoute() {
		return route;
	}

	@Override
    public int compareTo(Route r) {
        return r.getDistance() - this.route.size();
    }

    @Override
    public int hashCode() {
        return route.hashCode() * Ants.MAX_MAP_SIZE * Ants.MAX_MAP_SIZE;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o instanceof Route) {
            Route r = (Route)o;
            result = route.equals(r.route);
        }
        return result;
    }
}
	

