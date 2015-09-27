package com.automobile.FourWheeler;

import com.automobile.Vehicle;


public class Logon extends Vehicle {

    private int switchOnorOff = 1; // 1 means on and 0 means off

    public Logon(String modelName,String regNo,
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

    public int gps() {
        return this.switchOnorOff;
    }



}
