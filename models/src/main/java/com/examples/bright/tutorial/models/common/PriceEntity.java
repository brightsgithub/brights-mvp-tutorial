package com.examples.bright.tutorial.models.common;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by bright on 17/07/2017.
 */
@Entity
public class PriceEntity {

    @Id
    private Long id;
    private long resultComicEntityId;

    @SerializedName("type")
    private String type;
    @SerializedName("price")
    private double price;
    @Generated(hash = 1936033259)
    public PriceEntity(Long id, long resultComicEntityId, String type,
            double price) {
        this.id = id;
        this.resultComicEntityId = resultComicEntityId;
        this.type = type;
        this.price = price;
    }
    @Generated(hash = 1519330722)
    public PriceEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getResultComicEntityId() {
        return this.resultComicEntityId;
    }
    public void setResultComicEntityId(long resultComicEntityId) {
        this.resultComicEntityId = resultComicEntityId;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
