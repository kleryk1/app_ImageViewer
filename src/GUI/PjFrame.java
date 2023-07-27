package GUI;

import java.awt.Component;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import GUI.Components.CommandsPanel;
import GUI.Components.ImagePanel;
import GUI.Components.PjMenuBar;

public class PjFrame extends JFrame implements ComponentListener {

	private static final int menu_hight_offset = 60;
	
	/** Content panel replacement */
	private PjPanel main_panel = new PjPanel();
	
	private ImagePanel image_panel = null;
	private CommandsPanel button_panel = null;
	
	private PjMenuBar menu_bar = null;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	Constructors																				//
	
	public PjFrame( String dir_path, String file_path ) {
		super();
		
		setLocation( 100, 100 );
		setSize( 500, 500 );
		addComponentListener( this );
		setTitle( file_path );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
		setContentPane( main_panel );
		
		image_panel = new ImagePanel( 0, 0, getSize(), CommandsPanel.panel_height+menu_hight_offset, dir_path, file_path );
		add( image_panel );
		
		button_panel = new CommandsPanel( 0, 200, getSize(), menu_hight_offset );
		add( button_panel );
		
		menu_bar = new PjMenuBar();
		setJMenuBar( menu_bar );
		
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
//    -	add

	@Override public Component add( Component comp ){
		main_panel.add( comp );
		return this;
	}
	public Component add( Component[] comp ){
		for( Component C: comp ){
			main_panel.add( C );
		}
		return this;
	}
	
	public Component add( ArrayList<Component> comp ){
		for( Component C: comp ){
			main_panel.add( C );
		}
		return this;
	}
	
	@Override public Component add( Component comp, int index ) {
		main_panel.add( comp, index );
		return this;
	}
	@Override public void add( Component comp, Object constraints, int index ) {
		main_panel.add( comp, constraints, index );
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	ComponentListener
	
	@Override public void componentResized( ComponentEvent evt ) {
		/* if the frame is resized also the pannels should be resized */
		image_panel.setSize( getSize() );
		button_panel.setSize( getSize() );
		repaint();
	}
	@Override public void componentMoved( ComponentEvent evt ) { }
	@Override public void componentShown( ComponentEvent evt ) { }
	@Override public void componentHidden( ComponentEvent evt ) { }
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

} /* End-of File! */
