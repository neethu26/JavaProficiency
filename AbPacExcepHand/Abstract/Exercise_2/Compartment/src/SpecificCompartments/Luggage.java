package SpecificCompartments;

import Exceptions.NoSubClassFoundError;
import Compartment.AbstractCompartment;

public class Luggage extends AbstractCompartment {

    public Luggage() {
        this.compartmentType = "I am in Luggage class" ;
    }

    public String notice(AbstractCompartment o) throws NoSubClassFoundError {
        if ( o instanceof Luggage) 
            return this.compartmentType;
        throw new NoSubClassFoundError("Please instantiate a class of type Luggage ");
    }

}
