package pirate.seamonster;

import vessel.Vessel;

/**
 *
 * @author Steven
 */
public class GiantSquid {
    
    private int _length;
    
    public GiantSquid(int length) {
	_length = length;
    }
    
    public void kill(Vessel v) {
	v.killSailor("Ben", true);
    }
}
