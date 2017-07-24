package com.examples.bright.tutorial.models.common;

/**
 * Created by bright on 17/07/2017.
 */

import com.google.gson.annotations.SerializedName;

public class MarvelWrapper {

    @SerializedName("code")
    private int code;
    @SerializedName("status")
    private String status;
    @SerializedName("copyright")
    private String copyright;
    @SerializedName("attributionText")
    private String attributionText;
    @SerializedName("attributionHTML")
    private String attributionHTML;
    @SerializedName("etag")
    private String etag;
    @SerializedName("data")
    private DataEntity dataEntity;

    /**
     *
     * @param attributionText
     * @param etag
     * @param status
     * @param dataEntity
     * @param copyright
     * @param code
     * @param attributionHTML
     */
    public MarvelWrapper(int code, String status, String copyright, String attributionText, String attributionHTML, String etag, DataEntity dataEntity) {
        super();
        this.code = code;
        this.status = status;
        this.copyright = copyright;
        this.attributionText = attributionText;
        this.attributionHTML = attributionHTML;
        this.etag = etag;
        this.dataEntity = dataEntity;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public String getEtag() {
        return etag;
    }

    public DataEntity getDataEntity() {
        return dataEntity;
    }

    @Override
    public String toString() {
        return "MarvelWrapper{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", copyright='" + copyright + '\'' +
                ", attributionText='" + attributionText + '\'' +
                ", attributionHTML='" + attributionHTML + '\'' +
                ", etag='" + etag + '\'' +
                ", data=" + dataEntity +
                '}';
    }
}
