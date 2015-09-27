public class Main{

  public static void main(String[] args){
    NumberSystem ns = new NumberSystem();
    ThreadOdd nO = new ThreadOdd(ns,10);
    ThreadEven nE = new ThreadEven(ns,10);
    
  }

}
