package regularPolygon;

public class RegularPrisms {
	public RegularPrisms(int _numsidesOfBase, double _sidelength,double _height){
		numsidesOfBase = _numsidesOfBase;
		sidelength = _sidelength;
		height = _height;
		base = new PolygonOpp(numsidesOfBase, sidelength);
	}
	
	
	public double lateralArea(){return (base.perimeter()*height);}
	public double volume(){return (base.area()*height);}
	
	//private instance variable
	private int numsidesOfBase; 
	private double sidelength;
	private double height;
	private PolygonOpp base;
}