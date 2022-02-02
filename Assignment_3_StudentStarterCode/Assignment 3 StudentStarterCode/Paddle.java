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
		// TODO: Prevent the paddle from moving outside of the screen
		// This can be done using two if statements (one for the left side of the screen and one for the right)
		
	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		// TODO: Set x velocity
		vel = xVelocity;
	}
}
