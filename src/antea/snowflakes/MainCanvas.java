package antea.snowflakes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class MainCanvas extends JComponent {

	private static final long serialVersionUID = 8573570891586814358L;

	private List<Snowflake> snowflakes;

	public MainCanvas() {
		this.snowflakes = new ArrayList<>();
		for(int i = 0; i < Constants.NUMBER_OF_SNOWFLAKES; ++i) {
			this.snowflakes.add(new Snowflake(
					Constants.rand.nextInt(Constants.SCREEN_WIDTH), 
					Constants.rand.nextInt(Constants.SCREEN_HEIGHT),
					Constants.FALL_PERIOD,
					Constants.rand.nextInt(Constants.MAX_FALL_AMPLITUDE),
					Constants.rand.nextInt(Constants.MAX_FALL_PHASE)));
		}
	}

	public void fall() {
		for(Snowflake s : snowflakes) {
			s.fall();
		}
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		for(Snowflake s : snowflakes) {
			g.drawImage(Constants.image, s.getX(), s.getY(), null);
		}
	}
}
