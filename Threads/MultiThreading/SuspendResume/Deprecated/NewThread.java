public class NewThread extends Thread {
  
  String Name;
  Thread t;
  boolean suspendFlag;

  NewThread(String threadName){
      this.t = new Thread(this,threadName);
      System.out.println("Created a new thread \t"+t);
      this.t.start();
  }

  public void run(){
    try{
       for(int i = 15; i > 0 ; i-- ){
         System.out.println("Name" + ":" + i);
         Thread.sleep(200);
      }
    }catch(InterruptedException e){
        System.out.println(e);
    }
    System.out.println("exiting");
  }

    
}
