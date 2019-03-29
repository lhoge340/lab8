import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 8
 *
 * Test class for Color enumeration.
 *
 * @author Lynden
 * @version 2019-03-28
 */
public class ColorTest 
{	
	/**
	 * Tests for correct values for each color and tests the getters for each color
	 */
	@Test
	public void testColorValues()
	{
		
		Color col = null;
		
		//RED:
		col = Color.RED;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());
	
		//GREEN:
		col = Color.GREEN;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());
	
		//BLUE: 
		col = Color.BLUE;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());
	
		//YELLOW:
		col = Color.YELLOW;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());
	
		//CYAN:
		col = Color.CYAN;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());
	
		//MAGENTA:
		col = Color.MAGENTA;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());

	}	
}
