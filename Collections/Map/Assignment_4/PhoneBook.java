import java.util.HashMap;

public class PhoneBook {
  
  protected HashMap<String,String> phoneBook;

  public PhoneBook() {
    this.phoneBook = new HashMap<String,String>();
  }
  
  public void addPhoneBook(String name,String phoneNumber) {
    this.phoneBook.put(name,phoneNumber); 
  }

  public String getPhoneNumber(String name) {
      return this.phoneBook.get(name);
  }

  public static void main(String[] args) {
      PhoneBook book = new PhoneBook();

      book.addPhoneBook("James","9704627646");

      System.out.println(book.getPhoneNumber("James"));
  }

}
