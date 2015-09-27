import java.util.*;

public class HashSetDemo {

  protected HashSet<String> set;

  public HashSetDemo(){
    this.set = new HashSet<String>();
  }
  public void saveCountryNames(String countryName) {
      this.set.add(countryName);         
  }

  public String getCountry(String countryName) {
    Iterator<String> it = this.set.iterator();
    while(it.hasNext()){
        String country = it.next();
        if(country.equals(countryName)){
            System.out.println("Element found");
            return countryName;
        }
            

    }
        
    return null;
  }

  public static void main(String[] args){ 
     HashSetDemo d = new HashSetDemo();
     d.saveCountryNames("India");
     d.saveCountryNames("Australia");
     d.saveCountryNames("Atlanta");
     d.saveCountryNames("NewYork");

     if(d.getCountry("India").equals("India"))
         System.out.println("Country Found");

  }
}
