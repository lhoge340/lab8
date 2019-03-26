
public enum GamePiece {
	
	BLUE_BOOT(GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	BLUE_RACER(GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2), 
	GREEN_BOOT(GamePieceAppearance(Color.GREEN, Shape.BOOT), 8), 
	MAGENTA_RACER(GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1), 
	RED_RACER(GamePieceAppearance(Color.RED, Shape.RACECAR), 0), 
	RED_THIMBLE(GamePieceAppearance(Color.RED, Shape.THIMBLE), 10), 
	YELLOW_BOOT((Color.YELLOW, Shape.BOOT), 7);
	
	private GamePieceAppearance appearance;
	private int priority;
	
	private GamePiece(GamePieceAppearance appearance, int priority)
	{
		this.appearance = appearance;
		this.priority = priority;
	}
	
	public Color getColor()
	{
		return appearance.getColor();
	}
	
	public Shape getShape()
	{
		return appearance.getShape();
	}
	
	public GamePiece movesFirst(GamePiece a, GamePiece b)
	{
		if (a.priority < b.priority)
		{
			return a;
		}
		else 
		{
			return b;
		}
	}
	
	/**
	 * @return output A string of the format "%s: a %s %s with priority %d", with replacements 
	 * in order: 
	 * (1) The name of the enum constant (e.g. BLUE_RACER) 
	 * (2) The name of the game piece's color 
	 * (3) The name of the game piece's shape 
	 * (4) The priority value of the game piece
	 */
	public String toString()
	{
		String output = String.format("%s: a %s %s with priority %d", this.name(), this.getColor(),
				this.getShape(), priority);
		
		return output;
	}
	

}
