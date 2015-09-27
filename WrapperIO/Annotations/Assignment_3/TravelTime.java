import java.lang.*;
import java.lang.annotation.*;
import java.util.*;


public class TravelTime {

  @RequestForEnhancement(id = 2868724,synopsis="Enable time-travel",engineer="Mr. Ram",date="9/5/2012")
  public static void travelThrough(Date destination){
    TravelTime time = new TravelTime();  
    Class cls = time.getClass();
    Method  mth = cls.getMethod("travelThrough");
    Annotation[] m = mth.getAnnotations();
    for(Annotation ann : m){
        System.out.println(ann.id());
    }
    //System.out.println(destination.getTime());
  }

  public static void main(String[] args){
      TravelTime.travelThrough(Calendar.getInstance().getTime());  
  }
        
}
