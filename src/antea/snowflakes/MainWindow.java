package antea.snowflakes;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = -6024988551516150229L;

	public MainWindow() {
		this.setUndecorated(true);
		this.setBackground(new Color(0, 0, 0, 0));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.pack();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLocation(-1, -1);
		this.setLocationRelativeTo(null);

		MainCanvas canvas = new MainCanvas();
		this.add(canvas);

		Timer t = new Timer();
		t.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				canvas.fall();
			}
		}, 0, Constants.REFRESH_RATE);
	}
}
