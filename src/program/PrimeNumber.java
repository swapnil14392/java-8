package program;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PrimeNumber {

	public static void main(String[] args) {
		/* method-1 : 
		 * BigInteger class having nextProbablePrime method return probably prime numbers 
		  */
		  Stream.iterate(BigInteger.valueOf(2), BigInteger::nextProbablePrime)
		  .limit(10) .forEach(x->System.out.format("%s ", x)); 
		  System.out.println();
			System.out.println("**************************"); 
		
			/* method-2 using predefine list */ 

		 System.out.println(Stream.iterate(1, i -> ++i)
				 .filter(i -> i %2 != 0)
				  .filter(PrimeNumber::isPrime).limit(10)
                             .collect(toList()));
		 
	}
	 public static boolean isPrime(int number) {
		
		 return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0); 
	    }

	
}
