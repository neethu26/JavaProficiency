import java.lang.*;


public class NameAndAge {
    
    public boolean isCheckAge(int age) throws AgeConstraintException {
        if (age < 18 || age > 60)
            throw new AgeConstraintException("Age should be in range between >= 18 and < 60 ");

        return true;
    }



    public static void main(String[] args ) throws NumberFormatException {
       
        int age = 0 ;
        NameAndAge ng = new NameAndAge();       
        try {
            String name = args[0];
              try {
                 age = Integer.parseInt(args[1]);
              }catch(NumberFormatException e) {
                  System.out.println("Please pass an integer value for age !!!");
              }
              try {  
                 ng.isCheckAge(age); 
              }catch(AgeConstraintException e){
                  System.out.println(e);
              }
                            
        }finally {
            System.out.println("Thank you!!!");
            //System.exit(0);
        }
       }
}

