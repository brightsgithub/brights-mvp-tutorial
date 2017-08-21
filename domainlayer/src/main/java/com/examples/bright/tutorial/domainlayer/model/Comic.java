package com.examples.bright.tutorial.domainlayer.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bright on 17/07/2017.
 */

public class Comic implements Parcelable{

    private long id; // always handy
    private String title;
    private String description;
    private int pageCount;
    private String thumbnail;
    private List<Price> prices;
    private List<Authour> authours;

    public Comic() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public List<Authour> getAuthours() {
        return authours;
    }

    public void setAuthours(List<Authour> authours) {
        this.authours = authours;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", pageCount=" + pageCount +
                ", thumbnail='" + thumbnail + '\'' +
                ", prices=" + prices +
                ", authours=" + authours +
                '}';
    }


    // Parcelable ##################################################################################
    @Override
    public int describeContents() {
        return 0;
    }

    protected Comic(final Parcel in) {
        this.id = in.readLong();
        this.title = in.readString();
        this.description = in.readString();
        this.pageCount = in.readInt();
        this.thumbnail = in.readString();

        prices = new ArrayList<Price>();
        in.readList(prices, Price.class.getClassLoader());

        authours = new ArrayList<Authour>();
        in.readList(authours, Authour.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeInt(this.pageCount);
        dest.writeString(this.thumbnail);
        dest.writeList(prices);
        dest.writeList(authours);
    }

    public static final Creator<Comic>
            CREATOR = new Creator<Comic>() {
        @Override
        public Comic createFromParcel(final Parcel source) {
            return new Comic(source);
        }

        @Override
        public Comic[] newArray(final int size) {
            return new Comic[size];
        }
    };
    // Parcelable  End #############################################################################

}
