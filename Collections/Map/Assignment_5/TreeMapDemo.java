import java.util.TreeMap;
import java.util.Collections;
import java.util.*;

public class TreeMapDemo {
  
  protected TreeMap<String,String> map;

  public TreeMapDemo() {
    this.map = new TreeMap<String,String>();
  }
  
  public void saveCountryCapital(String countryName, String capital) {
    this.map.put(countryName,capital);
  }

  public String getCapitalByCountryName(String countryName) {
      return this.map.get(countryName);
  }
  
  public String getCountryNameByCapital(String capital){
    for(Map.Entry<String,String> t : this.map.entrySet())
        if(t.getValue().equals(capital))
            return t.getKey();
    return null;
  }
  
  public ArrayList<String> getCountryNames() {
      ArrayList<String> list = new ArrayList<String>();
      Set<String> set = this.map.keySet();
      list.addAll(set);
      return list;
  }

  public static void main(String[] args){
    TreeMapDemo d = new TreeMapDemo();
    d.saveCountryCapital("India","Delhi");
    d.saveCountryCapital("Australia","Sydney");
    d.saveCountryCapital("Atlanta","USA");
    d.saveCountryCapital("NewYork","NewYork");

    System.out.println(d.getCapitalByCountryName("Australia"));

    System.out.println(d.getCountryNameByCapital("USA"));
    
    ArrayList<String> list = d.getCountryNames();
    System.out.println("Country Name");
    for(String name: list){
        System.out.println(name);
    }
  }
}

