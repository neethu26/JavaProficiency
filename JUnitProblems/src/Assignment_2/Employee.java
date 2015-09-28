package Assignment_2;

import java.util.*;


public class Employee {

  protected HashMap<Integer,String> reg; 	
	
  public Employee(){
	  reg = new HashMap<Integer,String>();
  }
  
  public void addEmployee(int id, String name){
	  this.reg.put(new Integer(id),name);
  }
  
  
  public String getEmployeeName(int id){
	  return this.reg.get(new Integer(id));
  }
  
	
}
