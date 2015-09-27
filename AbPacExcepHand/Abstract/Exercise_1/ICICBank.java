import Bank.General.GeneralBank;
import ICICBank.ICICBank;


public class ICICBank extends GeneralBank {

    
    public double getSavingInterestRate() {
        return 0.04; 
    }

    public double getFixedInterestRate() {
        return 0.085;
    }
}
