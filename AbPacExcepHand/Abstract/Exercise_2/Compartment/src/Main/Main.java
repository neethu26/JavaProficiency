package Main;

import SpecificCompartments.FirstClass;
import SpecificCompartments.General;
import SpecificCompartments.Luggage;
import SpecificCompartments.Ladies;
import Exceptions.NoSubClassFoundError;
import Compartment.AbstractCompartment;

import java.util.*;



public class Main {
    
    public static int RandomNumGenerator(int max, int min) {
        return  (int)(Math.random()*((max - min) + 1 )) + min;
    }

    

    public static void main (String[] args ) throws NoSubClassFoundError {
        
        
        String[] compartment = new String[10];

        for(int i = 0 ; i < 10 ; i ++) {


          switch(Main.RandomNumGenerator(1,4)) {

            case 1 :    FirstClass fClass = new FirstClass();
                        compartment[i] = fClass.notice(fClass);
                        break;

            case 2 :    General gClass = new General();
                        compartment[i] = gClass.notice(gClass);
                        break;
                        
            case 3 :    AbstractCompartment lgClass = new Luggage();
                        compartment[i] = lgClass.notice(lgClass);
                        break;
                        
            case 4 :    AbstractCompartment  lClass = new Ladies();
                        compartment[i] = lClass.notice(lClass);
                        break;
                        
            }


          }
        for(int i = 0 ; i < 10; i++ ) {
            System.out.println(compartment[i]);
        }
          
    } 
}

