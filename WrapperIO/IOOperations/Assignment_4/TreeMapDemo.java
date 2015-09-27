import java.io.*;
import java.util.*;

public class TreeMapDemo {
  
  protected FileReader fRead;
  protected BufferedReader bRead;
  protected TreeMap<String,Integer> map; 

  public TreeMapDemo(){
    this.map = new TreeMap<String,Integer>(new Compare());
  }

  public TreeMapDemo(String path){
    this();
    try{  
      this.fRead = new FileReader(path);
      this.bRead = new BufferedReader(this.fRead);
    }catch(FileNotFoundException e){
        System.out.println("File Not Found !!!");
    }    
  }

  public void readFile(){
    String line=null;
    try{
       while((line = this.bRead.readLine()) != null){
           for(String word : line.toLowerCase().split(" ")){
              if(this.map.containsKey(word))
                this.map.put(word,this.map.get(word)+1);
              else
                this.map.put(word,new Integer(1));
           }
       }      
    }catch(IOException e){
       System.out.println("Reading problem in file");
    }  
  }

  public void closeConnection(){
    try{
      if(this.bRead != null)
          this.bRead.close();
    }catch(IOException e){
        System.out.println("Stream didn't close!!");
    }
  }

  public void display(){
    for(Map.Entry<String,Integer> e : this.map.entrySet())
        System.out.println(e.getKey() + "\t" +e.getValue());
  }
  
  public static void main(String[] args){
    
    TreeMapDemo tree = new TreeMapDemo(args[0]);
    tree.readFile();
    tree.closeConnection();
    tree.display();
  }

}


class Compare implements Comparator<String>{
 
  @Override
  public int compare(String w1, String w2){
    if(w1.compareTo(w2) < 0)
        return -1;
    else if(w1.compareTo(w2) == 0)
        return 0;
    else 
        return 1;
        
  }

}
