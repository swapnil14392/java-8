package program;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

	public static void main(String[] args) {
		String orgString="listen";
		String angString="silent";
		   checkAnagram(orgString,angString);
	}

	private static void checkAnagram(String orgString, String angString) {
		if(orgString.length()!=angString.length()) {
			System.out.println("given string is not anagram: ");
		}
		boolean isAnagram=Stream.of(orgString.toLowerCase().split(""))
				.sorted()
				.peek(t->System.out.println(t))//debuging sorted value
				.collect(Collectors.joining())
				.equals(
						Stream.of(angString.toLowerCase().split(""))
						.sorted()
						.peek(t->System.out.println(t))
						.collect(Collectors.joining()));
		
		System.out.println("given string is anagram: "+isAnagram);
	}

}
