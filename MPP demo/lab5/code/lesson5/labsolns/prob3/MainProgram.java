package lesson5.labsolns.prob3;
import java.util.ArrayList;
import java.util.List;

public class MainProgram {
	static private List<ClosedCurve> list;
	
	public static void main(String[] args) {
		list = new ArrayList<ClosedCurve>();
		list.add(new Rectangle(10,12));
		list.add(new Circle(12));
		list.add(new Triangle(10, 12));
		double sum = 0.0;
		for(int i=0;i<list.size();i++) {
			sum += list.get(i).computeArea();
		}
		System.out.println("Sum of all areas:" + sum);
	}

}
