import java.awt.Rectangle;

public class Sprite {
	
	protected int x,y,width,height;
	
	// Note: This should only set a single value, they can be done in a single statement
	public void setX(int x) {
		// GK - set X Value
		this.x = x;
	}
	public void setY(int y) { 
		// GK - set Y value
		this.y = y;
	}
	public void setWidth(int width) { 
		// GK - set width
		this.width = width;
	}
	public void setHeight(int height) { 
		// GK - set height
		this.height = height;
	}
	
	// Note: Change the "0" to the correct variable
	public int getX() { 
		return x;	// GK - return X
	}
	public int getY() { 
		return y;	// GK - return Y
	}
	public int getWidth() { 
		return width;	// GK - return width
	}
	public int getHeight() { 
		return height;	// GK - return height
	}
	
	Rectangle getRectangle() {
		return new Rectangle(x, y, width, height);
	}
}
