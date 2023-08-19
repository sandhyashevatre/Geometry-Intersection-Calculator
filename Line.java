
public class Line {

	    private double a;
	    private double b;
	    private double c;

	    public Line(double a, double b, double c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }

	    public double distanceFrom(Point p) {
	    	
	        return Math.abs(a * p.getX() + b * p.getY() + c) / Math.sqrt(a * a + b * b);
	    }

	    public Point intersection(Line other) {
	    	
	        double determinant = a * other.b - other.a * b;
	        if (determinant == 0) {
	        	
	            //lines are parallel, return null to indicate no intersection.
	            return null;
	        } else 
	        {
	            double x = (other.b * c - b * other.c) / determinant;
	            double y = (a * other.c - other.a * c) / determinant;
	            return new Point(x, y);
	        }
	    }
	


}
