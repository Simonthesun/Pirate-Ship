package pirate.ship;

import vessel.*;
import pirate.seamen.*;

/**
 *
 * @author Steven
 */
public class PirateShip {
    
    private Sailor[] crew;
    
    public static void main(String[] args) {
	Vessel boat = new Vessel("Wench Mobile", 169, 4, 101, 5);
	
	boat.addSailor("Steven", false);
	boat.addSailor("Ben", false);
	boat.addSailor("John", false);
	boat.addSailor("Tanay", true);
	boat.addSailor("Tyler", true);
	
	boat.listenToSailors();
    }
}
