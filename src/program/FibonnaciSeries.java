package program;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonnaciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the fibo series number:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(generate(n));
		
	}
	
	public static List<Integer> generate(int series) {
		return Stream.iterate(new int [] {1,1},s->new int[]{s[1],s[0]+s[1]})
				.limit(series)
				.map(n->n[0])
				.collect(Collectors.toList());
		
	}
}
