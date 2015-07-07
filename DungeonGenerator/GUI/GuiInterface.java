package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.*;

/**
 * DnD_Dungeon_Gen: 
 * The main class upon which all other classes come together to run.
 * @author Thomas Man
 */

public class GuiInterface extends JFrame {
	
	//EventHandler eh = new EventHandler();
	
	private JPanel firstSetting = new JPanel(new GridLayout());
	
	public GuiInterface() throws IOException {
		this.setTitle("Dungeons and Dragon Dungeons Generator");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		this.setSize(900, 600);
		this.setLayout(new BorderLayout());
		
		// set the window to appear in the center of the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height
				/ 2 - this.getSize().height / 2);
		
	}
	
	/**
	 * Main method for the DnD Dungeon Creator
	 * @author Thomas Man
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		GuiInterface first  = new GuiInterface();
		first.setVisible(true);

	}//end main method
	
	
	
	
}
