import java.io.*;

public class Main {
  
  protected FileOutputStream fStream;
  protected ObjectOutputStream oStream;
  protected FileInputStream fIStream;
  protected ObjectInputStream oIStream;
  
  public Main(String path){
    try{
      this.fIStream = new FileInputStream(path);
      this.oIStream = new ObjectInputStream(this.fIStream);
    }catch(FileNotFoundException e){
        System.out.println(e);
    }catch(IOException e){
        System.out.println(e);
    }  
  }
  
  /*
  public Main(String path){
    try{
       this.fStream = new FileOutputStream(path);
       this.oStream = new ObjectOutputStream(this.fStream);  
    }catch(FileNotFoundException e){
      System.out.println(e);  
    }catch(IOException e){
        System.out.println(e);
    }
  }
  */
  
  public void serializeObjectInFile(Employee e){
      try{
        this.oStream.writeObject(e);
      }catch(IOException ex){
          System.out.println(ex);
      } 

  }

  public void unSerializeObjectFromFile(){
    try{
       Employee e = (Employee)this.oIStream.readObject();
       System.out.println(e);
    }catch(ClassNotFoundException e){
       System.out.println(e);
    }catch(IOException e){
        System.out.println(e);
    }
  
  }

  public void closeConnection(){
    try{
        if(this.oIStream != null)
            this.oIStream.close();

    }catch(IOException e){
        System.out.println(e);
    }  
  }

  public static void main(String[] args){
    Main m = new Main(args[0]);
    Employee e = new Employee("james",22);
    //m.serializeObjectInFile(e);
    m.unSerializeObjectFromFile();
    m.closeConnection();
  }

}
