package EmployeeManagementSystem.Database;

import EmployeeManagementSystem.Employee.Employee;

import java.util.*;

public class EmployeeDatabase {
  
  protected HashMap<Integer,Employee> e;

  public EmployeeDatabase(){
    this.e = new HashMap<Integer,Employee>();
  }   

  public void addEmployee(int id, Employee e){
      this.e.put(new Integer(id),e);
  }

  public void deleteEmployee(int id){
      if(this.e.containsKey(new Integer(id))){
          this.e.remove(new Integer(id));
      }
  }

  public void displayAllEmployees(){
      for(Map.Entry<Integer,Employee> e : e.entrySet()){
          System.out.println(e.getValue().getEmployeeName());
      }
  }
  
}
