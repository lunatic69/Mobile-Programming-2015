package kr.ac.kookmin.shape;

public abstract class Shape {
	protected Point center;
	
    protected Shape(Point center) {
		this.center = center;
	}

	public Point getCenter() {
		return center;
	}
	
	public Rectangle getBounds() {
		//return new Rectangle(center, 0, 0);		
		return null;
	}

	public void draw(Graphics g) {
		
	}


	
//Implement here
    
}
