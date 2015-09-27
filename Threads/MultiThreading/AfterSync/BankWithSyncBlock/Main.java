public class Main{
   
  public Main(){
    System.out.println("\nWelcome to Bank \n");
  }

  public static void main(String[] args){
    Bank bank = new Bank(20000);
    BankInstance customer1 = new BankInstance(bank,"James");
    BankInstance customer2 = new BankInstance(bank,"Johnson");
  }
}
