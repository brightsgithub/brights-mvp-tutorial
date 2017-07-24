package com.examples.bright.tutorial.models.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bright on 18/07/2017.
 */

public class CreatorEntity {

    @SerializedName("resourceURI")
    private String resourceURI;
    @SerializedName("name")
    private String name;
    @SerializedName("role")
    private String role;

    public CreatorEntity(String resourceURI, String name, String role) {
        this.resourceURI = resourceURI;
        this.name = name;
        this.role = role;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "CreatorEntity{" +
                "resourceURI='" + resourceURI + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
