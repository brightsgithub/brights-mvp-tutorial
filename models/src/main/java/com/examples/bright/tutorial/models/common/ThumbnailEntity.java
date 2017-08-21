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
public class ThumbnailEntity {

    @Id
    private Long id;
    private long resultComicEntityId;

    @ToOne(joinProperty = "resultComicEntityId")
    private ResultComicEntity resultComicEntity;

    @SerializedName("path")
    private String path;
    @SerializedName("extension")
    private String extension;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 799813964)
    private transient ThumbnailEntityDao myDao;
    @Generated(hash = 2060493871)
    public ThumbnailEntity(Long id, long resultComicEntityId, String path,
            String extension) {
        this.id = id;
        this.resultComicEntityId = resultComicEntityId;
        this.path = path;
        this.extension = extension;
    }
    @Generated(hash = 516632412)
    public ThumbnailEntity() {
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
    public String getPath() {
        return this.path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public String getExtension() {
        return this.extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
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
    @Generated(hash = 856809028)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getThumbnailEntityDao() : null;
    }


}
