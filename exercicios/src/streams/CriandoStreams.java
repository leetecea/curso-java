package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "JS ", "Python\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Lisp ", "Ruby ", "Go ", "Perl\n" };
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1 , 3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
// Gera uma stream sem ordenação e potencialmente infinita
		Stream.generate(() -> "a").forEach(print);
//Tem o seed (semente inicial, ponto inicial) 
		Stream.iterate(0, n -> n + 1).forEach(println);
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 34891fdfb7f42ee02e3dcb48adda6a6c0b28674b
