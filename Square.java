import java.awt.Graphics;


public class Square extends Shape {

    public Square(Point topLeftPoint, int size){

    	super();
	Point topLeft = new Point(topLeftPoint.getXCoord(),topLeftPoint.getYCoord());
        

	public void draw(Graphics g){
		g.drawRect(topLeft.getXCoord(), topLeft.getYCoord(), 
				getSize(), 
				getSize());
		
	}
}
