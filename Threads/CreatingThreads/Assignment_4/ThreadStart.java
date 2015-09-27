public class ThreadStart  extends Thread {
  
  public void run() {
    System.out.println("Thread Started!!!");
  }


  public static void main(String[] args){
    ThreadStart s = new ThreadStart();
    s.start();
    s.start();
  }

}
