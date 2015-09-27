public class ThreadRunnable implements Runnable {
  
  public void run(){
    this.display(); 
  }

  public void display(){
    System.out.println("Created a thread using runnable interface");  
  }
  

  public static void main(String[] args){
    Runnable r = new ThreadRunnable();
    Thread t = new Thread(r);
    t.start();
  }

}


