package Compartment;

import Exceptions.NoSubClassFoundError;

public abstract class AbstractCompartment {

    protected String compartmentType;
    public abstract String notice(AbstractCompartment o) throws NoSubClassFoundError;
}


