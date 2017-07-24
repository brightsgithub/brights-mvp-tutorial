package com.examples.bright.tutorial.models.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bright on 17/07/2017.
 */

public class UrlEntity {

    @SerializedName("type")
    private String type;
    @SerializedName("url")
    private String url;

    /**
     *
     * @param type
     * @param url
     */
    public UrlEntity(String type, String url) {
        super();
        this.type = type;
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Url{" +
                "type='" + type + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
