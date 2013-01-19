/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pirate.pets;

import pirate.seamen.Sailor;

/**
 *
 * @author Simon
 */
public class Monkey {
    
    String name;
    String owner;
    
    public Monkey(String name, String owner) {
        this.name = name + " the monkey";
        this.owner = owner + "'s monkey";
    }
    
    public boolean stealLoot() {
        if (Math.random() > 0.7) {
            return true;
        } else {
            return false;
        }
    }
    
    public void eatBanana() {
        if (this.stealLoot() == true) {
            System.out.print("Nom nom nom!");
        }
    }
}
