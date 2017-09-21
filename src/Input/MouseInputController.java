package Input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import RobotGame.Scene;

/**
 * Manages Mouse Input in the entire game
 * @see MouseListener
 */
public class MouseInputController implements MouseListener{

	//Tells whether the mouse is being held down
	private boolean mouseDown = false;
	//The board which listens to this
	private Scene board;
	
	/**
	 * Creates an mouse input
	 */
	public MouseInputController(Scene b){this.board = b;}

	//Mouse Input iplemented methods
	/**Called when the mouse is clicked on the JFrame*/
	public void mouseClicked(MouseEvent arg0) {}
	/**Called when the mouse is held down on the JFrame*/
	public void mousePressed(MouseEvent arg0) {mouseDown = true;}
	/**Called when the mouse is released on the JFrame*/
	public void mouseReleased(MouseEvent arg0) {mouseDown = false;}
	
	//unused methods
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	
	//Getters
	/**@return Whether the mouse is held down*/
	public boolean isMouseDown(){return mouseDown;}
}
