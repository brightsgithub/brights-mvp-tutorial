package com.examples.bright.tutorial.models.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bright on 17/07/2017.
 */

public class ThumbnailEntity {

    @SerializedName("path")
    private String path;
    @SerializedName("extension")
    private String extension;

    /**
     * No args constructor for use in serialization
     *
     */
    public ThumbnailEntity() {
    }

    /**
     *
     * @param extension
     * @param path
     */
    public ThumbnailEntity(String path, String extension) {
        super();
        this.path = path;
        this.extension = extension;
    }

    public String getPath() {
        return path;
    }

    public String getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return "Thumbnail{" +
                "path='" + path + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
