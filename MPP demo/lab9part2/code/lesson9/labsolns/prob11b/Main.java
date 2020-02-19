package lesson9.labsolns.prob11b;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		System.out.println(LambdaLibrary.SALARY_NAME.apply(list, 100000, new Character('M')));
		
//		EmployeeQueries eq = new EmployeeQueries();
//		System.out.println("Number of Employees making more than $120000, with first letter of last name "  
//		   + "after 'L': " + eq.countNumAboveAfter(list, 120000, 'L'));
//		System.out.println("Sorted list of Employees making more than $80000, with first letter of last name after 'K' " 
//		   + eq.getSortedListAboveAfterUpper(list, 80000, 'K'));
//				               
		             

	}
	
	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
