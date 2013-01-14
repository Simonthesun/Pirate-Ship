package vessel;

/**
 *
 * @author Steven
 */
public class Vessel {
    
    private Hull _hull;
    private String _name;
    
    private int _maxPop;
    private int _currentPop;
    
    public Vessel (String name, int length, int masts, int maxPop, int currentPop) {
	_name = name;
	_maxPop = maxPop;
	_currentPop = currentPop;
	
	_hull = new Hull(length);
    }
    
    public Hull getHull() {
	return _hull;
    }
    
    public String getName() {
	return _name;
    }
    
    public int getPop() {
	return _currentPop;
    }
    
    public int getMaxPop() {
	return _maxPop;
    }
}
