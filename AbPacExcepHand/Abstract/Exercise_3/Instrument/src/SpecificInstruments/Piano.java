package SpecificInstruments;

import Instrument.Instrument;
import Exceptions.NoSubClassFoundError;

public class Piano extends Instrument {

    public Piano(){
        this.message = "tin tin tin";
    }

    public void play(Instrument o) throws NoSubClassFoundError {
        if ( o instanceof Piano )
            System.out.println(o.message); 
                throw new NoSubClassFoundError("Please instaniate a class of type Piano");
    }
}
