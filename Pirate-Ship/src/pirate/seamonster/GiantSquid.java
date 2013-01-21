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
    
    public void kill(Vessel v, String name) {
	v.killSailor(name);
        System.out.println ("A giant squid killed " + name + "!");
    }
    
    public void destroyVessel(Vessel v) {
            System.out.println ("The ship was destroyed by a giant squid! Everyone died.");
            v.destroyShip(); 
    }
}