public class Queue {

  int n;
  
  boolean trigger = false;

  public synchronized void get() {
    
    while(!trigger){   
       try{
          wait();
       }catch(InterruptedException e){
          System.out.println(e);
       }
    }

    System.out.println("Got:"+this.n);
    trigger = false;
    notify();
  }

  public synchronized void put(int n){
      while(trigger){
          
          try{ wait(); }
          catch(InterruptedException e){
            System.out.println(e);
          }
      
      }
      this.n = n;
      System.out.println("Put : "+n);
      trigger = true;
      notify();
  }
  
}
