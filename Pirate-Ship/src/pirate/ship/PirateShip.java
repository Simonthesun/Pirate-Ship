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
	
        while (boat.getPop() > 0) {
            boat.listenToSailors();
            if (Math.random() > 0.7) {
                george.eatBanana();
            }
            if (Math.random() > 0.3) {
                polly.talk();
            }
            if (Math.random() > 0.9) {
                if (Math.random() > 0.5) { //Squid
                    if (Math.random() > 0.7) { //Single sailors die
                        if (Math.random() > 0.7) { //Pirates die
                            if (Math.random() < 0.3) { //Steven dies
                                squiddy.kill(boat, "Steven the Pirate");
                            } else if (Math.random() < 0.7) { //Ben dies
                                squiddy.kill(boat, "Ben the Pirate");
                            } else { //John dies
                                squiddy.kill(boat, "John the Pirate");
                            }
                        } else { //Scallawags die
                            if (Math.random() > 0.5) { //Tanay dies
                                squiddy.kill(boat, "Tanay the Scallawag");
                            } else { //Tyler dies
                                squiddy.kill(boat, "Tyler the Scallawag");
                            }
                        }
                    } else { //Entire ship destroyed
                        squiddy.destroyVessel(boat);
                    }
                } else { //Serpent
                    if (Math.random() > 0.7) { //Single sailors die
                        if (Math.random() > 0.7) { //Pirates die
                            if (Math.random() < 0.3) { //Steven dies
                                squiddy.kill(boat, "Steven the Pirate");
                            } else if (Math.random() < 0.7) { //Ben dies
                                squiddy.kill(boat, "Ben the Pirate");
                            } else { //John dies
                                squiddy.kill(boat, "John the Pirate");
                            }
                        } else { //Scallawags die
                            if (Math.random() > 0.5) { //Tanay dies
                                squiddy.kill(boat, "Tanay the Scallawag");
                            } else { //Tyler dies
                                squiddy.kill(boat, "Tyler the Scallawag");
                            }
                        }
                    } else { //Entire ship destroyed
                        squiddy.destroyVessel(boat);
                    }
                }
            }
        }
    }
}
