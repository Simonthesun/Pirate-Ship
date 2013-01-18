package pirate.ship;

import vessel.*;

/**
 *
 * @author Steven
 */
public class PirateShip {
    
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
