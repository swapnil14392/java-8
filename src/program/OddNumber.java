package program;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddNumber {

	public static void main(String[] args) {
		System.out.println("Enter the start number:");
		Scanner stno=new Scanner(System.in);
		int start=stno.nextInt();
		System.out.println("Enter the close number:");
		Scanner endno=new Scanner(System.in);
		int end=endno.nextInt();
		List<Integer> odd=	oddNumber(start,end);
		System.out.println("odd list::: "+odd);
	}

	private static List<Integer> oddNumber(int start, int end) {
		List<Integer> list= IntStream.range(start,end).filter(i->i%2!=0).boxed().collect(Collectors.toList());
		return list;
		
		
	}

}
