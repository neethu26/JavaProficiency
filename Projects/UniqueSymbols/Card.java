
public class Card {
  
  protected String symbol;
  protected int value;

  public Card(String symbol, int value){
    this.symbol = symbol;
    this.value = value;
  }

  @Override
  public boolean equals(Object o){
      if(o == this)
          return true;
      if(!(o instanceof Card))
          return false;

      Card c = (Card)o;

      return (this.getSymbol().equals(c.getSymbol()))?true:false; 

  }
  
  @Override
  public int hashCode(){
      return String.valueOf(this.getSymbol()).hashCode();
  }

  public void setSymbol(String symbol){
      this.symbol = symbol;
  }

  public void setValue(int value){
      this.value = value;
  }
  
  public String getSymbol(){
      return this.symbol;
  }

  public int getValue() {
      return this.value;
  }

}
