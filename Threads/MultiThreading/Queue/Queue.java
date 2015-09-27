public class Queue {

  int n;
  
  public synchronized void get() {
    System.out.println("Got : "+n);
  }

  public synchronized void put(int n){
    this.n = n;
    System.out.println("Put : "+n);
  }

}
