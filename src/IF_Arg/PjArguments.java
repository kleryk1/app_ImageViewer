package IF_Arg;

import java.io.File;

import Configuration.Config;

public class PjArguments {

	private boolean is_gui_enabled = false;
	private String start_image = null;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	Constructors																				//
	
	public PjArguments( String[] args ) {

		/* if there are no arguments GUI can be started */
		if( args.length > 0 ) {
			/* consider only the first argument */
			is_gui_enabled = isImageAccepted( args[0] );
		}
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    - get, set, is
	
	public boolean isStartGui() { return is_gui_enabled; }
	public String getDirPath() { return new File(start_image).getParent(); }
	public String getImagePath() { return start_image; }
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    - S T A T I C
	
	private boolean isImageAccepted( String argument ) {
		boolean ret_val = false;
		
		/* get file extension */
		String argument_ext = getFileExtention( argument );
		
		/* check if extension is accepted */
		for( String ext : Config.image_extentions ) {
			if( ext.contains(argument_ext) && argument_ext.contains(ext) ) {
				/* check if file exists */
				ret_val = isFile( argument );
				break;
			}
		}
		
		/* set start image */
		if( ret_val == true ) { start_image = argument; }
		
		return ret_val;
	}


	
	private static String getFileExtention( String argument ) {
		String ret_val = "Extension does not exist!";
		String[] pieces = argument.split( "\\." );
		if( pieces.length > 1  ) {
			ret_val = "." + pieces[pieces.length-1];
		}
		return ret_val;
	}
	
	private boolean isFile( String argument ) {
		boolean ret_val = false;
		File file = new File( argument );
		if( file.isFile() && file.exists() ) {
			ret_val = true;
		}
		return ret_val;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////

} /* End-of File! */
