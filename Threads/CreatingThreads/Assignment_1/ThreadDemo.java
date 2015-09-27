public class ThreadDemo extends Thread {
  
  public ThreadDemo() {
    System.out.println("Hello i am class who inherits constructor !!!");
  }

  public void run(){
      System.out.println("Hello i instantiated the thread class");
  }

  public static void main(String[] args){
    ThreadDemo d = new ThreadDemo();
    d.start();

  }
}
