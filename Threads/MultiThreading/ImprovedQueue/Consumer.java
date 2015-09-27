public class Consumer implements Runnable{
  
  Queue q;

  Consumer(Queue q){
      this.q = q;
      new Thread(this,"Consumer").start();
  }

  public void run(){
      while(true){
          this.q.get();
      }
    
  }


}
