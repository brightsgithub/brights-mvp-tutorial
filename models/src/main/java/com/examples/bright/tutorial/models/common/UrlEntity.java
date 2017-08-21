package com.examples.bright.tutorial.models.common;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by bright on 17/07/2017.
 */
@Entity
public class UrlEntity {

    @Id
    private Long id;
    private long resultComicEntityId;

    @SerializedName("type")
    private String type;
    @SerializedName("url")
    private String url;
    @Generated(hash = 1555041033)
    public UrlEntity(Long id, long resultComicEntityId, String type, String url) {
        this.id = id;
        this.resultComicEntityId = resultComicEntityId;
        this.type = type;
        this.url = url;
    }
    @Generated(hash = 1656133882)
    public UrlEntity() {
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
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}
