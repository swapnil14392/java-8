package program;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class secondLargestNumber {

	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(1,5,0,50,-9);
		System.out.println("find nth largest no:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Optional<Integer>listobj=list.stream()
								.sorted(Comparator.reverseOrder())
								.peek(x->System.out.println(x))
								.skip(n-1).findFirst();
		System.out.println(n+"th largest no: "+listobj);
		in.close();
	}

}
