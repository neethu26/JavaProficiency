import java.io.*;

public class FileInputDemo {
  protected FileInputStream fis;
  
  public FileInputDemo(String path){
    try{
       this.fis = new FileInputStream(path);
    }catch(FileNotFoundException e){
       System.out.println("File Not Found!!!");
    }
  }
  
  public FileInputStream getHandle(){
      return this.fis;
  }
  
  public void writeData(){
      try{
         int i;
         while((i = this.fis.read()) != -1 ){
             System.out.print((char)i);
         }
      }catch(IOException e){
          System.out.println(e);
      }finally{
          try{
            if(this.fis != null)
                this.fis.close();
          }catch(IOException e){
              System.out.println(e);
          }
          
      }
  }

  public static void main(String[] args){
    FileInputDemo d = new FileInputDemo("james.txt"); 
    d.writeData();
  }   
}
