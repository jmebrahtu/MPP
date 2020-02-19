package lesson5.labsolns.prob3;

public final class Triangle implements ClosedCurve {
	private double base;
	private double height;
	
	@Override
	public double computeArea() {
		double area = 1/2 * base * height;
		return area;
	}
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	public double getBase()
	{
		return base;
	}
	public double getHeight()
	{
		return height;
	}
	/*
	public double getArea()
	{
		return area;
	}
	*/
}
