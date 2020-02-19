package lesson9.labsolns.prob2.mystream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestFlatMap {

	public static void main(String[] args) {
		System.out.println("Flattening a stream of character streams");
		List<String> list = Arrays.asList("Joe", "Tom", "Abe");
		MyStream<Character> result 
		    = MyStream.of(list).flatMap(s -> characterStream(s));
		System.out.println(result.asList());
		System.out.println("----------------\n");
		
		System.out.println("Testing composability via flatMap");
		System.out.println(FunctionComposer.compose(
				(List<String> l) -> stringStream(l), 
				     (String s) -> characterStream(s)).apply(list).asList());
	}
	
	public static MyStream<Character> characterStream(String s) {
		List<Character> result = new ArrayList<>();
		for (char c : s.toCharArray()) result.add(c);
		return MyStream.of(result);
	}
	
	public static MyStream<String> stringStream(List<String> stringList) {
		return MyStream.of(stringList);
	}


}
