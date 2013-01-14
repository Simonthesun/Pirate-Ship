package vessel;

/**
 *
 * @author Steven
 */
public class Mast {
    
    private String _mastType;
    private int _height;
    
    public Mast(int height) {
	_height = height;
	_mastType = "Standard";
    }
    
    public void setMastType(String type) {
	_mastType = type;
    }
    
    public void setHeight(int height) {
	_height = height;
    }
    
    public String getType() {
	return _mastType;
    }
    
    public int getHeight() {
	return _height;
    }
}
