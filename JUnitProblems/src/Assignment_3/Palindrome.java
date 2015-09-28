package Assignment_3;

public class Palindrome {
  
  public boolean getReverseString(String value){
	  return new StringBuilder(value).reverse().toString().equals(value);
	  
  }
	
}
