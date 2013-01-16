/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pirate.seamen.clothing;

/**
 *
 * @author Tyler
 */
public class Boots {
    private int _size = 0;
    private String _type = new String("");
    public Boots(int size, String type)
    {
        _size = size;
        _type = type;
    }
    
    public void sizeChange(int size)
    {
        _size = size;
    }
    
    public void typeChange(String s)
    {
        _type = s;
    }
    
    public void newBoots(int size, String type)
    {
        _size = size;
        _type = type;
    }
    
    public int getSize()
    {
        return _size;
    }
    
    public String getType()
    {
        return _type;
    }
}
