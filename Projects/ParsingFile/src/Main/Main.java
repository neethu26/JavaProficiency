package Main;
import java.util.*;
import Read.StringUtilsJava;


public class Main{
  
  public static void main(String[] args){
    StringUtilsJava obj;
    try{  
      obj = new StringUtilsJava(args[0]);
      obj.readMap(obj.readFileAsString());
    }catch(Exception e){
        System.out.println("File not found !!!");
    }
  }  

}
