import java.util.*;

public class KeyContains {
  
    protected HashMap<String,String> map;

    public KeyContains() {
      this.map = new HashMap<String,String>();
    }

    public void addKeyAndValue(String key, String value) {
        this.map.put(key,value);
    }

    public boolean checkKeyExists(String key) {
        return this.map.containsKey(key);
    }

    public boolean checkValueExists(String value) {
        return this.map.containsValue(value);
    }

    public void displayKeySetValues() {
        for(Iterator<String> it = this.map.keySet().iterator();
                it.hasNext();){
            System.out.println(it.next());
                }

    }

    public static void main(String[] args) {
     
        KeyContains k = new KeyContains();
        k.addKeyAndValue("james","johnson");
        if(k.checkKeyExists("james"))
            System.out.println("Key exists");

        if(k.checkValueExists("johnson"))
            System.out.println("value exists");

        System.out.println("Displaying key values!!!");
        k.displayKeySetValues();
    }
}
