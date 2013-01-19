package vessel;

import java.util.ArrayList;
import pirate.seamen.Sailor;

/**
 *
 * @author Steven
 */
public class Vessel {
    
    private ArrayList<Sailor> _sailors;
    
    private Hull _hull;
    private String _name;
    
    private int _maxPop;
    private int _currentPop;
    
    public Vessel (String name, int length, int masts, int maxPop, int currentPop) {
	_name = name;
	_maxPop = maxPop;
	_currentPop = currentPop;
	
	_hull = new Hull(length);
	
	_sailors = new ArrayList<Sailor>(0);
    }
    
    public void listenToSailors() {
	for (int i = 0; i < _sailors.size(); i++) {
            Sailor s = _sailors.get(i);
	    System.out.println(s.name + " says: " + _sailors.get(i).talkLikeAPirate());
	}
    }
    
    public void addSailor(String name, boolean scallawag) {
	_sailors.add(new Sailor(name, scallawag));
    }
    
    public void killSailor(String name, boolean scallawag) {
	_sailors.remove(0);
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
