package regularPolygon;

public class RegularPyramids {
	public RegularPyramids(int _numsidesOfBase, double _sidelength,double _height){
		numsidesOfBase = _numsidesOfBase;
		sidelength = _sidelength;
		height = _height;
		base = new PolygonOpp(numsidesOfBase, sidelength);
	}
	
	
	public double lateralArea(){return (1.0/2.0)*(base.perimeter()*height);}
	public double volume(){return (base.area()*height);}
	
	//private instance variable
	private int numsidesOfBase; 
	private double sidelength;
	private double height;
	private PolygonOpp base;
}