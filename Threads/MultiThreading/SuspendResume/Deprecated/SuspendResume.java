/*
 * This programs tells the usage of suspend and resume , which are deprecated !!!.
 *  
 */
public class SuspendResume{
  @SuppressWarnings("deprecated")
  public static void main(String[] args){
    
    NewThread ob1 = new NewThread("One");
    NewThread ob2 = new NewThread("Two");

    try{
      Thread.sleep(1000);
      ob1.t.suspend();
      System.out.println("Suspending the thread One !!!");
      
      Thread.sleep(1000);
      
      ob1.t.resume();
      System.out.println("Suspending the thread two !!!");
      ob2.t.suspend();
      
      Thread.sleep(1000);
      ob2.t.resume();
    }catch(InterruptedException e){
    
      System.out.println(e);
    }

    try{
       System.out.println("Waiting for the threads to finish !!!");
       ob1.t.join();
       ob2.t.join();
    }catch(InterruptedException e){
        System.out.println(e);
    }
    System.out.println("Main thread exiting !!!");
  }
}
