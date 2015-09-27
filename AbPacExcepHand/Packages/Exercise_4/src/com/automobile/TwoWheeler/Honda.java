package com.automobile.TwoWheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    
    public Honda(String modelName,String regNo,
            String ownerName,int speed) {
        super(modelName,regNo,ownerName,speed);
    }
    
    
    public String getModelName() {
        return this.modelName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getRegistrationNumber() {
        return this.regNo;
    }



}
