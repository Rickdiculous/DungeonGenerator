package GeneratorTools;



/**
 * This is a door, a door is an object that connects rooms and hallways. A door can be locked, have a material, can be secret, and is of a certain size
 * @author Rick
 *
 */

enum doorType{
	STANDARD,
	PORTCULLIS,
	DOUBLE
}
public class Door {
	/**
	 * Material is an enum that dictates what it is made of
	 */
	Material mat;
	/**
	 * this tells the user if the door is locked
	 */
	boolean isLocked;
	/**
	 * this is how wide the door is
	 */
	int width;
	/**
	 * this is if the door is visible to players
	 */
	boolean isSecret;
	/**
	 * this is an enum for how the door mechanically operates.
	 */
	doorType type;
	
	
	public Door(Material mat, boolean isLocked, boolean isSecret, doorType type, int width){
		this.mat = mat;
		this.isLocked=isLocked;
		this.width=width;
		this.isSecret=isSecret;
		this.type=type;
	}
	public Material getMat() {
		return mat;
	}
	public void setMat(Material mat) {
		this.mat = mat;
	}
	public boolean isLocked() {
		return isLocked;
	}
	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
