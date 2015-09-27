package Main;

import SpecificInstruments.Piano;
import SpecificInstruments.Guitar;
import SpecificInstruments.Flute;
import Instrument.Instrument;
import java.util.*;


public class Main {

    public static int randomGenerator(int min,int max) {
        return ((int)(Math.random() *((max - min ) + 1 )  ) + min);
    }


    public static void main(String[] args ){
        ArrayList<Instrument> differentInstrument = new ArrayList<Instrument>(10);
        try {
            for(int i = 0 ; i < 10 ; i++ ){
                    
                switch(Main.randomGenerator(0,2)) {
        
                    case 0 : differentInstrument.add(i,new Flute());
                             break;
                    case 1 : differentInstrument.add(i,new Guitar());
                             break;
                    case 2:  differentInstrument.add(i,new Piano());
                             break;
                }     
            }      
        }catch(Exception e) {
            System.out.println(e);
        }

    for(int i = 0 ; i < 10; i++) {
            if(differentInstrument.get(i) instanceof Piano)
                System.out.println("Piano says " + differentInstrument.get(i).message+ "\t at index is \t" + i);
            else if(differentInstrument.get(i) instanceof Guitar)
                System.out.println("Guitar says "+ differentInstrument.get(i).message+"\t at index is\t "+ i );
            else 
                System.out.println("Flute says " + differentInstrument.get(i).message+ "\t at index is \t" + i);

        }

    }
}


