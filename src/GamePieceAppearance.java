
public class GamePieceAppearance {
	
	enum Color
	{
		RED, GREEN, BLUE, YELLOW, CYAN, MAGENTA;
		
		int r;
		int g;
		int b;
		
		private Color(int r, int g, int b)
		{
			this.r = r;
			this.g = g;
			this.b = b;
		}
		
		public int getR()
		{
			return r;
		}
		
		public int getG()
		{
			return g;
		}
		
		public int getB()
		{
			return b;
		}
	}
	
	enum Shape
	{
		THIMBLE, BOOT, RACECAR;
		
		public String toString()
		{
			return "";
		}
	}
	
	private Color color;
	
	private Shape shape;
	
	public GamePieceAppearance(Color color, Shape shape)
	{
		this.color = color;
		this.shape = shape;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public Shape getShape()
	{
		return shape;
	}

}
