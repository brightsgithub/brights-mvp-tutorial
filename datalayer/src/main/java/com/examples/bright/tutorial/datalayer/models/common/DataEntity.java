package com.examples.bright.tutorial.datalayer.models.common;

/**
 * Created by bright on 17/07/2017.
 */

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

@Entity
public class DataEntity {

    @Id
    private Long id;
    private long marvelWrapperId;

    private long resultComicEntityId;

    @ToOne(joinProperty = "marvelWrapperId")
    private MarvelWrapper marvelWrapper;

    @SerializedName("offset")
    private int offset;
    @SerializedName("limit")
    private int limit;
    @SerializedName("total")
    private int total;
    @SerializedName("count")
    private int count;

    @SerializedName("results")
    @ToMany(referencedJoinProperty = "dataEntityId")
    private List<ResultComicEntity> results;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 2040973382)
    private transient DataEntityDao myDao;

    @Generated(hash = 738115493)
    public DataEntity(Long id, long marvelWrapperId, long resultComicEntityId,
            int offset, int limit, int total, int count) {
        this.id = id;
        this.marvelWrapperId = marvelWrapperId;
        this.resultComicEntityId = resultComicEntityId;
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.count = count;
    }

    @Generated(hash = 1892108943)
    public DataEntity() {
    }

    public void setResults(List<ResultComicEntity> results) {
        this.results = results;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getMarvelWrapperId() {
        return this.marvelWrapperId;
    }

    public void setMarvelWrapperId(long marvelWrapperId) {
        this.marvelWrapperId = marvelWrapperId;
    }

    public long getResultComicEntityId() {
        return this.resultComicEntityId;
    }

    public void setResultComicEntityId(long resultComicEntityId) {
        this.resultComicEntityId = resultComicEntityId;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return this.limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Generated(hash = 864807113)
    private transient Long marvelWrapper__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1036964390)
    public MarvelWrapper getMarvelWrapper() {
        long __key = this.marvelWrapperId;
        if (marvelWrapper__resolvedKey == null
                || !marvelWrapper__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            MarvelWrapperDao targetDao = daoSession.getMarvelWrapperDao();
            MarvelWrapper marvelWrapperNew = targetDao.load(__key);
            synchronized (this) {
                marvelWrapper = marvelWrapperNew;
                marvelWrapper__resolvedKey = __key;
            }
        }
        return marvelWrapper;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1337365600)
    public void setMarvelWrapper(@NotNull MarvelWrapper marvelWrapper) {
        if (marvelWrapper == null) {
            throw new DaoException(
                    "To-one property 'marvelWrapperId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.marvelWrapper = marvelWrapper;
            marvelWrapperId = marvelWrapper.getMarvelWrapperId();
            marvelWrapper__resolvedKey = marvelWrapperId;
        }
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 151630695)
    public List<ResultComicEntity> getResults() {
        if (results == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ResultComicEntityDao targetDao = daoSession.getResultComicEntityDao();
            List<ResultComicEntity> resultsNew = targetDao
                    ._queryDataEntity_Results(id);
            synchronized (this) {
                if (results == null) {
                    results = resultsNew;
                }
            }
        }
        return results;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 216007873)
    public synchronized void resetResults() {
        results = null;
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

    @Override
    public String toString() {
        return "DataEntity{" +
                "id=" + id +
                ", marvelWrapperId=" + marvelWrapperId +
                ", resultComicEntityId=" + resultComicEntityId +
                ", offset=" + offset +
                ", limit=" + limit +
                ", total=" + total +
                ", count=" + count +
                '}';
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 271437343)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getDataEntityDao() : null;
    }
}
