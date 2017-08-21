package com.examples.bright.tutorial.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by bright on 18/07/2017.
 */

public class UIPrice implements Parcelable{

    private double price;

    public UIPrice() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "UIPrice{" +
                "price=" + price +
                '}';
    }

    // Parcelable ##################################################################################
    @Override
    public int describeContents() {
        return 0;
    }

    protected UIPrice(final Parcel in) {
        this.price = in.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.price);
    }

    public static final Creator<UIPrice> CREATOR = new Creator<UIPrice>() {
        @Override
        public UIPrice createFromParcel(final Parcel source) {
            return new UIPrice(source);
        }

        @Override
        public UIPrice[] newArray(final int size) {
            return new UIPrice[size];
        }
    };
    // Parcelable  End #############################################################################
}
