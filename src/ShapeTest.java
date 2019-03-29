import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 8
 *
 * Test class for Shape enumeration.
 *
 * @author Lynden
 * @version 2019-03-28
 */
public class ShapeTest {

	/**
	 * Tests for the correct toString() for each of the shapes
	 */
	@Test
	public void shapeToStringTest()
	{
		Shape shape = null;
		
		//THIMBLE:
		shape = Shape.THIMBLE;
		Assert.assertEquals("toString is incorrect for " + shape.name(), "thimble", shape.toString());
		
		//BOOT:
		shape = Shape.BOOT;
		Assert.assertEquals("toString is incorrect for" + shape.name(), "boot", shape.toString());
		
		//RACECAR:
		shape = Shape.RACECAR;
		Assert.assertEquals("toString is incorrect for" + shape.name(), "racecar", shape.toString());
	}
	
}
