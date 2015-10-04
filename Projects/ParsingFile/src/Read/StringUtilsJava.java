package Read;

import java.io.*;
import java.util.*;

public class StringUtilsJava {
	
  StringBuffer fileData; 
  BufferedReader reader;
  HashMap<String,String> geoData;
  
  public StringUtilsJava(String filepath) throws FileNotFoundException{
	  this.fileData = new StringBuffer();
	  this.reader = new BufferedReader(new FileReader(filepath));
	  this.geoData = new HashMap<String,String>();
  }/*
  public Map<String,String> readFileAsString() throws IOException {	  
	  try{
		  String[] line = this.reader.readLine().split(",");		  	  
		  int length = line.length, i = 0;		  
		  
		  while( i < length){
			  this.geoData.put(line[i].split("-")[0], line[i].split("-")[1]);			  
			  i++;
		  }
		 
	  }catch(IOException e){
		  System.out.println(e);
	  }	  
	  return geoData;
  }*/
  
  public Map<String,String> readFileAsString() throws IOException {	  
	  String line="";
	  try{
		  while((line = this.reader.readLine()) != null){
			  int length = line.split("-")[1].length();
			  this.geoData.put(line.split("-")[0], line.split("-")[1].substring(0, length-1));
			  
          }
	  }catch(IOException e){
		  System.out.println(e);
	  }	  
	  return geoData;
  }
  
  
  public void readMap(Map<String,String> map){
	  
	  for(Map.Entry<String, String> e : map.entrySet()){
		  System.out.println("City\t"+e.getKey()+"\tCapital "+e.getValue());
	  }
  }
}
