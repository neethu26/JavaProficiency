package Assignment_5_1_1;

public class PrimeNumberChecker {
	
	protected int a;
	protected String b;
	
	
	public Boolean validate(final Integer  primeNumber) {
	      for (int i = 2; i < (primeNumber / 2); i++) {
	         if (primeNumber % i == 0) {
	            return false;
	         }
	      }
	     return true;
	   }
}