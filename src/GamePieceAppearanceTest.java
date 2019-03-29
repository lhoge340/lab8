import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 8
 *
 * Test class for GamePieceAppearance class.
 *
 * @author Lynden
 * @version 2019-03-28
 */
public class GamePieceAppearanceTest {
	
	/**
	 * Test for constructor of a GamePiece and tests the getters
	 */
	@Test
	public void gamePieceAppearanceTest()
	{
		GamePieceAppearance testPiece = new GamePieceAppearance(Color.YELLOW, Shape.THIMBLE);
		Assert.assertEquals("getColor incorrect for testPiece", Color.YELLOW, testPiece.getColor());
		Assert.assertEquals("getShape incorrect for testPiece", Shape.THIMBLE, testPiece.getShape());
	}

}
