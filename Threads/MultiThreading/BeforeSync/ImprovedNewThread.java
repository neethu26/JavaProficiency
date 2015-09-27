public class ImprovedNewThread extends Thread{
   Thread t; 
  public ImprovedNewThread(String nameOfThread){
    t = new Thread(this,nameOfThread);
    System.out.println(this.getName() + " is created !!!");
    t.start();
  }

  public void run(){
    for(int i = 5; i > 0 ; i--){
        try{
            System.out.println(i);
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }

    }
    System.out.println(this.getName()+"Got existed");
  }

  public static void main(String[] args){
      ImprovedNewThread ta = new ImprovedNewThread("James");
      ImprovedNewThread tb = new ImprovedNewThread("Johnson");
      ImprovedNewThread tc = new ImprovedNewThread("Kamal");
      ImprovedNewThread td = new ImprovedNewThread("Johnson");

      try{
          ta.join();
          tb.join();
          tc.join();
          td.join();
      }catch(InterruptedException e){
          System.out.println(e);
      }

      System.out.println("All threads are existed !!!");
  }
} 
