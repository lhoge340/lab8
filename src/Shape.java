/**
 * Lab 8
 * 
 * Enum to represent the shape of a game piece.
 *
 * @author Lynden
 * @version 2019-03-26
 */
public enum Shape {
	
	THIMBLE, BOOT, RACECAR;
	
	/**
	 * Gives the name of the value of the enum object, in lowercase.
	 * 
	 * @return The enum object's name (either thimble, boot, racecar) in lowercase.
	 */
	public String toString()
	{
		return this.name().toLowerCase();
	}

}
