import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 8
 *
 * Test class for GamePiece enumeration.
 *
 * @author Lynden
 * @version 2019-03-28
 */
public class GamePieceTest {

	/**
	 * Test for gamePiece constructor and getters
	 */
	@Test
	public void gamePieceGettersTest()
	{
		Assert.assertEquals("GamePiece color  incorrect", Color.BLUE, GamePiece.BLUE_BOOT.getColor());
		Assert.assertEquals("GamePiece shape incorrect", Shape.BOOT, GamePiece.BLUE_BOOT.getShape());
		
		Assert.assertEquals("GamePiece color  incorrect", Color.BLUE, GamePiece.BLUE_RACER.getColor());
		Assert.assertEquals("GamePiece shape incorrect", Shape.RACECAR, GamePiece.BLUE_RACER.getShape());
		
		Assert.assertEquals("GamePiece color  incorrect", Color.GREEN, GamePiece.GREEN_BOOT.getColor());
		Assert.assertEquals("GamePiece shape incorrect", Shape.BOOT, GamePiece.GREEN_BOOT.getShape());
		
		Assert.assertEquals("GamePiece color  incorrect", Color.MAGENTA, GamePiece.MAGENTA_RACER.getColor());
		Assert.assertEquals("GamePiece shape incorrect", Shape.RACECAR, GamePiece.MAGENTA_RACER.getShape());
		
		Assert.assertEquals("GamePiece color  incorrect", Color.RED, GamePiece.RED_RACER.getColor());
		Assert.assertEquals("GamePiece shape incorrect", Shape.RACECAR, GamePiece.RED_RACER.getShape());
		
		Assert.assertEquals("GamePiece color  incorrect", Color.RED, GamePiece.RED_THIMBLE.getColor());
		Assert.assertEquals("GamePiece shape incorrect", Shape.THIMBLE, GamePiece.RED_THIMBLE.getShape());
		
		Assert.assertEquals("GamePiece color  incorrect", Color.YELLOW, GamePiece.YELLOW_BOOT.getColor());
		Assert.assertEquals("GamePiece shape incorrect", Shape.BOOT, GamePiece.YELLOW_BOOT.getShape());
	
	}
	
	/**
	 * Test for MovesFirst method
	 */
	@Test
	public void movesFirstTest()
	{
		GamePiece piece1 = GamePiece.RED_RACER;
		GamePiece piece2 = GamePiece.YELLOW_BOOT;
		
		Assert.assertEquals("MovesFirst method incorrect", piece1, GamePiece.movesFirst(piece1, piece2));
		Assert.assertEquals("MovesFirst method incorrect", piece1, GamePiece.movesFirst(piece2, piece1));
	}
	
	/**
	 * Test for GamePiece toString()
	 */
	@Test
	public void toStringTest()
	{ 
		GamePiece piece2 = GamePiece.YELLOW_BOOT;

		 String expected = "YELLOW_BOOT: a YELLOW boot with priority 7";
		 String actual = piece2.toString();
		 
		 Assert.assertEquals("toString incorrect", expected, actual);
	}
	
	
}
