package com.examples.bright.tutorial.models.common;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by bright on 18/07/2017.
 */
@Entity
public class CreatorEntity {

    @Id
    private Long id;
    private long creatorEntityId;

    @SerializedName("resourceURI")
    private String resourceURI;
    @SerializedName("name")
    private String name;
    @SerializedName("role")
    private String role;
    @Generated(hash = 2124600973)
    public CreatorEntity(Long id, long creatorEntityId, String resourceURI,
            String name, String role) {
        this.id = id;
        this.creatorEntityId = creatorEntityId;
        this.resourceURI = resourceURI;
        this.name = name;
        this.role = role;
    }
    @Generated(hash = 440494174)
    public CreatorEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getCreatorEntityId() {
        return this.creatorEntityId;
    }
    public void setCreatorEntityId(long creatorEntityId) {
        this.creatorEntityId = creatorEntityId;
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
    public String getRole() {
        return this.role;
    }
    public void setRole(String role) {
        this.role = role;
    }

}
