/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pirate.seamonster;

import vessel.Vessel;
/**
 *
 * @author Simon
 */
public class SeaSerpent {
    int length;
    String color;
    
    public SeaSerpent(int length, String color) {
	this.length = length;
        this.color = color;
    }
    
    public void kill(Vessel v, String name) {
	v.killSailor(name);
        System.out.println ("A sea serpent killed " + name);
    }
    
    public void destroyVessel(Vessel v) {
            System.out.println ("The ship was destroyed by a sea serpent! Everyone died.");
            v.destroyShip();
    }
}
