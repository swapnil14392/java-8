package program;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String:");
		String streamStr = in.nextLine();

		/* using stream */
		Stream.of(streamStr).map(str -> new StringBuilder(str).reverse()).forEach(System.out::println);

		/* Note: reverse word sequence */
		String s = String.join(" ", Pattern.compile(" +").splitAsStream(streamStr)
				.collect(LinkedList::new,
				LinkedList::addFirst, (a, b) -> a.addAll(0, b)));
		System.out.println("reverse word seq: " + s);

		/* Note: reverse word characters */
		String reverse = Pattern.compile(" +").splitAsStream(streamStr)
				.map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println("reverse word char: " + reverse);
		
		in.close();
	}

}
