import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		// GK - set paddle width
		setWidth(Settings.PADDLE_WIDTH);
		// GK - set paddle height
		setHeight(Settings.PADDLE_HEIGHT);
		// GK - call resetPosition method
		resetPosition();
	}
	
	public void resetPosition() {
		// GK - reset paddle x and y to initial positions
		setX(Settings.INITIAL_PADDLE_X);
		setY(Settings.INITIAL_PADDLE_Y);
	}
	
	public void update() {
		x += xVelocity;
		// GK set paddle barrier for left and right side of screen
		if (x <= 0) {
			setX(0);
		} if (x >= Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH) {
			setX(Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH);
			// >> Recheck why paddle is going off of screen here
		}
	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		// TODO: Set x velocity
		xVelocity = vel;
	}
}
