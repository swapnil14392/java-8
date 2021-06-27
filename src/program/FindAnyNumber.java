package program;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindAnyNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no to find!!!");
		int no=in.nextInt();
		List<Integer> list=  Arrays.asList(1,5,7,10,5,6,80);
	String res=	findNumber(list,no);
	System.out.println("match No result is: "+res);

	}

	private static String findNumber(List<Integer> list, int no) {
		List<Integer> l=	list.stream().filter(x->x==no).collect(Collectors.toList());
		System.out.println("List:" +l);
		if(!l.isEmpty()) {
			return "YES";
		}
		else {
			return "NO";
		}
		
	}

}
