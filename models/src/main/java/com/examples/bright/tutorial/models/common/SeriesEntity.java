package com.examples.bright.tutorial.models.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bright on 17/07/2017.
 */

public class SeriesEntity {

    @SerializedName("resourceURI")
    private String resourceURI;
    @SerializedName("name")
    private String name;

    /**
     * No args constructor for use in serialization
     *
     */
    public SeriesEntity() {
    }

    /**
     *
     * @param resourceURI
     * @param name
     */
    public SeriesEntity(String resourceURI, String name) {
        super();
        this.resourceURI = resourceURI;
        this.name = name;
    }

}
