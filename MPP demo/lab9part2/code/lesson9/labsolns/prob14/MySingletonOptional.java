package lesson9.labsolns.prob14;

import java.util.Optional;
import java.util.function.*;

public class MySingletonOptional {
	static int count = 0;
	private String name = "singleton";
	private static MySingletonOptional instance;
	private MySingletonOptional() {
		count++;
	}
	//static Supplier<MySingletonOptional> supplier = () -> MySingletonOptional.setInstance();
	public static MySingletonOptional getInstance() {
		//return Optional.ofNullable(instance).orElseGet(supplier);
		return Optional.ofNullable(instance).orElseGet(MySingletonOptional::setInstance);
	}
	@Override
	public String toString() {
		return name;
	}
	private static MySingletonOptional setInstance() {
		instance = new MySingletonOptional();
		return instance;
	}
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 50; ++i) {
			MySingletonOptional.getInstance();
		}
		System.out.println(MySingletonOptional.count);
	}
}
