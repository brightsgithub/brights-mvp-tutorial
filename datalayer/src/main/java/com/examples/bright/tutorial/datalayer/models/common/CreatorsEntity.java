package com.examples.bright.tutorial.datalayer.models.common;


import com.examples.bright.tutorial.datalayer.models.comic.ResultComicEntity;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.List;
import com.examples.bright.tutorial.datalayer.models.comic.DaoSession;
import com.examples.bright.tutorial.datalayer.models.comic.ResultComicEntityDao;

/**
 * Created by bright on 17/07/2017.
 */
@Entity
public class CreatorsEntity {

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
    @ToMany(referencedJoinProperty = "creatorEntityId")
    private List<CreatorEntity> items;

    @SerializedName("returned")
    private int returned;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 706531955)
    private transient CreatorsEntityDao myDao;
    @Generated(hash = 1204788837)
    private transient Long resultComicEntity__resolvedKey;

    @Generated(hash = 1041784408)
    public CreatorsEntity(Long id, long resultComicEntityId, int available,
            String collectionURI, int returned) {
        this.id = id;
        this.resultComicEntityId = resultComicEntityId;
        this.available = available;
        this.collectionURI = collectionURI;
        this.returned = returned;
    }

    @Generated(hash = 1709828361)
    public CreatorsEntity() {
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

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 316678173)
    public List<CreatorEntity> getItems() {
        if (items == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CreatorEntityDao targetDao = daoSession.getCreatorEntityDao();
            List<CreatorEntity> itemsNew = targetDao._queryCreatorsEntity_Items(id);
            synchronized (this) {
                if (items == null) {
                    items = itemsNew;
                }
            }
        }
        return items;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 1727286264)
    public synchronized void resetItems() {
        items = null;
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

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1772907100)
    public ResultComicEntity getResultComicEntity() {
        long __key = this.resultComicEntityId;
        if (resultComicEntity__resolvedKey == null || !resultComicEntity__resolvedKey.equals(__key)) {
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

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1516623055)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getCreatorsEntityDao() : null;
    }

}
