import java.util.*;

public class EmployeeNames {
  
  protected HashSet<String> emp;

  public EmployeeNames() {
      this.emp = new HashSet<String>();
  }

  public boolean addEmployeeName(String empName){
    return this.emp.add(empName);
  }

  public void displayEmployeeNames(){
      Iterator<String> it = this.emp.iterator();
      for(;it.hasNext();){
          System.out.println(it.next());
      }
  }

  public static void main(String[] args){
      EmployeeNames emp = new EmployeeNames();
      if(emp.addEmployeeName("james"))
          System.out.println("Employee james is added");
      emp.displayEmployeeNames();
  }
}
