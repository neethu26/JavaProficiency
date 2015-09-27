public class ThreadEven implements Runnable{
  
  NumberSystem ns;  
  protected int count = 0; 

  public ThreadEven(NumberSystem ns, int n){
    this.ns = ns;
    this.count = n;
    new Thread(this,"Even").start();
  }
   
  public void run(){
      for(int i = 2; i <= this.count ; i = i + 2 )
         this.ns.getEvenNumber(); 
  }

}
