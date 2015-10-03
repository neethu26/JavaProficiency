package EmployeeManagementSystem.Main;

import EmployeeManagementSystem.Employee.Employee;
import EmployeeManagementSystem.Database.EmployeeDatabase;

public class Main {
  
  public static void main(String[] args){
        
    Employee e = new Employee(12,"james",93,90000);
    EmployeeDatabase db = new EmployeeDatabase();
    db.addEmployee(e.getEmployeeId(),e);

    db.displayAllEmployees();
  
  
  }
}
