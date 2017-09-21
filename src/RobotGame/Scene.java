package RobotGame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JComponent;
import Input.KeyboardInputController;
import Input.MouseInputController;

/**
 * Holds and manages all gameobjects
 * @see JComponent
 */
@SuppressWarnings("serial")
public class Scene extends JComponent{
	
	//Declares game aspects, and UI handlers
	private KeyboardInputController kbic;
	private MouseInputController mic;

	//Controls the state of the game
	public enum gameState {WIN, LOSE, PLAYING};
	public gameState currState = gameState.PLAYING;
	
	
	//Scale of the game
	private double scale,size;
	private int xscale,yscale;
	
    /**
     * Initializes component and variables
     * @param kbic 
     */
    public Scene(KeyboardInputController kbic){
    	this.kbic = kbic;
    	init();
    }
    
    /**
     * Sets up Objects required for the game, and their initial state
     */
    void init(){
    	scale = 1;
    	this.mic = new MouseInputController(this);
    	this.addMouseListener(mic);

    }

    /**
     * Called every tick, draws the background, visual grid, then game objects and buttons
     */
    public void paint(Graphics g) {
    	
    	//Calculates screen ratio values
    	scale = this.getWidth()<this.getHeight()?this.getWidth():this.getHeight();
    	scale /= 888;
    	size = this.getWidth()>this.getHeight()?this.getWidth():this.getHeight();
    	xscale = size==this.getWidth()?1:0;
    	yscale = size==this.getHeight()?1:0;
    	
    	//Code to smooth pictures on scaling, idea from: http://stackoverflow.com/questions/25368499/how-can-i-draw-smooth-buffered-images-in-java
    	Graphics2D g2d = (Graphics2D) g;
    	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    	g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

    	switch (this.currState){
		    case PLAYING:
		    	/*
		    	    CODE HERE
		    	 */
		    	break;
		    case WIN:
		    	/*
		    	    CODE HERE
		    	 */
		    	break;
		    case LOSE:
		    	/*
		    	    CODE HERE
		    	 */
		    	break;
	    }
    }
	
    /**
     * Called every tick
     */
    public void Update(){

	    switch (this.currState){
		    case PLAYING:
		    	/*
		    	    CODE HERE
		    	 */
			    break;
		    case WIN:
		    	/*
		    	    CODE HERE
		    	 */
			    break;
		    case LOSE:
		    	/*
		    	    CODE HERE
		    	 */
			    break;
	    }
    }

	//Accessors
	/**@return The KeyboardInputController used throughout the program*/
	public KeyboardInputController getKeyboardController() {return kbic;}
	/**@return The scale of the program*/
	public double getScale() {return scale;}
}
