package antea.snowflakes;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.Random;

import javax.swing.ImageIcon;

public class Constants {

	public static int NUMBER_OF_SNOWFLAKES = 180;
	public static int FALL_SPEED = 4;
	public static int REFRESH_RATE = 40;
	public static int FALL_PERIOD = 300;
	public static int MAX_FALL_AMPLITUDE = 20;
	public static int MAX_FALL_PHASE = 150;
	public static String IMAGE_NAME = "snowflake.png";
	
	public static Random rand;
	public static ImageIcon image;
	public static int SCREEN_WIDTH, SCREEN_HEIGHT;
	
	public static void initialize() {
		rand = new Random();
		image = new ImageIcon(Constants.class.getClassLoader().getResource(IMAGE_NAME));
		
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		SCREEN_WIDTH = gd.getDisplayMode().getWidth();
		SCREEN_HEIGHT = gd.getDisplayMode().getHeight();
	}
}
