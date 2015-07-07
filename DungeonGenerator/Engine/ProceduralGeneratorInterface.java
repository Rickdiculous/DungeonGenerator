package Engine;

public class ProceduralGeneratorInterface {

	/**
	 * NJA: This method creates objects of type DOOR.
	 * @param size (int); size of door.
	 * @param mat (Material); door material. e.g. stone, iron, wood...
	 * @param secret (boolean); Is the door hidden?
	 * @param lockType (lockType); Is the door locked? e.g., locked, unlocked, barred...
	 * @return A God-damned door.
	 */
	public Door getDoor(int size, Material mat, boolean secret, lockType lockType){
		
	}
	/**
	 * NJA: This method creates a generic room. Good for entry ways or generic rooms. 
	 * 		Trying to think of how to handle placement of passageways/doors.
	 * @param shape (Shape); Shape of room. e.g. square, rectangle, circle, oval.
	 * @param diameter (int); If Shape is of a circular type (Circle, oval), shortest length from each cardinal direction.
	 * 						  Else I guess throw as null or a default nonsensical variable (-1 is my go-to).
	 * @param xLength (int); On a Cartesian plane, length of a room in feet on x-axis. 
	 *   					 For ovular shape, make the longest length from each cardinal direction. 
	 * @param yLength (int); On a Cartesian plane, length of a room in feet on y-axis.
	 * 						 For ovular shape, throw as nurll or a default nonsensical variable (-1 is my go-to).
	 * @param numPass (int); Number of passages out of a room.
	 * @param numDoor (int); Number of doors connected to a room.
	 * @return A God-damned room.
	 */
	public Room getRoom(Shape shape, int diameter, int xLength, int yLength, int numPass, int numDoor)
	{
		
	}
	/**
	 * NJA: This method creates a hallway, or passageway.
	 * 		Trying to think of how to handle placement of passageways/doors.
	 * @param length (int); length of hallway.
	 * @param width (int); width of hallway.
	 * @param numPass (int); Number of passageways connected to hallway (i.e. forks, four-way intersections, T-intersections)
	 * @param numDoor (int); Number of doors on hallway.
	 * @return A God-damned hallway.
	 */
	public Hall getHall(int length, int width, int numPass, int numDoor)
	{
		
	}
}
