/**
 * Lab 8
 * 
 * Class to represent the appearance of a game piece. That is, the color and shape of a game piece.
 * 
 * @author Lyndee
 * @version 2019-03-28
 *
 */
public class GamePieceAppearance {

	private Color color;
	
	private Shape shape;
	 
	/**
	 * Stores the color and shape describing the appearance of the game piece.
	 * @param color The game piece's color.
	 * @param shape The game piece's shape.
	 */
	public GamePieceAppearance(Color color, Shape shape)
	{
		this.color = color;
		this.shape = shape;
	}
	
	/**
	 * Gets the color of the game piece.
	 * @return The game piece's color.
	 */
	public Color getColor()
	{
		return color;
	}
	
	/**
	 * Gets the shape of the game piece.
	 * @return The game piece's shape.
	 */
	public Shape getShape()
	{
		return shape;
	}

}
