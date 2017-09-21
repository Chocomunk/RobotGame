package GUI;

import java.awt.*;

import javax.swing.JFrame;

import Input.KeyboardInputController;
import RobotGame.Scene;

/**
 * Holds and manages all graphical objects/settings
 * @see JFrame
 */
@SuppressWarnings("serial")
public class Window extends JFrame{

    private static final String TITLE = "Robot Game";

    //Background
    private final Color bg = Color.BLACK;
    final Scene gb;
 
    //Size of program, hardcoded values to fit components better
    int width = 768+127;
    int height = 768+149;
     
    /**
     * Creates a window to host the game in, and adds the KeyboardInputController
     * @param kbic 
     */
    public Window(KeyboardInputController kbic) {
    	super(TITLE);
        init();
        
        gb = new Scene(kbic);
        this.add(gb, BorderLayout.CENTER);
        this.addKeyListener(kbic);
    }
  
    /**
     * Sets options for the window
     */
    public void init() {
        setSize(width, height);
        setBackground(bg);
        this.setSize(888-11, 888+11);
        repaint();
    }
    
    /**
     * Called every tick, updates all objects on local gameboard
     */
    public void Update(){
    	gb.Update();
    }
}
