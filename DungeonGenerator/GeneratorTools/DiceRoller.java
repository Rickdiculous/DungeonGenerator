package GeneratorTools;

import java.util.Random;
/**
 * static dice roller anyone can access
 * @author Rick
 *
 */
public class DiceRoller {
	static long seed=0;
	static Random rand = new  Random();
	/**
	 * takes numDie dice and rolls a that many dice of size dieSides and returns result
	 * @param numDie
	 * @param dieSides
	 * @return
	 */
	public static int roll(int numDie, int dieSides){
		int result = 0;
		for(int i =0;i<numDie;i++){
			result +=rand.nextInt(dieSides)+1;
		}
		return result;
	}
	/**
	 * sets a seed for random
	 * @param x
	 */
	public static void setSeed(long x){
		seed=x;
	}
	/**
	 * find the average value of a roll if one were to roll it
	 * @param numDie
	 * @param dieSides
	 * @return
	 */
	public static int avgForRoll(int numDie, int dieSides){
		double result;
		result =numDie*dieSides/2;
	
		return (int) Math.floor(result);
	}
	
	
}

