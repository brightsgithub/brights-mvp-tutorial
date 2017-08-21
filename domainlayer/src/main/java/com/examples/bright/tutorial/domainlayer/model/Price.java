package com.examples.bright.tutorial.domainlayer.model;

/**
 * Created by bright on 18/07/2017.
 */

public class Price {

    private double price;

    public Price() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price +
                '}';
    }
}
