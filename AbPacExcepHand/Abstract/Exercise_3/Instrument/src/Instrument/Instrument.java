package Instrument;

import Exceptions.NoSubClassFoundError;

public abstract class Instrument {
    
    public String message;
    public abstract void play(Instrument o) throws NoSubClassFoundError;
}


