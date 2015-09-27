public class NewThread implements Runnable{
  
  Thread t;

  public NewThread(String threadName){
    t = new Thread(this,threadName);
    System.out.println("Child Thread Created "+t);
    t.start();
  }

  public void run() {
    try{
      for(int i = 5 ; i > 0; i--){
       System.out.println(i);
       Thread.sleep(5000);
      }
    }catch(InterruptedException e){
      System.out.println(e);
    }   
  }

  public static void main(String[] args){
   new NewThread("JamesJohnson"); 

   for(int i = 5; i > 0; i--){
     try{
        Thread.sleep(3000);
        System.out.println("Hello This is the main method");
     }catch(InterruptedException e){
        System.out.println(e);
     }
   }

  }
}
