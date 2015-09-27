public class ThreadPriority extends Thread{

  public void run(){
      for(int i = 0 ; i < 10; i++){
        System.out.println("My Name is "+this.getName() + "My priority is "+this.getPriority());
      }
  }

  public static void main(String[] args){
    ThreadPriority c = new ThreadPriority();
    c.setName("James");
    c.setPriority(5);
    ThreadPriority c1 = new ThreadPriority();
    c1.setName("Johnson");
    c1.setPriority(10);
    ThreadPriority c2 = new ThreadPriority();
    c2.setName("Kamal");
    c2.setPriority(1);

    c.start();
    c1.start();
    c2.start();
  }
}
