package interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindDuplicateCharInString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println("input string is: " + str);
		if(str==null) {
			System.out.println("null String");
			return;
		}
		if(str.isEmpty()) {
			System.out.println("given input string is empty"); 
			return;
		}
		if(str.length()==1) {
			System.out.println("Single Character");
			return;
		}
		
		
		Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
		.entrySet().stream()
	    .filter(i -> i.getValue() > 1)
	    .forEach(System.out::println);
		
	}

}
