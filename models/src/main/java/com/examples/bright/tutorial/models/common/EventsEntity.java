package com.examples.bright.tutorial.models.common;

import com.examples.bright.tutorial.models.comic.ResultComicEntity;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Transient;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import com.examples.bright.tutorial.models.comic.DaoSession;
import com.examples.bright.tutorial.models.comic.ResultComicEntityDao;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by bright on 17/07/2017.
 */
@Entity
public class EventsEntity {

    @Id
    private Long id;
    private long resultComicEntityId;

    @ToOne(joinProperty = "resultComicEntityId")
    private ResultComicEntity resultComicEntity;

    @SerializedName("available")
    private int available;
    @SerializedName("collectionURI")
    private String collectionURI;
    @SerializedName("items")

    @Transient
    private List<Object> items = null;

    @SerializedName("returned")
    private int returned;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 838069905)
    private transient EventsEntityDao myDao;
    @Generated(hash = 1204788837)
    private transient Long resultComicEntity__resolvedKey;

    @Generated(hash = 1971568596)
    public EventsEntity(Long id, long resultComicEntityId, int available,
            String collectionURI, int returned) {
        this.id = id;
        this.resultComicEntityId = resultComicEntityId;
        this.available = available;
        this.collectionURI = collectionURI;
        this.returned = returned;
    }

    @Generated(hash = 2027995378)
    public EventsEntity() {
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

    public int getAvailable() {
        return this.available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getCollectionURI() {
        return this.collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public int getReturned() {
        return this.returned;
    }

    public void setReturned(int returned) {
        this.returned = returned;
    }

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
    @Generated(hash = 914908035)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getEventsEntityDao() : null;
    }

}
