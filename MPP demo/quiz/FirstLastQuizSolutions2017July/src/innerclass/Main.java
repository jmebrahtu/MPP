package innerclass;

import static java.util.Comparator.comparing;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import quizclasses.Employee;
import quizclasses.EmployeeTestData;
import quizclasses.Pair;
import quizclasses.Trader;
import quizclasses.TraderTransactTestData;
import quizclasses.Transaction;


public class Main {
	public static void main(String[] args) {
		class NameLength implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getName().length() > 5;
			}
		}
		class BirthYear implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getYearOfBirth() > 1970;
			}
		}
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		//Print all Employee records for which name has length > 5 and birth year is > 1970
		List<Employee> result = sampleData.stream()
							        .filter(new NameLength())
							        .filter(new BirthYear())
							        .collect(Collectors.toList());
		System.out.println(result);
				
		prob1();
		prob2();
		prob3();
	}
	
	//Transform your pipeline solution to prob1 in the pipleline package so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob1() {
		class EmpPredicate implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getSalary() > 55000 && e.getSalary() < 120000;
			}
		}
		class Mapper implements Function<Employee, Pair> {
			public Pair apply(Employee e) {
				return new Pair(e.getName(), e.getSalary());
			}
		}
		//The next two classes use a different approach to sorting
		//than was used in the lambda versions
		class NameCompareFunc implements Function<Pair, String> {
			public String apply(Pair p) {
				return p.name;
			}
		}
		class SalaryCompareFunc implements Function<Pair, Double> {
			public Double apply(Pair p) {
				return -p.salary;
			}
		}
		
		//use this list 
		List<Employee> list = EmployeeTestData.getList();
		list.stream()
	        .filter(new EmpPredicate())
	        .map(new Mapper())
	        .sorted(Comparator.comparing(new NameCompareFunc())
	        .thenComparing(new SalaryCompareFunc()))
	        .collect(Collectors.toList());
		System.out.println(list);
	}
	
	///Transform your pipeline solution to prob1B so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob2() {
		class TransPredicate implements Predicate<Transaction> {
			public boolean test(Transaction t) {
				return t.getYear()==2011;
			}
		}
		class ValueFunction implements Function<Transaction, Integer> {
			public Integer apply(Transaction t) {
				return t.getValue();
			}
		}
		List<Transaction> list = TraderTransactTestData.getTransactions();
		list.stream()
	        .filter(new TransPredicate())
	        .sorted(comparing(new ValueFunction()))
	        .collect(Collectors.toList());
		System.out.println(list);
	}
	
	//Transform your pipeline solution to prob1C so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob3() {
		class TransFunction implements Function<Transaction, Trader> {
			public Trader apply(Transaction t) {
				return t.getTrader();
			}
		}
		class CityPredicate implements Predicate<Trader> {
			public boolean test(Trader t) {
				return t.getCity().equals("Cambridge");
			}
		}
		class TraderToName implements Function<Trader, String> {
			public String apply(Trader t) {
				return t.getName();
			}
		}
		List<Transaction> list = TraderTransactTestData.getTransactions();  
		list.stream()
	        .map(new TransFunction())
	        .filter(new CityPredicate())
	        .distinct()
	        .sorted(Comparator.comparing(new TraderToName()))
	        .collect(Collectors.toList());
		
	                
	}
}
