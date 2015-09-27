import java.util.*;

public class Main{
  
  protected HashSet<Card> set;

  public Main(){
    this.set = new HashSet<Card>();  
  }

  public void addCard(Card c){
      this.set.add(c);
  }

  public void displayCard(){
      Iterator<Card> it = this.set.iterator();
      for(;it.hasNext();){
          Card c = it.next();
          System.out.println(c.getSymbol()+"\t"+c.getValue());
      }
  }

  public static void main(String[] args){
    Card c = new Card("a",1);
    Card c1 = new Card("b",2);
    Card c2 = new Card("c",3);
    Card c3 = new Card("a",2);
    Card c4 = new Card("b",3);

    Main m = new Main();
    m.addCard(c);
    m.addCard(c1);
    m.addCard(c2);
    m.addCard(c3);
    m.addCard(c4);

    m.displayCard();

  }


    
}
