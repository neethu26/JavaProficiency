import java.util.*;


public class PropertiesList {

  public static void main(String[] args){
    Properties p = System.getProperties();
    System.out.println(System.getProperty("java.vendor"));

    Properties capitals = new Properties();
    capitals.put("India","Delhi");
    capitals.put("Australia","Sydeny");
    capitals.put("California","Sacramento");
    capitals.put("Indiana","Indianplois");

    Iterator it =capitals.keySet().iterator();

    while(it.hasNext()){
        System.out.println((String)it.next());
    }

    
  }
}
