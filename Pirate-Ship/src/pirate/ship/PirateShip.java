package pirate.ship;

import vessel.*;
import pirate.seamen.*;
import pirate.pets.*;
import pirate.seamonster.*;

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
        
        //
        
        Monkey george = new Monkey ("George", "Ben");
        Parrot polly = new Parrot ("Polly", "Steven", true);
        GiantSquid squiddy = new GiantSquid (100);
        SeaSerpent serpent = new SeaSerpent (100, "Green");
        
        //
	
	boat.listenToSailors();
	if (Math.random() > 0.7) {
            george.eatBanana();
        }
        if (Math.random() > 0.3) {
            polly.talk();
        }
        if (Math.random() > 0.9) {
            if (Math.random() > 0.5) {
                squiddy.kill(boat);
                System.out.println ("A giant squid killed Ben!");
            } else {
                serpent.destroyVessel(boat);
                System.out.println ("The ship was destroyed by a sea serpent! Everyone died.");
            }
        }
    }
}
