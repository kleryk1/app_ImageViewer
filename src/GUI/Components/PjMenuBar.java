package GUI.Components;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PjMenuBar extends JMenuBar{

//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -	Constructors																				//
	
	public PjMenuBar() {
		super();
		// TODO Auto-generated constructor stub
		
		JMenu menu = new JMenu("Menu");
		
		JMenuItem i1=new JMenuItem("Item 1"); 
		
		JMenu submenu = new JMenu("Item 1");
		submenu.add(i1);
		
		menu.add(i1);
		menu.add(submenu);
		
		add(menu);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * 
	 */
	private static final long serialVersionUID = -2652702688127024189L;

} /* End-of File! */
