package Engine;

public class ProceduralGeneratorInterface {

	/**
	 * NJA: This method creates objects of type DOOR.
	 * @param size (int); size of door.
	 * @param mat (Material); door material. e.g.
	 * @return A God-damned door.
	 */
	public Door getDoor(int size, Material mat, ){
		
	}
	/**
	 * NJA: This method creates a generic room. Good for entry ways or generic rooms.
	 * @param shape (Shape); Shape of room. e.g. square, rectangle, circle, oval.
	 * @param diameter (int); If Shape is of a circular type (Circle, oval), shortest length from each cardinal direction.
	 * 						  Else I guess throw as null or a default nonsensical variable (-1 is my go-to).
	 * @param xLength (int); On a Cartesian plane, length of a room in feet on x-axis.
	 * @param yLength (int); On a Cartesian plane, length of a room in feet on y-axis.
	 * @param numPass (int); Number of passages out of a room.
	 * @param numDoor (int); Number of doors connected to a room.
	 * @return A God-damned room.
	 */
	public room getRoom(Shape shape, int diameter, int xLength, int yLength, int numPass, int numDoor)
	{
		
	}
}
