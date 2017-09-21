package GUI;

import java.awt.*;

/**
 * Provides static utility variables for drawing basic graphics
 */
public class GraphicsUtil {

	/**
	 * Draws a square with a given position, dimension, and color
	 * @param g Graphics object (given in JFrame)
	 * @param x x-Position on screen
	 * @param y y-Position on screen
	 * @param sideLength Side length of the drawn square
	 * @param color Color of the drawn square
	 */
	public static void drawSquare(Graphics g, int x, int y, int sideLength, Color color){
		Color initCol = g.getColor();
		g.setColor(color);
		g.fillRect(x*sideLength, y*sideLength, sideLength, sideLength);
		g.setColor(initCol);
	}

	/**
	 * Draws a line with given endpoints, unit scale (in pixels per unit), and color
	 * @param g Graphics object (given in JFrame)
	 * @param x1 x-Position of the first point on the screen
	 * @param y1 y-Position of the first point on the screen
	 * @param x2 x-Position of the second point on the screen
	 * @param y2 y-Position of the second point on the screen
	 * @param scale Scale of the units in pixels per unit
	 * @param color Color of the drawn line
	 */
	public static void drawLine(Graphics g, int x1, int y1,  int x2, int y2, int scale, Color color){
		Color initCol = g.getColor();
		g.setColor(color);
		g.drawLine(x1*scale, y1*scale, x2*scale, y2*scale);
		g.setColor(initCol);
	}
}
