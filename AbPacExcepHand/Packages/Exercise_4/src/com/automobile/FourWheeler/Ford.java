package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    private int switchTempControl = 0;

    public Ford(String modelName,String regNo,
            String ownerName,int speed) {
        super(modelName,regNo,ownerName,speed);

    }

    public String getModelName() {
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

    public int turntempControlOnorOff(int input) {
        return (this.switchTempControl = input);       
    }

}
