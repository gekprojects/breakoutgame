import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		// GK - set size of windows from settings
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		// GK - set the title
		setTitle(Settings.WINDOW_NAME);
		// GK - set the background color to white
		setBackground(Color.white);
		// GK - set resizable to false
		setResizable(false);
		
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
		// GK - set visible to true
        setVisible(true);
        
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	        	 new Breakout();	
	         }
		});

	}
}
