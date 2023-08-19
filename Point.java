
public class Point {
	   private double x;
	    private double y;

	    public Point(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	    public double getX() {
	        return x;
	    }

	    public double getY() {
	        return y;
	    }

	    public double distanceFrom(Point other) {
	    	
	        double dx = other.getX() - x;
	        double dy = other.getY() - y;
	        return Math.sqrt(dx * dx + dy * dy);
	    }

}
/* Cramer's Rule is used to solve a system of linear equation
 *  x = (b2c1 - b1c2) / (a1b2 - a2b1)
 */// y = (a1c2 - a2c1) / (a1b2 - a2b1)    /*