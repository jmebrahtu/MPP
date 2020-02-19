package lesson9.labsolns.prob2.mystream;
import java.util.function.*;

public class FunctionComposer {
	public static <R,S,T>  Function<T, MyStream<R>> 
	         compose(Function<T, MyStream<S>> g, Function<S, MyStream<R>> f) {
		Function<T, MyStream<R>> h = new Function<T, MyStream<R>>() {

			@Override
			public MyStream<R> apply(T t) {
				return g.apply(t).flatMap(f);
			}
			
		};
		return h;
	}
}
