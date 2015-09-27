import java.util.*;

public class HashTableDemo {
  
  protected Hashtable<String,String> map;
  
  public HashTableDemo(){   
    this.map = new Hashtable<String,String>();
  }

  public Hashtable<String,String> saveCountryCapital(String countryName,String capital) {
      this.map.put(countryName,capital);
      return this.map;
  }

  public String getCapitalByCountryName(String countryName) {
      return this.map.get(countryName);
  }

  public String getCountryNameByCapital(String capital) {
      for(Map.Entry<String,String> e : this.map.entrySet())
          if(e.getValue().equals(capital))
              return e.getKey();
      return null;
  }

  public ArrayList<String> getAllCountryNames(){
      ArrayList<String> list = new ArrayList<String>();
      list.addAll(this.map.keySet());
      return list;
  }

  public static void main(String[] args) {
   HashTableDemo d = new HashTableDemo();
   d.saveCountryCapital("Atlanta","USA");
   d.saveCountryCapital("India","Delhi");
   d.saveCountryCapital("Australia","Sydney");

   System.out.println("Capital for country name ATLANTA\t" + d.getCapitalByCountryName("Atlanta"));
   System.out.println("Get Country for capital name DELHI\t"+d.getCountryNameByCapital("Delhi"));


   
   for(String t : d.getAllCountryNames())
       System.out.println(t);

  }

}
