package GeneratorTools;

import java.util.Vector;

enum roomType{
	STANDARD,
	PORTCULLIS,
	DOUBLE
}
public class Room {

		/**
		 * Material is an enum that dictates what the floor
		 */
		Material floorMat;
		Material wallMat;
		/**
		 * tells the user if it is a hall or not
		 */
		boolean isHall;
		/**
		 * find out how many sets of points the room needs
		 */
		int sides;
		/**
		 * stores the vertices of a room
		 */
		Vector<Double>[] vertices;
		/**
		 * stores the vertices of the centers of doors
		 */
		Vector<Double>[] doorLocation;
		/**
		 * this is the type of doors
		 */
		Door[] doors;

		roomType type;
		/**
		 * Create a door of generic type, can be made for any kind.
		 * @param vertices
		 * @param isHall
		 * @param floorMat
		 * @param wallMat
		 * @param doorLocation
		 * @param doors
		 */
	public Room(Vector<Double>[] vertices, boolean isHall, Material floorMat, Material wallMat, Vector<Double>[] doorLocation, Door[] doors){
		this.vertices=vertices;
		this.isHall=isHall;
		this.floorMat=floorMat;
		this.wallMat=wallMat;
		this.doorLocation=doorLocation;
		this.doors=doors;
	}
}
