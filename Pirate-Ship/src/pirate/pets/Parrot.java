/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * hi
 */
package pirate.pets;

/**
 *
 * @author simonthesun
 */
public class Parrot {
    
    String name;
    String owner;
    public boolean canTalk = true;
    
    public Parrot (String name, String owner, boolean talk) {
        this.name = name + " the Parrot";
        this.owner =  owner + "'s parrot";
        talk = canTalk;
        
    }
}
