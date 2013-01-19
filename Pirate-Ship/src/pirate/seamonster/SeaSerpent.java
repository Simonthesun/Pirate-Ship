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
    
    public boolean destroyVessel(Vessel v) {
        if (v.getPop() < 10) {
            v.killSailor("Ben", false);
            v.killSailor("Steven", false);
            v.killSailor("John", false);
            v.killSailor("Tanay", true);
            v.killSailor("Tyler", true);
            return true;
        } else {
            return false;
        }
    }
}
