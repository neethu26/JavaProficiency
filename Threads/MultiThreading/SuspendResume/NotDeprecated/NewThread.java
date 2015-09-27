public class NewThread extends Thread {

  String name;
  Thread t;
  boolean suspendFlag;

  NewThread(String name){
    this.t = new Thread(this,name);
    System.out.println("Created thread \t"+this.t);
    this.suspendFlag = false;
    this.t.start();
  }

  public void run(){
    try{
      for(int i = 15; i > 0 ; i--){
        System.out.println("Name : "+ i);
        Thread.sleep(200);
        synchronized(this){
            while(this.suspendFlag){
                System.out.println("wait is called");
                wait();
            }            
        }
      }
    }catch(InterruptedException e){
      System.out.println(e);
    }    
  }
  
  public synchronized void setSuspend(){
    this.suspendFlag  = true;   
  }

  public synchronized void  setResume(){
    this.suspendFlag = false;
    notify();
  }

}
