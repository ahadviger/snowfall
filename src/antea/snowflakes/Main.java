package antea.snowflakes;

import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String[] args) {
		
		Constants.initialize();
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new MainWindow().setVisible(true);
			}
		});
	}
}
