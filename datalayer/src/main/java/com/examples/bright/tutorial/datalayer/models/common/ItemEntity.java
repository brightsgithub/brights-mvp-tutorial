package com.examples.bright.tutorial.datalayer.models.common;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by bright on 17/07/2017.
 */
@Entity
public class ItemEntity {

    @Id
    private Long id;
    private long storiesEntityId;

    @SerializedName("resourceURI")
    private String resourceURI;
    @SerializedName("name")
    private String name;
    @SerializedName("type")
    private String type;
    @Generated(hash = 725945580)
    public ItemEntity(Long id, long storiesEntityId, String resourceURI,
            String name, String type) {
        this.id = id;
        this.storiesEntityId = storiesEntityId;
        this.resourceURI = resourceURI;
        this.name = name;
        this.type = type;
    }
    @Generated(hash = 365170573)
    public ItemEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getStoriesEntityId() {
        return this.storiesEntityId;
    }
    public void setStoriesEntityId(long storiesEntityId) {
        this.storiesEntityId = storiesEntityId;
    }
    public String getResourceURI() {
        return this.resourceURI;
    }
    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }

}
