import GUI.PjFrame;

public class index extends PjFrame{

//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	Constructors																				//

	public index( String image_file ) {
		super();
		
		// tOdO Step1 start frame
		// display the image
		// index all other images from folder
		
		// tOdO Step2
		// update the displayngg panel to add zoom controles like on original
		
		// tOdO Step3 
		// design the interface like original
		
		// image viewer should remember the screet it was stored on.
		
		// tOdO Step4
		// add crop and other tools do update rhe SW
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	get, set, is

	private static String getImageFile( String[] args ) {
		String ret_val = ".";
		return ret_val;
	}
	
	private static boolean isArgumentCorrect( String[] args ) {
		boolean ret_val = false;
		// ToDo - check if arguments are correct
		/*
		 * must be a file, a image file of supported format (JPEG, PNG)
		 * 
		 * 
		 */
		return ret_val;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	M A I N
	
	public static void main( String[] args ) {
		
		/* Open with Argument .class image file if possible */
		if( isArgumentCorrect( args ) ) {
			
			new index( getImageFile( args ) );
			
		}
		
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * 
	 */
	private static final long serialVersionUID = -22338915981811208L;
	
} /* End-of File! */
