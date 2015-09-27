public class Employee {

    protected int id;
    protected int salary;
    protected String name;

    public Employee(int id, int salary, String name) {
        this.id  = id;
        this.salary = salary;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary ){
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public int getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }
}

