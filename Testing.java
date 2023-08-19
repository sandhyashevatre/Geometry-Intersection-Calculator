
public class Testing {

	    public static void main(String[] args) {
	    	
	        // Create lines y = x + 5 and y = 2x + 10
	    	
	        Line line1 = new Line(-1, 1, 5);
	        Line line2 = new Line(-2, 1, 10);

	        // intersection point
	        Point intersectionPoint = line1.intersection(line2);

	        if (intersectionPoint != null) {
	        	
	           
	        	
	        	
	            Point origin = new Point(0, 0);
	            double distance = intersectionPoint.distanceFrom(origin);
	            System.out.println("Distance from the origin to the intersection point: " + distance);
	        } else {
	            System.out.println(" lines are parallel and do not intersect.");
	        }
	    }

}
