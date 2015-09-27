package SpecificInstruments;

import Instrument.Instrument;
import Exceptions.NoSubClassFoundError;


public class Guitar extends Instrument {

    public Guitar() {
        this.message = "tin tin tin";
    }

    public void play(Instrument o) throws NoSubClassFoundError {
        if(o instanceof Guitar)
            System.out.println(o.message);
        throw new NoSubClassFoundError(
                "Please instantiate of class of type Guitar ");

    } 
}
