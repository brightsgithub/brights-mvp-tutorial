package com.examples.bright.tutorial.models.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bright on 17/07/2017.
 */

public class DateEntity {

    @SerializedName("type")
    private String type;
    @SerializedName("date")
    private String date;

    /**
     *
     * @param date
     * @param type
     */
    public DateEntity(String type, String date) {
        super();
        this.type = type;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Date{" +
                "type='" + type + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
