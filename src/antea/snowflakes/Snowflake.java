package antea.snowflakes;

public class Snowflake {

	private int x, y;
	private int baseX;
	
	// period, amplitude and phase delay for sine function
	private int p, a, f;
	
	public Snowflake(int x, int y, int p, int a, int f) {
		this.x = x;
		this.baseX = x;
		this.y = y;
		this.p = p;
		this.a = a;
		this.f = f;
	}
	
	public void fall() {
		this.y += Constants.FALL_SPEED;
		if(this.y >= Constants.SCREEN_HEIGHT) {
			this.y = 0;
			this.baseX = Constants.rand.nextInt(Constants.SCREEN_WIDTH);
		}
		this.x = baseX + (int)(a * Math.sin(2 * Math.PI / p * this.y + this.f));
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
