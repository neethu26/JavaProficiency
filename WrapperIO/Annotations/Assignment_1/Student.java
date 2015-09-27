public class Student extends Person {
  
  protected String university;
  protected String degree;

  public Student(String university, String degree, String name, int age){
    super(age,name);
    this.university = university;
    this.degree = degree;
  }

  @Override
  public void display(){
      System.out.println("Student Details .. \n");
      System.out.println("University"+this.university);
      System.out.println("Degree "+this.degree);
      System.out.println("Age "+this.age);
      System.out.println("Name"+this.name);
  }
    
  public static void main(String[] args){
    Student s = new Student("VIT University","M.sc","James",22);
    s.display();
  }

}
