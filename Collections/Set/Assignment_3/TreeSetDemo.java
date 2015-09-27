import java.util.*;
import java.lang.*;

public class TreeSetDemo {
  
    protected TreeSet<String> treeSet;
    
    public TreeSetDemo(){
        this.treeSet  = new TreeSet<String>(new MyComparable());
    }

    public void addStringsToTreeSet(String name){
        this.treeSet.add(name);

    }

    public static void main(String[] args){
     TreeSetDemo d = new TreeSetDemo();
     d.addStringsToTreeSet("james");
     d.addStringsToTreeSet("johnson");
     d.addStringsToTreeSet("Kamal");
     d.addStringsToTreeSet("Appu");

    }
}

class MyComparable implements Comparable {
    
    public int compare(Object param1, Object param2){
      String param3 = (String)param1;
      String param4 = (String)param2;
      if(param3.compareTo(param4) == 1)
          return -1;
      else if(param3.compareTo(param4) == 0)
          return 0;
      else 
          return 1;
    }  
}
