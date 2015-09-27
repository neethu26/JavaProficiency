package SpecificInstruments;

import Instrument.Instrument;
import Exceptions.NoSubClassFoundError;

public class Flute extends Instrument {
   
    public Flute(){
        this.message = "toot toot toot ";
    }

    public void play(Instrument o) throws NoSubClassFoundError {
        if( o instanceof Flute )
            System.out.println(o.message);
        throw new NoSubClassFoundError(
                "Please instantiate of class of type Flute"
                );

    }

}
