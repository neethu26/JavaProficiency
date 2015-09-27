import java.util.*;

public class CountryMap {

  protected HashMap<String,String> countryMap;
  protected StringBuilder errorLog;
  protected boolean errorStatus;

  public CountryMap() {
    
    this.countryMap = new HashMap<String,String>();
    this.errorLog = new StringBuilder();
    this.errorStatus = false;
  }

  public boolean saveCountryCapital(String countryName, String capital) {
    this.countryMap.put(countryName,capital);
    return true;   
  }

  public String displayElementsInMap() {
      if(this.countryMap.isEmpty())
          return "No elements are added in map";

      System.out.println("\nCountryName"+"\t"+"Capital");
      for(Map.Entry<String,String> e : this.countryMap.entrySet())
          System.out.println("k->"+e.getKey() +"\tv->"+e.getValue()+"\n");

       return "";
  }

  public String getCapitalByCountryName(String countryName) {
      if(this.countryMap.containsKey(countryName))
          return this.countryMap.get(countryName);
      
      return null;
  }

  public String getCountryNameByCapital(String capital) {
      if(this.countryMap.containsValue(capital))
          for(Map.Entry<String,String> e : this.countryMap.entrySet())
              if(e.getValue().equals(capital))
                  return e.getKey();
      return null;

  }

  public static void main(String[] args) {
   
    CountryMap map = new CountryMap();
    Scanner in = new Scanner(System.in);

    do {
        System.out.println("Enter the country name and country capital ");
        map.saveCountryCapital(in.next(),in.next());
        System.out.println("Want to add more!!! (y/n)");
    }while(in.next().equals("y"));

    System.out.println("Displaying all the elements in the map !!!");
    map.displayElementsInMap();

    System.out.println("Enter the country name to get the capital !!");
    String coun_cap = in.next();
    if(map.getCapitalByCountryName(coun_cap) != null)
        System.out.println(map.getCapitalByCountryName(coun_cap));
    else
        System.out.println("No Such Entry");

    System.out.println("Enter the captial to get the country name !!!");
    String cap_coun = in.next();
    if(map.getCountryNameByCapital(cap_coun) != null)
        System.out.println(map.getCountryNameByCapital(cap_coun));
    else
        System.out.println("No Such Entry");


  } 
}
