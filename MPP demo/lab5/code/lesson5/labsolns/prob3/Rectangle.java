package lesson5.labsolns.prob3;

public final class Rectangle implements ClosedCurve {
	private double width;
	private double length;
	
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		double area =  width * length;
		return area;
	}
	public Rectangle(double width, double length)
	{
		this.width = width;
		this.length = length;
	}
	
	public double getWidth()
	{
		return width;
	}
	public double getLength()
	{
		return length;
	}
}
