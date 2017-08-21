package com.examples.bright.tutorial.models.common;

import com.examples.bright.tutorial.models.comic.ResultComicEntity;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import com.examples.bright.tutorial.models.comic.ResultComicEntityDao;
import org.greenrobot.greendao.annotation.NotNull;
import com.examples.bright.tutorial.models.comic.DaoSession;

/**
 * Created by bright on 17/07/2017.
 */
@Entity
public class SeriesEntity {

    @Id
    private Long id;
    private long resultComicEntityId;

    @ToOne(joinProperty = "resultComicEntityId")
    private ResultComicEntity resultComicEntity;

    @SerializedName("resourceURI")
    private String resourceURI;
    @SerializedName("name")
    private String name;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 1556165133)
    private transient SeriesEntityDao myDao;
    @Generated(hash = 1023322948)
    public SeriesEntity(Long id, long resultComicEntityId, String resourceURI,
            String name) {
        this.id = id;
        this.resultComicEntityId = resultComicEntityId;
        this.resourceURI = resourceURI;
        this.name = name;
    }
    @Generated(hash = 685149110)
    public SeriesEntity() {
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
    @Generated(hash = 1204788837)
    private transient Long resultComicEntity__resolvedKey;
    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1772907100)
    public ResultComicEntity getResultComicEntity() {
        long __key = this.resultComicEntityId;
        if (resultComicEntity__resolvedKey == null
                || !resultComicEntity__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ResultComicEntityDao targetDao = daoSession.getResultComicEntityDao();
            ResultComicEntity resultComicEntityNew = targetDao.load(__key);
            synchronized (this) {
                resultComicEntity = resultComicEntityNew;
                resultComicEntity__resolvedKey = __key;
            }
        }
        return resultComicEntity;
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 198767948)
    public void setResultComicEntity(@NotNull ResultComicEntity resultComicEntity) {
        if (resultComicEntity == null) {
            throw new DaoException(
                    "To-one property 'resultComicEntityId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.resultComicEntity = resultComicEntity;
            resultComicEntityId = resultComicEntity.getResultComicEntityId();
            resultComicEntity__resolvedKey = resultComicEntityId;
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
    @Generated(hash = 1756743754)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getSeriesEntityDao() : null;
    }


}
