public class Bank {
  
  public int mAmount;

  public Bank(int initialAmount){
    this.mAmount = initialAmount;
  }

  public int withdrawAmount(int amount){
     this.mAmount = (amount < this.mAmount)? (this.mAmount -= amount):this.mAmount;
     return this.mAmount;
  }

  public int depositAmount(int amount){
      this.mAmount += amount;
      return this.mAmount;
  }

  public int displayAmount(){
      return this.mAmount;
  }



}
