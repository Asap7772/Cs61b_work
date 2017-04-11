package regularPolygon;

public class PolygonOpp {
	
	public PolygonOpp(int n, double x){
		sides = n;
		length = x;
	}
	
	public double perimeter(){return (length * sides);}
	public double measureOfInteriorAngle(){return (180.0*(sides-2))/(sides);}
	public double measureOfExteriorAngle(){return(360.0/sides);}
	public double measureOfApothem(){return Math.pow(Math.tan(Math.toRadians((measureOfInteriorAngle())/(2.0))),-1)*(length/2);}
	public double area(){return (measureOfApothem()) * (perimeter()); }
	
	private final int sides;
	private final double length;
}
