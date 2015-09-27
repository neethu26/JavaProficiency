public class SuspendResume {
  
  public static void main(String[] args){
    NewThread thread1 = new NewThread("One");
    NewThread thread2 = new NewThread("Two");
    
    try{
      Thread.sleep(1000);
      System.out.println("Suspending the thread - thread1");
      thread1.setSuspend();
      Thread.sleep(1000);
      System.out.println("Currently executing thread is "+Thread.currentThread());
      System.out.println("Releasing  the thread - thread1");
      thread1.setResume();
      System.out.println("Suspending the thread - thread2");
      thread2.setSuspend();
      System.out.println("Currently executing thread is "+Thread.currentThread()); 
      Thread.sleep(1000);
      System.out.println("Releasing the thread  - thread2");
      thread2.setResume();
      System.out.println("Currently executing thread is "+Thread.currentThread());
    }catch(InterruptedException e){
      System.out.println(e);
    }

    try{
        System.out.println("Waiting for the threads to finish");
        thread1.t.join();
        System.out.println("thread1 got exited!!!");
        thread2.t.join();
        System.out.println("thread2 got exited!!!");
        System.out.println("Currently executing thread is "+Thread.currentThread());  
    }catch(InterruptedException e){
        System.out.println(e);
    }
    System.out.println("Main thread is finished!!");
  }

}
