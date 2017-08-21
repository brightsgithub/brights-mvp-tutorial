package com.examples.bright.tutorial.domainlayer.model;

/**
 * Created by bright on 18/07/2017.
 */

public class Authour {

    private String resourceURI;
    private String name;
    private String role;

    public Authour() {

    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
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
