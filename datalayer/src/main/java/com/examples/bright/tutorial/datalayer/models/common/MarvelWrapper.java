package com.examples.bright.tutorial.datalayer.models.common;

/**
 * Created by bright on 17/07/2017.
 */

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.ToOne;
import com.examples.bright.tutorial.datalayer.models.comic.DaoSession;

@Entity
public class MarvelWrapper {

    @Id()
    @SerializedName("id")
    private Long marvelWrapperId;

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
    @ToOne(joinProperty = "marvelWrapperId")
    private DataEntity dataEntity;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1005846709)
    private transient MarvelWrapperDao myDao;

    @Generated(hash = 2034199864)
    public MarvelWrapper(Long marvelWrapperId, int code, String status,
            String copyright, String attributionText, String attributionHTML,
            String etag) {
        this.marvelWrapperId = marvelWrapperId;
        this.code = code;
        this.status = status;
        this.copyright = copyright;
        this.attributionText = attributionText;
        this.attributionHTML = attributionHTML;
        this.etag = etag;
    }

    @Generated(hash = 1909224786)
    public MarvelWrapper() {
    }

    public Long getMarvelWrapperId() {
        return this.marvelWrapperId;
    }

    public void setMarvelWrapperId(Long marvelWrapperId) {
        this.marvelWrapperId = marvelWrapperId;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return this.copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getAttributionText() {
        return this.attributionText;
    }

    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }

    public String getAttributionHTML() {
        return this.attributionHTML;
    }

    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }

    public String getEtag() {
        return this.etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    @Generated(hash = 1434122906)
    private transient Long dataEntity__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1056444712)
    @Keep
    public DataEntity getDataEntity() {
        Long __key = this.marvelWrapperId;

        if(dataEntity != null) {
            return dataEntity;
        }

        if (dataEntity__resolvedKey == null
                || !dataEntity__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            DataEntityDao targetDao = daoSession.getDataEntityDao();
            DataEntity dataEntityNew = targetDao.load(__key);
            synchronized (this) {
                dataEntity = dataEntityNew;
                dataEntity__resolvedKey = __key;
            }
        }
        return dataEntity;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1672306742)
    public void setDataEntity(DataEntity dataEntity) {
        synchronized (this) {
            this.dataEntity = dataEntity;
            marvelWrapperId = dataEntity == null ? null : dataEntity.getId();
            dataEntity__resolvedKey = marvelWrapperId;
        }
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 318970921)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getMarvelWrapperDao() : null;
    }

    
}
