package GUI;

/**
 * Determines the type of image of an object

 */
public enum ImageType {
	//All visible object types + string locations

	/* Examples:
	BG("res/BGs/background.png"),
	WIN("res/BGs/win.png"),
	CONTINUE("res/BGs/continue.png"),
	LOSE("res/BGs/lose.png"),
	*/

	NULL("");
	
	//Location of image file for this type
	private String location;
	
	/**
	 * Creates an imageType based on the location of the image
	 * @param location Directory of image in workspace
	 */
	ImageType(String location){
		this.location = location;
	}
	
	/**@return the location of this ImageType*/
	public String getLcoation(){return this.location;}
}
