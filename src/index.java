import GUI.PjFrame;
import IF_Arg.PjArguments;

public class index extends PjFrame{

//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	Constructors																				//

	public index( PjArguments arguments ) {
		super( arguments.getDirPath(), arguments.getImagePath() );
		setVisible( true );
	}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	M A I N
	
	public static void main( String[] args ) {
		
		args = new String[] { "X:\\SandBoxes\\Defiant_SandBox\\JavaLibrariesGit\\app_ImageViewer\\ExecutieForaj\\IMG_20210723_155830.jpg" };
		
		PjArguments arguments = new PjArguments( args );
		
		/* Open with Argument .class image file if possible */
		if( arguments.isStartGui() ) {
			
			/* start GUI */
			new index( arguments )  ;
			
		}
		
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * 
	 */
	private static final long serialVersionUID = -22338915981811208L;
	
} /* End-of File! */
