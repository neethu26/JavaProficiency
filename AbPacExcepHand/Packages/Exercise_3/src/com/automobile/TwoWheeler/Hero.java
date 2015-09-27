package com.automobile.TwoWheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

    public Hero(String modelName ,String regNo ,
            String ownerName , int speed) {

        super(modelName,regNo,ownerName,speed);
    }

    public String getModelName(){
        return this.modelName;
    }

    public String getRegistrationNumber() {
        return this.regNo;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getSpeed() {
        return this.speed;
    }

}
