package Input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Manages keypresses in the entire game
 * @see KeyAdapter
 */
public class KeyboardInputController extends KeyAdapter{
	
	//Variables to control the current direction of movement
	/**Defines possible directions of movement*/
	public enum movement {UP, DOWN, RIGHT, LEFT, ACTION_ONE, ACTION_TWO, ACTION_THREE, ACTION_FOUR, ACTION_FIVE, ACTION_SIX, NULL};
	private movement currDirection = movement.NULL;
	
	/**
	 * Called when a key is released, changes direction of motion based on the key
	 */
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		switch(key){
		case KeyEvent.VK_W:
			this.currDirection = movement.UP;
			break;
		case KeyEvent.VK_S:
			this.currDirection = movement.DOWN;
			break;
		case KeyEvent.VK_A:
			this.currDirection = movement.LEFT;
			break;
		case KeyEvent.VK_D:
			this.currDirection = movement.RIGHT;
			break;
		case KeyEvent.VK_Q:
			this.currDirection = movement.ACTION_TWO;
			break;
		case KeyEvent.VK_E:
			this.currDirection = movement.ACTION_ONE;
			break;
		case KeyEvent.VK_Z:
			this.currDirection = movement.ACTION_FOUR;
			break;
		case KeyEvent.VK_X:
			this.currDirection = movement.ACTION_THREE;
			break;
		case KeyEvent.VK_C:
			this.currDirection = movement.ACTION_FIVE;
			break;
		case KeyEvent.VK_SPACE:
			this.currDirection = movement.ACTION_SIX;
			break;
		}
	}
	
	//Controls the direction of motion
	/**Resets the direction to NULL, meaning no direction*/
	public void resetDir(){this.setDirection(movement.NULL);}
	/**Sets the direction to a given direction*/
	public void setDirection(movement dir){this.currDirection = dir;}
	
	/**@return The current direction of motion*/
	public movement getDirection(){return this.currDirection;}
	
}
