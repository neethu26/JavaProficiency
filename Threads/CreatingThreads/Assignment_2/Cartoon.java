public class Cartoon extends Thread {
  
  protected String name;  

  public Cartoon(String name){
    this.name = name;
  }
    
  public void run(){
      System.out.println("Hello "+this.name);
  }

  public static void main(String[] args){
   Cartoon c1 = new Cartoon("Scooby");
   Cartoon c2 = new Cartoon("Shaggy");

   c1.start();
   c2.start();
  }  
}
