import java.util.*;

public class ArrayListEmployee {
  
    protected Map<Integer,Employee> emp;
    
    public ArrayListEmployee(){
        this.emp = new HashMap<Integer,Employee>();
    }

    public boolean addEmployee(Employee emp){
        this.emp.put(emp.getId(),emp);
        if(this.emp.containsKey(emp.getId()))
            return true;          
        return false;
    }

    public boolean deleteEmployee(int empCode) {
        if(this.emp.containsKey(empCode)) {
            this.emp.remove(empCode);
            return true;
        }
        return false;
    }

    public String showPaySlip(int empCode) {
        if(this.emp.containsKey(empCode)) {
            StringBuilder paySlip = new StringBuilder();
            Employee employee = this.emp.get(empCode);
            return paySlip.append("PAY SLIP")
                          .append("\n")
                          .append("Name : "+employee.getName())
                          .append("\n")
                          .append("Id :   "+employee.getId())
                          .append("\n")
                          .append("Salary:"+employee.getSalary())
                          .append("\n")
                          .toString();
        }          
        return null;

     }

    public Collection<Employee> listAll() {
     return  this.emp.values();
    }

    public static void main(String[] args) {
        ArrayListEmployee emp = new ArrayListEmployee();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter the employee details");
            emp.addEmployee(new Employee(input.nextInt(),input.nextInt(),input.next()));
        }while(input.next().equals("Yes"));

        // list all employees
        for(Employee e: emp.listAll()){
          System.out.println("Employee Details\n");
          System.out.println("Emp Name:"+e.getName()+"\t"+"Emp Id:"+e.getId()+"\t"+"Emp Salary:"+e.getSalary());
        }

        //delete an employee 
        System.out.println("Please specify the Employee Id..");
        if(emp.deleteEmployee(input.nextInt()))
            System.out.println("Employee deleted");
        else 
            System.out.println("Employee not deleted");
    }
}
