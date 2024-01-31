package com.interfaces;

public class Car implements Engine , Brake {
    @Override
    public void brake() {
        System.out.println("Car brake normally");
    }

    @Override
    public void start() {
        System.out.println("Car starts normally");

    }

    @Override
    public void stop() {
        System.out.println("Car stops normally");

    }

    @Override
    public void acc() {
        System.out.println("Car acc normally");

    }
}
