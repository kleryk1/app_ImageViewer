package GUI;

import javax.swing.JFrame;

public class PjFrame extends JFrame {

//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	Constructors																				//
	
	public PjFrame( String dir_path, String file_path ) {
		super();
		
		setLocation( 100, 100 );
		setSize( 100, 100 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
		
		// ToDo - create a pannel for the image
		//     display the image
		//     index all other images from folder
		// ToDo - create a pannel for the commands
		// ToDo - create a menu item
		
		
		System.out.println( dir_path );
		System.out.println( file_path );
		
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
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

} /* End-of File! */
