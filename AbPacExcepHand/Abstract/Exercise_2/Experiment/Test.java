abstract class StaticAndFinalAbstract {

    final static int a = 10;

    public static int getA() {      
        return StaticAndFinalAbstract.a;
    }
}

public class Test extends StaticAndFinalAbstract{

    public static void main(String[] args ){
        Test sfb = new Test();
        System.out.println(Test.getA());        
    }
}

