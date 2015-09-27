import java.io.*;


public class CopyFrom {
    
  protected FileWriter fWrite;
  protected FileReader fRead;

  protected BufferedReader bRead;
  protected PrintWriter bWrite;

  public CopyFrom(String from, String to){
    try{
        this.fRead =  new FileReader(from);
        this.fWrite = new FileWriter(to);

        this.bRead = new BufferedReader(this.fRead);
        this.bWrite = new PrintWriter(this.fWrite,true);

    }catch(IOException e){
        System.out.println(e);
    }
  }

  public void readFromWriteTo(){
    String line = null;
    try{
        while((line = this.bRead.readLine()) != null){
            this.bWrite.println(line);
        }
    }catch(IOException e){
        System.out.println(e);
    } 
  }


  public void closeConnection(){
    if(this.bRead != null) {
        this.bRead  =  null;
        this.bWrite = null;
     }
  }

  public static void main(String[] args){
   CopyFrom copy = new CopyFrom(args[0],args[1]);
   copy.readFromWriteTo();
   copy.closeConnection();
  }   
}
