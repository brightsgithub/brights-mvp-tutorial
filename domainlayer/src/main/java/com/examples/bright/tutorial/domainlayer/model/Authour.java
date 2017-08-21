package com.examples.bright.tutorial.domainlayer.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by bright on 18/07/2017.
 */

public class Authour implements Parcelable {

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

    // Parcelable ##################################################################################
    @Override
    public int describeContents() {
        return 0;
    }

    protected Authour(final Parcel in) {
        this.resourceURI = in.readString();
        this.name = in.readString();
        this.role = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.resourceURI);
        dest.writeString(this.name);
        dest.writeString(this.role);
    }

    public static final Creator<Authour>
            CREATOR = new Creator<Authour>() {
        @Override
        public Authour createFromParcel(final Parcel source) {
            return new Authour(source);
        }

        @Override
        public Authour[] newArray(final int size) {
            return new Authour[size];
        }
    };
    // Parcelable  End #############################################################################

}
