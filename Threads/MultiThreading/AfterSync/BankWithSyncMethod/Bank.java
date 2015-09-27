public class Bank {
  
  public int mAmount;

  public Bank(int initialAmount){
    this.mAmount = initialAmount;
  }

  public synchronized int withdrawAmount(int amount){
     this.mAmount = (amount < this.mAmount)? (this.mAmount -= amount):this.mAmount;
     return this.mAmount;
  }

  public synchronized int depositAmount(int amount){
      this.mAmount += amount;
      return this.mAmount;
  }

  public synchronized int displayAmount(){
      return this.mAmount;
  }





}
