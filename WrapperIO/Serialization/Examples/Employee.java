import java.io.*;

public class Employee implements Serializable{

    protected String name;
    protected int age;
    

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return "Name is \t"+this.name+"age \t"+this.age;
    }
}
