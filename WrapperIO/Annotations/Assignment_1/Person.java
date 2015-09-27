public class Person {
  
  protected int age;
  protected String name;



  public Person(int age,String name){
    this.age = age;
    this.name = name;
  }

  public void display(){
    System.out.println(this.age);
    System.out.println(this.name);
  }
  
    
}
