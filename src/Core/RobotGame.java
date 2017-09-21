package Core;

import GUI.Window;
import Input.KeyboardInputController;

/**
 * Starts the Game
 */
public class RobotGame {

	//Initializes the static Attributes
	static KeyboardInputController kbic = new KeyboardInputController();
	static Window gw = new Window(kbic);
	
	/**
	 * Called on running the program, executes the game code.
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		//Creates a new Updater thread from the Updater class, then starts it.
		Thread updater = new Thread(new Updater());
		updater.start();
		
        gw.setDefaultCloseOperation(gw.EXIT_ON_CLOSE);
        gw.setVisible(true);
	}

	/**
	 * Called every tick from the Updater class.
	 */
	public static void Update(){
		gw.Update();
		gw.repaint();
	}
}
