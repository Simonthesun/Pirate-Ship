package vessel;

/**
 *
 * @author Steven
 */
public class Vessel {
    
    private Hull _hull;
    private String _name;
    private int _maxPop;
    
    public Vessel (String name, int length, int masts, int maxPop) {
	_name = name;
	_maxPop = maxPop;
	
	_hull = new Hull(length);
    }
}
