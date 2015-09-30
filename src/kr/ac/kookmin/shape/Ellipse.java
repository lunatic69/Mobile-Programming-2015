package kr.ac.kookmin.shape;

public class Ellipse extends Shape {
	
	int w;
	int h;
	
	public Ellipse(Point center, int h, int w) {
		super(center);
		this.w = w;
		this.h = h;
	}
	//Implement here
	
    public Rectangle getBounds(){
    	return new Rectangle(center, w*2, h*2);
	}
    
    public int getSemiMajorAxis()
    {
    	if(w>h)
    		return w;
    	else
    		return h;
    }
    
    public int getSemiMinorAxis()
    {
    	if(w>h)
    		return h;
    	else
    		return w;
    }
    
    
	
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Ellipse";
	}
}