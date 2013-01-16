/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pirate.seamen.clothing;
/**
 *
 * @author Tyler
 */
public class Hats {
    private String shape = new String("");
    
    public Hats(String sIncomming)
    {
        shape = sIncomming;
    }
    
    public String getShape()
    {
        return shape;
    }
    
    public void newHat(String sIncomming)
    {
        shape = sIncomming;
    }
}
