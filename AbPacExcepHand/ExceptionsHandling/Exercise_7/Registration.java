import java.lang.*;

public class Registration {
    
    public void isCheckPlace(String mCountry,String mName ) throws InvalidCountryException {
        
        if(mCountry.equals("India"))
            System.out.println("User\t "+mName+" Registration done successfully");
        else 
            throw new InvalidCountryException("User Outside India cannot access it!!");
        
    }

    public static void main(String[] args) throws InvalidCountryException {
        Registration register = new Registration();
        try {
            register.isCheckPlace(args[0],args[1]); 
        }catch(InvalidCountryException e) {
            System.out.println(e);
        }finally {
            //System.out.println("Thank you for registering !!!! ");
        }
        
    }
}
