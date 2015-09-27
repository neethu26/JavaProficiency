package com.automobile.Main;

import com.automobile.TwoWheeler.Hero;
import com.automobile.TwoWheeler.Honda;
import com.automobile.Vehicle;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Model Name in Hero");
        String vModel = input.next();

        System.out.println("Enter the OwnerName of Vehicle");
        String vName = input.next();

        System.out.println("Enter the Registration Number of Vehicle");
        String vNumber = input.next();

        System.out.println("Enter the Speed of the Vehicle");
        int vSpeed = input.nextInt();
        
        
        Vehicle hero  = new  Hero(
                vModel,
                vNumber,
                vName,
                vSpeed
                );

        System.out.println("Done for Hero!!!!");

        
        System.out.println("Enter the Model Name in Honda");
        vModel = input.next();

        System.out.println("Enter the OwnerName of Vehicle");
        vName = input.next();

        System.out.println("Enter the Registration Number of Vehicle");
        vNumber = input.next();

        System.out.println("Enter the Speed of the Vehicle");
        vSpeed = input.nextInt();
        
        
        Vehicle honda  = new  Honda(
                vModel,
                vNumber,
                vName,
                vSpeed
                );
       System.out.println("Done for Honda!!!"); 

    }

}


