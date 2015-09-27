package SpecificCompartments;

import Compartment.AbstractCompartment;
import Exceptions.NoSubClassFoundError;

public class General extends AbstractCompartment {

    public General(){
        this.compartmentType = "I am in General Compartment";
    }

    public String notice(AbstractCompartment o) throws NoSubClassFoundError {
        if (o instanceof General)
            return this.compartmentType;
        throw new NoSubClassFoundError("Please instantiate a subclass of type AbstractCompartment ");
    }

}
