package org.example;

public class Car {
    protected String color;

    private void privateDrive(){
        // engine
        // wheel
        // tires
        System.out.println("private drive");
    }

    public void publicDrive(String color){
        System.out.println("public drive");
    }

    protected void protectedDrive(){
        System.out.println("protected drive");
    }
}