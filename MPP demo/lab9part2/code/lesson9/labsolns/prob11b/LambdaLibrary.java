package lesson9.labsolns.prob11b;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaLibrary {
	
	public static final TriFunction<List<Employee>, Integer, Character, String> SALARY_NAME =
				(emps, salaryBound, letter) -> 
			            emps.stream()
					        .filter(e -> (e.getSalary() > salaryBound))
					        .filter(e -> (e.getLastName().charAt(0) > letter))
					        .map(e -> Employee.fullName(e))
					        .sorted().collect(Collectors.joining(", "));
					
			               
	
}
