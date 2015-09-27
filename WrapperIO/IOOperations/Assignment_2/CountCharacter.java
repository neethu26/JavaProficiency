import java.io.*;
import java.util.*;

public class CountCharacter {
  
  protected HashMap<String,Integer> map;
  protected FileReader fWrite;
  protected BufferedReader bWrite;

  public CountCharacter(){
    this.map = new HashMap<String,Integer>();
  }
  
  public CountCharacter(String path){
      this();
      try{
        this.fWrite = new FileReader(path);
        this.bWrite = new BufferedReader(this.fWrite);
      }catch(FileNotFoundException e) {
        System.out.println("File Not Found !!!");
      }
  }

  public HashMap<String,Integer> readDataFromFile(){
      String line=null;
      try{
        while((line = this.bWrite.readLine()) !=  null) {
              for(String word : line.toLowerCase().split("")){
                  for(char c : word.toCharArray()){
                      String ch = String.valueOf(c);
                       if (this.map.containsKey(ch)){
                           this.map.put(ch,new Integer(this.map.get(ch)+1));
                       }else{
                           this.map.put(ch,new Integer(1));
                       }

                  }
            }
        }
      }catch(IOException e){
          System.out.println(e);
      }
      return this.map;
  }

  public int getCountOfChar(String ch){
      return this.map.get(ch);
  }

  public void closeFileConnection(){
    try{
      if(this.bWrite != null){
         this.bWrite.close();
         this.bWrite = null;
      }
      }catch(IOException e){
         System.out.println(e);
      } 
    }
 
  public void display(){
      for(Map.Entry<String,Integer> e : this.map.entrySet())
          System.out.println(e.getKey()+"\t"+e.getValue());
  }

  public static void main(String[] args){
      CountCharacter ca = new CountCharacter(args[0]);
      ca.readDataFromFile();
      ca.closeFileConnection();
      System.out.println(ca.getCountOfChar(args[1]));
  }

   

}

