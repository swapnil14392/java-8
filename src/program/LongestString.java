package program;

import java.util.Arrays;
import java.util.List;

public class LongestString {
public static void main(String[] args) {
	List<String> list=Arrays.asList("java","technology","testcase","1");
String longest=	list.stream()
				.reduce((word1,word2)
						-> word1.length()>word2.length()?word1:word2)
				.get();


System.out.println("longest: "+longest);
}
}
