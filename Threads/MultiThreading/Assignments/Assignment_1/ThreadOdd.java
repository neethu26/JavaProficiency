public class ThreadOdd implements Runnable { 
  
  public NumberSystem ns;  
  boolean oddOrEven = false;
  protected int count = 0;  

  public ThreadOdd(NumberSystem ns,int n){
    this.ns = ns;
    this.count = n;
    new Thread(this,"Odd").start();
  }

  public void run(){
      for(int i = 2; i <= this.count ; i = i + 2)
         this.ns.getOddNumber();
  }

}
