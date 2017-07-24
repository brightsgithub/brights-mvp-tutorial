package com.examples.bright.tutorial.models.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bright on 17/07/2017.
 */

public class PriceEntity {

    @SerializedName("type")
    private String type;
    @SerializedName("price")
    private int price;

    /**
     *
     * @param price
     * @param type
     */
    public PriceEntity(String type, int price) {
        super();
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
