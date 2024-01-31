package com.oops.inheritance;

public class BoxWeight extends Box{

    double weight;

    public BoxWeight(int l, int b, int h, double weight) {
        super(l, b, h);
        this.weight = weight;
    }
}
