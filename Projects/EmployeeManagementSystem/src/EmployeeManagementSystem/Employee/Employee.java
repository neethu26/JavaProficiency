package  EmployeeManagementSystem.Employee;

public class Employee{
  
    protected String name;
    protected int id;
    protected int age;
    protected int salary;

    public Employee(int id, String name, int age, int salary){
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public void setEmployeeName(final String name){
        this.name = name;
    }

    public void setEmployeeId(final int id){
        this.id = id;
    }

    public void setEmployeeAge(final int age){
        this.age = age;
    }

    public void setEmployeeSalary(final int salary){
        this.salary = salary;
    }

    public String getEmployeeName(){
        return this.name;
    }

    public int getEmployeeAge(){
        return this.age;
    }

    public int getEmployeeId(){
        return this.id;
    }
   
    public int getEmployeeSalary(){
        return this.salary;
    }
}
