import java.util.*;
import java.io.*;


public class VectorObjectsSerialization{
  protected static int count = 0;
  protected FileInputStream  fIStream;
  protected FileOutputStream fOStream;
  protected ObjectInputStream oIStream;
  protected ObjectOutputStream oOStream;

  protected File file;
  private Vector<String> object;
  private int hold;  
  private Vector<String> vector; 

  public VectorObjectsSerialization(String path){
      try{
          this.fOStream = new FileOutputStream(path);
          this.fIStream = new FileInputStream(path);

          this.oOStream = new ObjectOutputStream(this.fOStream);
          this.oIStream = new ObjectInputStream(this.fIStream);

      }catch(IOException e){
          System.out.println(e);
      }
  }

 

  public VectorObjectsSerialization(int n,String path){
    this(path);
    this.object = new Vector<String>(n);
    hold = n;
  }

  public void addValueToVector(String name){
     this.object.add(name);          
  }
  
  public void writeObjectToFile(){
      try{
          this.oOStream.writeObject(this.object);       
      }catch(IOException e){
        System.out.println("Exception is thrown at writeObjectToFile !!!");
        System.out.println(e);
      }finally{
          System.out.println("Written to file\t");
      }
  }
  
  public void closeConnectionForWriting(){
      try{
          if(this.oOStream != null)
              this.oOStream.close();  
      }catch(IOException e){
        System.out.println("Exception is thrown at closing connection writing ");
        System.out.println(e);
      }

  }

  public void readObjectFromFile() {      
      try{
         this.vector = (Vector<String>)this.oIStream.readObject();
         System.out.println("Displaying the file contents !!!");
         
         for(int i = 0 ; i < this.vector.size() ; i++){
             System.out.println(this.vector.get(i));
         }

      }catch(IOException e){
         System.out.println("exception is thrown at read object from file"); 
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }finally{
          System.out.println("\nReached end of file");
      }
  }
  
  public void closeConnectionForReading(){
      try{
        if(this.oIStream != null ){
            this.oIStream.close();
        }
      }catch(IOException e ){
          System.out.println("Exception is thrown at closing connection for reading");
          System.out.println(e);
      }
  }
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    VectorObjectsSerialization vector = new VectorObjectsSerialization(Integer.parseInt(args[0]),args[1]);
    
    System.out.println("Enter the name !!!");
    for(int i = 0; i < Integer.parseInt(args[0]); i++)
        vector.addValueToVector(in.next());
    
    vector.writeObjectToFile();
    vector.closeConnectionForWriting();
    vector.readObjectFromFile();
    vector.closeConnectionForReading();
  }

  

  

}
