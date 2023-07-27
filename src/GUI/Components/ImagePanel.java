package GUI.Components;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import GUI.PjPanel;
import IF_Arg.PjArguments;

public class ImagePanel extends PjPanel {
	
	private int offset = 0;
	
	private ArrayList<String> file_list = new ArrayList<String>();
	private int crt_index = -1;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	Constructors																				//
	
	public ImagePanel( int x, int y, Dimension frame_size, int offset, String dir_path, String file_path ) {
		super();
		
		this.offset = offset;
		
		setLocation( x, y );
		setSize( frame_size.width, frame_size.height );
		
		try {
			BufferedImage img = ImageIO.read(new File(file_path));
			setBackgroundImage( img );
		} catch ( IOException ex ) { ex.printStackTrace(); }
		
		/* get all images from the current folder */
		getAllImages( dir_path, file_path );
		
//		for( String str : file_list ) { System.out.println( str ); }
//		System.out.println( crt_index );
		
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
//    - S T A T I C
	
	public ActionListener getNextAction() {
		ActionListener ret_val = new ActionListener() {
			@Override public void actionPerformed(ActionEvent evt) {
				crt_index = ((crt_index+1) == file_list.size()) ? (crt_index = 0) : (crt_index+1);
				//System.out.println( crt_index );
				try {
					BufferedImage img = ImageIO.read( new File(file_list.get( crt_index ) ) );
					setBackgroundImage( img );
				} catch (IOException ex) { ex.printStackTrace(); }
				repaint();
			}
		};
		return ret_val;
	}

	public ActionListener getPrevAction() {
		ActionListener ret_val = new ActionListener() {
			@Override public void actionPerformed(ActionEvent evt) {
				crt_index = ((crt_index-1) == -1) ? (crt_index = file_list.size()-1) : (crt_index-1);
				//System.out.println( crt_index );
				try {
					BufferedImage img = ImageIO.read( new File(file_list.get( crt_index ) ) );
					setBackgroundImage( img );
				} catch (IOException ex) { ex.printStackTrace(); }
				repaint();
			}
		};
		return ret_val;
	}
	
	private void getAllImages( String dir_path, String file_path ) {
		for( File file : new File( dir_path ).listFiles() ) {
			/* index all other images from current folder */
			if( PjArguments.isImageAccepted( file.getAbsolutePath() ) ) {
				file_list.add( file.getAbsolutePath() );
				/* determine the current image index */
				if( file.getAbsolutePath().contains(file_path) && file_path.contains(file.getAbsolutePath()) ) {
					crt_index = file_list.size()-1;
				}
			}
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * 
	 */
	private static final long serialVersionUID = -8133983198884793732L;

} /* End-of File! */
