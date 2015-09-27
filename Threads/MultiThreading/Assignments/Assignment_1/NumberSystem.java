public class NumberSystem{
  
  public static int result = 0;
  boolean print = false;
 
  public synchronized void getEvenNumber(){
      while(!print){
          try{wait();}
          catch(InterruptedException e){
              System.out.println(e);
          }
      }
      result += 1;
      System.out.print(" "+result+" ");
      print = false;
      notify();
  }

  public synchronized void getOddNumber(){
      while(print){
          try{ wait(); }
          catch(InterruptedException e){
              System.out.println(e);
          }
      }

      result += 1;
      System.out.print(result);
      print = true;
      notify();            
  
  }

}
