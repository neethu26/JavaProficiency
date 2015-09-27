import java.lang.*;
import java.lang.annotation.*;

@Copyright(doSomething="2012 wipro technologies")
public class PRP {
    public static void main(String[] args){
        PRP p = new PRP();
        System.out.println("Hello james i am testing....");
        Class c = p.getClass();
        Annotation  an = c.getAnnotation(Copyright.class);
        Copyright cp = (Copyright)an;
        System.out.println(cp.doSomething());
    }
}
