public class BankInstance implements Runnable {

  public Bank bank;
  public Thread t;

  public BankInstance(Bank bank,String nameOfCustomer){
    this.bank = bank;
    t = new Thread(this,nameOfCustomer);
    t.start();
  }

  public  void run() {
    
    try{
       Thread.sleep(1000);
    }catch(InterruptedException e){
       System.out.println(e);
    }  
    
    System.out.println("========================================================");
    System.out.println("Initial amount in bank"+bank.displayAmount());
    System.out.println("Amount after withdrawal\t"+bank.withdrawAmount(2000));
    System.out.println("Amount after deposited "+bank.depositAmount(4000));
    System.out.println("=========================================================");
  }


}
