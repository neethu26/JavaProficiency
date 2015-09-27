import java.util.*;
public class PrimeNumber implements Runnable {
  protected int n;	
	
  public PrimeNumber(int n){
	  this.n = n;
  }
	
  public void run(){
     int count = 1;
     for(int i = 2; i <= this.n; i++){
    	 if(this.n % i == 0)
    		 count += 1;
     }	
     if(count == 2)
    	 System.out.println(this.n + " is a  Prime Number ");
     else
    	 System.out.println(this.n + " is not a Prime Number ");
  }
  
  public static void main(String[] args){
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter the prime number\n");
	  Runnable t = new PrimeNumber(in.nextInt());
	  
	  Thread thread = new Thread(t);
	  thread.start();
	  
  }
  
   	
	
}

