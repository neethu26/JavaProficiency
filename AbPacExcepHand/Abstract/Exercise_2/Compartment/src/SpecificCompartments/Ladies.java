package SpecificCompartments;

import Compartment.AbstractCompartment;
import Exceptions.NoSubClassFoundError;

public class Ladies extends AbstractCompartment {

    public Ladies() {
        this.compartmentType = "I am in Ladies Compartment !!!";
    }

    public String notice(AbstractCompartment o ) throws NoSubClassFoundError {
        if(o instanceof Ladies )
            return this.compartmentType;
        throw new NoSubClassFoundError("Please instantiate a class of type Ladies");
    }

}
