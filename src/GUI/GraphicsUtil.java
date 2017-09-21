package GUI;

import java.awt.*;

public class GraphicsUtil {

	public static void drawSquare(Graphics g, int x, int y, int sideLength, Color color){
		Color initCol = g.getColor();
		g.setColor(color);
		g.fillRect(x*sideLength, y*sideLength, sideLength, sideLength);
		g.setColor(initCol);
	}
}
