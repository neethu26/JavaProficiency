package com.automobile;

public abstract class Vehicle {

    protected String modelName;
    protected String regNo;
    protected String ownerName;
    protected int speed;


    public Vehicle(String modelName,String regNo,
            String ownerName,int speed) {
        
        this.modelName = modelName;
        this.regNo = regNo;
        this.ownerName = ownerName;
        this.speed = speed;
    }


    abstract  public String getModelName();
    abstract  public String getRegistrationNumber();
    abstract  public String getOwnerName();
    abstract  public int getSpeed();

}
