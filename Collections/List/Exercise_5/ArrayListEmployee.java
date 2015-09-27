import java.util.*;

public class ArrayListEmployee {
    
   protected Map<Integer,Employee> emp;

   public ArrayListEmployee() {
       this.emp = new HashMap<Integer,Employee>();
   }

   public void addEmployee(int id, Employee emp){
       this.emp.put(new Integer(id),emp);
   }

   public Employee searchEmployee(int id) {
       Employee emptyEmp = null;
       if(emp.containsKey(id))
           return emp.get(new Integer(id));
       else
           return emptyEmp;
   }

   public Collection<Employee> getEmployees() {
       return this.emp.values();
   }

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       ArrayListEmployee emp = new ArrayListEmployee();
       
       do{
            System.out.println("Add Employees !!! Format(id,id,name,address,salary)");
            emp.addEmployee(input.nextInt(),new Employee(input.nextInt(),input.next(),input.next(),input.nextInt()));
            System.out.println("Want to add more employees!!!");

       }while(input.next().equals("Yes"));

       Iterator<Employee> it = emp.getEmployees().iterator();

       for(;it.hasNext();){
            Employee temp = (Employee)it.next();    
             System.out.println(temp.getId()+" \t "+temp.getName());
       }

       System.out.println("Enter the id from the above data");
       int id = input.nextInt();
       if(emp.searchEmployee(id) != null) {
           Employee empDetails = emp.searchEmployee(id);
           System.out.println("Employee Found");
           System.out.println("Employee Details \n");
           System.out.println("Employee Id "+empDetails.getId());
           System.out.println("Employee Name "+empDetails.getName());
           System.out.println("Employee Salary "+empDetails.getSalary());
           System.out.println("Employee Address "+empDetails.getAddress());
       }else{
           System.out.println("Employee Found");
       }


   }



}
