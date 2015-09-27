public class CalculatePi implements Runnable {
  
  public void run(){
   for(int i = 0 ; i < 10; i++)   
    System.out.println("prints pi = 3.14"+Thread.currentThread());     
  }

  public static void main(String[] args){
    Runnable p = new CalculatePi();
    Thread t = new Thread(p,"James");
    Thread t1 = new Thread(p,"Johnson");
    t.start();
    t1.start();
  }
}
