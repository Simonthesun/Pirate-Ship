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
    private String _shape = new String("");
    
    public Hats(String sIncomming)
    {
        _shape = sIncomming;
    }
    
    public String getShape()
    {
        return _shape;
    }
    
    public void newHat(String sIncomming)
    {
        _shape = sIncomming;
    }
}
