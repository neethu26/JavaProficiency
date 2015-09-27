import java.util.*;

public class Main{

  protected HashSet<Box> set;

  public Main(){
    this.set = new HashSet<Box>();
  }

  public boolean addBox(Box b) {
      return this.set.add(b);
  }

  public void display(){
      Iterator<Box> it = this.set.iterator();
      for(;it.hasNext();)
          System.out.println(it.next().getVolume());
  }

  public static void main(String[] args){
      Box b1 = new Box(1.2,1.3,1.4);
      Box b2 = new Box(1.2,1.3,1.4);
      Box b3 = new Box(1.3,1.4,1.5);
     
      Main m = new Main();
      m.addBox(b1);
      m.addBox(b2);
      m.addBox(b3);

      m.display();
    
  }


}

