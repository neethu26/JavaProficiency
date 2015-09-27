package SpecificCompartments;

import Compartment.AbstractCompartment;
import Exceptions.NoSubClassFoundError;

public class FirstClass extends AbstractCompartment {
    
    public FirstClass() {
        this.compartmentType = "I am in FirstClass ";
    }

    public void notice1(AbstractCompartment n) {
        System.out.println("Hello First class");
    }

    public String notice(AbstractCompartment o ) throws NoSubClassFoundError {
          if(o instanceof FirstClass)
            return this.compartmentType;
          throw new NoSubClassFoundError("Please instantiate a subclass of type AbstractCompartment");

    } 
}
