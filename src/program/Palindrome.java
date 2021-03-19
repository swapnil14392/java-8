package program;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String:");
		String palStream = in.nextLine();
		String temp=palStream.replaceAll("\\s+", "");
		
		boolean p=	IntStream.range(0, temp.length()/2)
					.noneMatch(i->temp.charAt(i)!=temp.charAt(temp.length()-i-1));
		
		System.out.println(palStream+" is palindrome: "+p);
		in.close();
	}

	
}
