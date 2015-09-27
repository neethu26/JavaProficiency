public class NewThreadExtend extends Thread{
  
  Thread t;

  public NewThreadExtend(String nameOfThread){
    t = new Thread(this,nameOfThread);
    System.out.println("Thread Created!!!");
    t.start();
    System.out.println("The Thread "+this.getName() + " is started !!!");
  }

  public void run(){
    for(int i = 5 ; i > 0 ; i-- ){
        try{
           System.out.println(i);
           Thread.sleep(1000);
        }catch(InterruptedException e){
           System.out.println(e);
        }
    }
    System.out.println("The Thread " + this.getName() + "got existed");
  }

  public static void main(String[] args){
    new NewThreadExtend("James");
    new NewThreadExtend("Johnson");
    new NewThreadExtend("Kamal");
    new NewThreadExtend("Appu");

    for(int i = 5; i > 0 ; i--){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
          System.out.println(e);
        }
     }


  }

}
