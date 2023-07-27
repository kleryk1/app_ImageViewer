package GUI.Components;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import GUI.PjPanel;

public class ImagePanel extends PjPanel {
	
	private int offset = 0;
	
	private String dir_path = null;
	private int crt_index = -1;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	Constructors																				//
	
	public ImagePanel( int x, int y, Dimension frame_size, int offset, String dir_path, String file_path ) {
		super();
		
		this.offset = offset;
		this.dir_path = dir_path;
		
		setLocation( x, y );
		setSize( frame_size.width, frame_size.height );
		
		try {
			BufferedImage img = ImageIO.read(new File(file_path));
			setBackgroundImage( img );
			
		} catch ( IOException ex ) { ex.printStackTrace(); }
		
		// ToDo index all other images from current folder
		// ToDo determine the current image index
		
		System.out.println( this.dir_path );
		System.out.println( crt_index );
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	get, set, is

	@Override public void setSize( Dimension size ) {
		setSize(size.width, size.height);
	}
	
	@Override public void setSize( int width, int height ) {		
		super.setSize(width, height-offset);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * 
	 */
	private static final long serialVersionUID = -8133983198884793732L;

} /* End-of File! */
