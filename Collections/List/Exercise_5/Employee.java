
public class Employee {
  protected int id;
  protected String name;
  protected String address;
  protected int salary;

  public Employee(int id, String name, String address, int salary){
    this.id = id;
    this.name = name;
    this.address = address;
    this.salary = salary;
  }

  public void setName(String name) {
      this.name = name;
  } 

  public void setSalary(int salary) {
      this.salary = salary;
  }

  public void setAddress(String address) {
      this.address = address;
  }

  public void setId(int id){
      this.id = id;
  }

  public int getId() {
      return this.id;
  }

  public int getSalary() {
      return this.salary;
  }

  public String getAddress(){
      return this.address;
  }

  public String getName() {
      return this.name;
  } 

}
