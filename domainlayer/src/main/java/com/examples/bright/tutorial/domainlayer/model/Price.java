package com.examples.bright.tutorial.domainlayer.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by bright on 18/07/2017.
 */

public class Price implements Parcelable{

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

    // Parcelable ##################################################################################
    @Override
    public int describeContents() {
        return 0;
    }

    protected Price(final Parcel in) {
        this.price = in.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.price);
    }

    public static final Creator<Price> CREATOR = new Creator<Price>() {
        @Override
        public Price createFromParcel(final Parcel source) {
            return new Price(source);
        }

        @Override
        public Price[] newArray(final int size) {
            return new Price[size];
        }
    };
    // Parcelable  End #############################################################################
}
