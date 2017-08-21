package com.examples.bright.tutorial.models.common;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by bright on 17/07/2017.
 */
@Entity
public class DateEntity {

    @Id
    private Long id;
    private long resultComicEntityId;

    @SerializedName("type")
    private String type;
    @SerializedName("date")
    private String date;
    @Generated(hash = 1927582261)
    public DateEntity(Long id, long resultComicEntityId, String type, String date) {
        this.id = id;
        this.resultComicEntityId = resultComicEntityId;
        this.type = type;
        this.date = date;
    }
    @Generated(hash = 894995106)
    public DateEntity() {
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
    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }

}
