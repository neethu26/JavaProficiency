import java.lang.*;

public class DivisionByZero {
    
    public int division(int a , int b)  {
    
        if(b != 0 )
            return (a/b);
        else
            throw new ArithmeticException("Division by zero ");

    }
    public static void main(String[] args) throws ArithmeticException{
        
        DivisionByZero divide = new DivisionByZero();
        try {
            divide.division(2,0);
        }
              catch(ArithmeticException e){
                System.out.println(e);
            }
    
        finally {
            System.out.println("Inside finally block");
        }

    }


}
