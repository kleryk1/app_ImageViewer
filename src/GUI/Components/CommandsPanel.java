package GUI.Components;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

import GUI.PjPanel;

public class CommandsPanel extends PjPanel {

	public static final int panel_height = 50;
	private int offset = 0;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	Constructors																				//
	
	public CommandsPanel( int x, int y, Dimension frame_size, int offset, ImagePanel image_panel) {
		super();
		this.offset = offset;
		
		setLocation( x, frame_size.height - panel_height - offset );
		setSize( frame_size.width, panel_height );
		setBackground( Color.blue );
		
		JButton next = new JButton( "next" );
		next.addActionListener( image_panel.getNextAction() );
		next.setLocation(100,  5);
		add( next );
		
		JButton prev = new JButton( "prev" );
		prev.addActionListener( image_panel.getPrevAction() );
		prev.setLocation(5,  5);
		add( prev );
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	get, set, is

	@Override public void setSize( Dimension size ) {
		setSize(size.width, size.height);
	}
	
	@Override public void setSize( int width, int height ) {
		setLocation( getLocation().x, height - panel_height - offset );
		super.setSize(width, panel_height);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * 
	 */
	private static final long serialVersionUID = 5065367047727261806L;

} /* End-of File! */
