package com.examples.bright.tutorial.models.common;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by bright on 17/07/2017.
 */

public class StoriesEntity {

    @SerializedName("available")

    private int available;
    @SerializedName("collectionURI")

    private String collectionURI;
    @SerializedName("items")

    private List<ItemEntity> itemEntities = null;
    @SerializedName("returned")

    private int returned;

    /**
     *
     * @param itemEntities
     * @param collectionURI
     * @param available
     * @param returned
     */
    public StoriesEntity(int available, String collectionURI, List<ItemEntity> itemEntities, int returned) {
        super();
        this.available = available;
        this.collectionURI = collectionURI;
        this.itemEntities = itemEntities;
        this.returned = returned;
    }

    public int getAvailable() {
        return available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public List<ItemEntity> getItemEntities() {
        return itemEntities;
    }

    public int getReturned() {
        return returned;
    }

    @Override
    public String toString() {
        return "Stories{" +
                "available=" + available +
                ", collectionURI='" + collectionURI + '\'' +
                ", items=" + itemEntities +
                ", returned=" + returned +
                '}';
    }
}
