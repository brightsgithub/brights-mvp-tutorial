package com.examples.bright.tutorial.domainlayer.model;
import java.util.List;

/**
 * Created by bright on 17/07/2017.
 */

public class Comic {

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
}
