/**
 * Lab 8
 *
 * Enum to represent a color (with rgb values).
 *
 * @author Lynden
 * @version 2019-03-28
 */
public enum Color
	{ 
	/**
	 * RED 	The color red. Has rgb values: 255, 0, 0.
	 * GREEN The color green. Has rgb values: 0, 255, 0.
	 * BLUE The color blue. Has rgb values: 0, 0, 255.
	 * YELLOW The color yellow. Has rgb values: 255, 255, 0.
	 * CYAN The color cyan. Has rgb values: 0 255, 255.
	 * MAGENTA The color magenta. Has rgb values: 255, 0, 255.
	 */
	RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), YELLOW(255, 255, 0), 
		CYAN(0, 255, 255), MAGENTA(255, 0, 255);
		
		int r;
		int g;
		int b;
		
		private Color(int r, int g, int b)
		{
			this.r = r;
			this.g = g;
			this.b = b;
		}
		
		/**
		 * @return The color's red component.
		 */
		public int getR()
		{
			return r;
		}
		
		/**
		 * @return The color's green component.
		 */
		public int getG()
		{
			return g;
		}
		
		/**
		 * @return The color's blue component.
		 */
		public int getB()
		{
			return b;
		}
	}

