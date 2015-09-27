import java.util.*;

public class TreeSetDemo{
 
  protected TreeSet<String> tree;   
 
  public TreeSetDemo(){
    this.tree = new TreeSet<String>();
  }

  public TreeSet<String> saveCountryNames(String countryName) {
    this.tree.add(countryName);
    return this.tree;
  }

  public String getCountry(String countryName) {
      Iterator<String> it = this.tree.iterator();
      while(it.hasNext()){
          String country = it.next();
          if(country.equals(countryName))
              return countryName;
      }
      return null;

  }

  public static void main(String[] args){
      TreeSetDemo d = new TreeSetDemo();
      d.saveCountryNames("India");
      d.saveCountryNames("Australia");
      d.saveCountryNames("Atlanta");
      d.saveCountryNames("NewYork");

      if(d.getCountry("India").equals("India"))
            System.out.println("Country Found");

  }


}
