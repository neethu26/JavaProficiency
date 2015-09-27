import java.util.*;
import java.io.*;

public class CalendarDate{
  
  protected Date d;
  protected Double db;
  protected Long l;
  protected Calendar calendar;
  /* 
   * File Instance variables
   * 
   */
  protected FileOutputStream fStream;
  protected ObjectOutputStream oStream;
  

  protected FileInputStream fIStream;
  protected ObjectInputStream oIStream;
  
  /*
   * Constructor
   *
   */
  public CalendarDate(){
    this.db = new Double(2.15);
    this.l =  new  Long(56789);
    this.calendar = Calendar.getInstance();
    this.d = this.calendar.getTime(); 
  }

  public CalendarDate(String path){
    this();
    try{
   //     this.fStream = new FileOutputStream(path);
   //     this.oStream = new ObjectOutputStream(this.fStream);
        this.fIStream = new FileInputStream(path);
        this.oIStream = new ObjectInputStream(this.fIStream);
    }catch(IOException e){
        System.out.println(e);
    }
  }

  public void writeToFile(Double db, Long g, Date d){
    try{
        this.oStream.writeObject(db);
        this.oStream.writeObject(g);
        this.oStream.writeObject(d);

    }catch(IOException e){
          System.out.println(e);
    }
  
  }

  public void readFromFile(){
      try{
        System.out.println((Double)this.oIStream.readObject());
        System.out.println((Long)this.oIStream.readObject());
        System.out.println((Date)this.oIStream.readObject());
      }catch(IOException e){
        System.out.println(e);
      }catch(ClassNotFoundException e ){
          System.out.println(e);
      }    
  }

  public Date getDate(){
    return this.d;   
  }
   
  public Long getLong(){
    return this.l;
  }
  
  public Double getDouble(){
       return this.db;
  }

  public void closeConnection(){

     try{
        if(this.oStream != null)
            this.oStream.close();
     }catch(IOException e){
        System.out.println(e);
     }
   
  }
  
  public static void main(String[] args){
    CalendarDate o = new CalendarDate(args[0]);
    //o.writeToFile(o.getDouble(),o.getLong(),o.getDate());
    o.readFromFile();
    o.closeConnection();  
  }
}
