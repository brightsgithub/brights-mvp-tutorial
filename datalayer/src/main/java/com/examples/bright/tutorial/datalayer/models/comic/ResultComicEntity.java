package com.examples.bright.tutorial.datalayer.models.comic;

import com.examples.bright.tutorial.datalayer.models.common.CharactersEntity;
import com.examples.bright.tutorial.datalayer.models.common.CreatorsEntity;
import com.examples.bright.tutorial.datalayer.models.common.DateEntity;
import com.examples.bright.tutorial.datalayer.models.common.EventsEntity;
import com.examples.bright.tutorial.datalayer.models.common.PriceEntity;
import com.examples.bright.tutorial.datalayer.models.common.SeriesEntity;
import com.examples.bright.tutorial.datalayer.models.common.StoriesEntity;
import com.examples.bright.tutorial.datalayer.models.common.ThumbnailEntity;
import com.examples.bright.tutorial.datalayer.models.common.UrlEntity;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Transient;

import java.util.List;
import com.examples.bright.tutorial.datalayer.models.common.PriceEntityDao;
import com.examples.bright.tutorial.datalayer.models.common.DateEntityDao;
import com.examples.bright.tutorial.datalayer.models.common.UrlEntityDao;
import com.examples.bright.tutorial.datalayer.models.common.EventsEntityDao;
import com.examples.bright.tutorial.datalayer.models.common.StoriesEntityDao;
import com.examples.bright.tutorial.datalayer.models.common.CharactersEntityDao;
import com.examples.bright.tutorial.datalayer.models.common.CreatorsEntityDao;
import com.examples.bright.tutorial.datalayer.models.common.ThumbnailEntityDao;
import com.examples.bright.tutorial.datalayer.models.common.SeriesEntityDao;

//import com.examples.bright.tutorial.models.common.DaoSession;

/**
 * Created by bright on 17/07/2017.
 */
@Entity
public class ResultComicEntity {

    @SerializedName("id")
    @Id
    private Long resultComicEntityId;

    private long dataEntityId;

    @SerializedName("digitalId")
    private int digitalId;

    @SerializedName("title")
    private String title;

    @SerializedName("issueNumber")
    private int issueNumber;

    @SerializedName("variantDescription")
    private String variantDescription;

    @SerializedName("description")
    private String description;

    @SerializedName("modified")
    private String modified;

    @SerializedName("isbn")
    private String isbn;

    @SerializedName("upc")
    private String upc;

    @SerializedName("diamondCode")
    private String diamondCode;

    @SerializedName("ean")
    private String ean;

    @SerializedName("issn")
    private String issn;

    @SerializedName("format")
    private String format;

    @SerializedName("pageCount")
    private int pageCount;

    @SerializedName("textObjects")
    @Transient
    private List<Object> textObjects = null;

    @SerializedName("resourceURI")
    private String resourceURI;

    @SerializedName("urls")
    @ToMany(referencedJoinProperty = "resultComicEntityId")
    private List<UrlEntity> urlEntities = null;

    @SerializedName("series")
    @ToOne(joinProperty = "resultComicEntityId")
    private SeriesEntity seriesEntity;

    @SerializedName("variants")
    @Transient
    private List<Object> variants = null;

    @SerializedName("collections")
    @Transient
    private List<Object> collections = null;

    @SerializedName("collectedIssues")
    @Transient
    private List<Object> collectedIssues = null;

    @SerializedName("dates")
    @ToMany(referencedJoinProperty = "resultComicEntityId")
    private List<DateEntity> dateEntities = null;

    @SerializedName("prices")
    @ToMany(referencedJoinProperty = "resultComicEntityId")
    private List<PriceEntity> priceEntities = null;

    @SerializedName("thumbnail")
    @ToOne(joinProperty = "resultComicEntityId")
    private ThumbnailEntity thumbnailEntity;

    @SerializedName("images")
    @Transient
    private List<Object> images = null;


    @SerializedName("creators")
    @ToOne(joinProperty = "resultComicEntityId")
    private CreatorsEntity creatorsEntity;

    @SerializedName("characters")
    @ToOne(joinProperty = "resultComicEntityId")
    private CharactersEntity charactersEntity;

    @SerializedName("stories")
    @ToOne(joinProperty = "resultComicEntityId")
    private StoriesEntity storiesEntity;

    @SerializedName("events")
    @ToOne(joinProperty = "resultComicEntityId")
    private EventsEntity eventsEntity;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 543801760)
    private transient ResultComicEntityDao myDao;

    @Generated(hash = 1289763138)
    public ResultComicEntity(Long resultComicEntityId, long dataEntityId,
                             int digitalId, String title, int issueNumber, String variantDescription,
                             String description, String modified, String isbn, String upc,
                             String diamondCode, String ean, String issn, String format,
                             int pageCount, String resourceURI) {
        this.resultComicEntityId = resultComicEntityId;
        this.dataEntityId = dataEntityId;
        this.digitalId = digitalId;
        this.title = title;
        this.issueNumber = issueNumber;
        this.variantDescription = variantDescription;
        this.description = description;
        this.modified = modified;
        this.isbn = isbn;
        this.upc = upc;
        this.diamondCode = diamondCode;
        this.ean = ean;
        this.issn = issn;
        this.format = format;
        this.pageCount = pageCount;
        this.resourceURI = resourceURI;
    }

    @Generated(hash = 1001883828)
    public ResultComicEntity() {
    }

    public Long getResultComicEntityId() {
        return this.resultComicEntityId;
    }

    public void setResultComicEntityId(Long resultComicEntityId) {
        this.resultComicEntityId = resultComicEntityId;
    }

    public long getDataEntityId() {
        return this.dataEntityId;
    }

    public void setDataEntityId(long dataEntityId) {
        this.dataEntityId = dataEntityId;
    }

    public int getDigitalId() {
        return this.digitalId;
    }

    public void setDigitalId(int digitalId) {
        this.digitalId = digitalId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getVariantDescription() {
        return this.variantDescription;
    }

    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModified() {
        return this.modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUpc() {
        return this.upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getDiamondCode() {
        return this.diamondCode;
    }

    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }

    public String getEan() {
        return this.ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getIssn() {
        return this.issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getResourceURI() {
        return this.resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    @Generated(hash = 1063366282)
    private transient Long seriesEntity__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1523215800)
    @Keep
    public SeriesEntity getSeriesEntity() {
        Long __key = this.resultComicEntityId;

        if(seriesEntity != null) {
            return seriesEntity;
        }

        if (seriesEntity__resolvedKey == null
                || !seriesEntity__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SeriesEntityDao targetDao = daoSession.getSeriesEntityDao();
            SeriesEntity seriesEntityNew = targetDao.load(__key);
            synchronized (this) {
                seriesEntity = seriesEntityNew;
                seriesEntity__resolvedKey = __key;
            }
        }
        return seriesEntity;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1901884436)
    public void setSeriesEntity(SeriesEntity seriesEntity) {
        synchronized (this) {
            this.seriesEntity = seriesEntity;
            resultComicEntityId = seriesEntity == null ? null
                    : seriesEntity.getId();
            seriesEntity__resolvedKey = resultComicEntityId;
        }
    }

    @Generated(hash = 685564845)
    private transient Long thumbnailEntity__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1174654562)
    @Keep
    public ThumbnailEntity getThumbnailEntity() {
        Long __key = this.resultComicEntityId;

        if(thumbnailEntity != null) {
            return thumbnailEntity;
        }

        if (thumbnailEntity__resolvedKey == null
                || !thumbnailEntity__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ThumbnailEntityDao targetDao = daoSession.getThumbnailEntityDao();
            ThumbnailEntity thumbnailEntityNew = targetDao.load(__key);
            synchronized (this) {
                thumbnailEntity = thumbnailEntityNew;
                thumbnailEntity__resolvedKey = __key;
            }
        }
        return thumbnailEntity;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1291194173)
    public void setThumbnailEntity(ThumbnailEntity thumbnailEntity) {
        synchronized (this) {
            this.thumbnailEntity = thumbnailEntity;
            resultComicEntityId = thumbnailEntity == null ? null
                    : thumbnailEntity.getId();
            thumbnailEntity__resolvedKey = resultComicEntityId;
        }
    }

    @Generated(hash = 1965075795)
    private transient Long creatorsEntity__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 2141749604)
    @Keep
    public CreatorsEntity getCreatorsEntity() {
        Long __key = this.resultComicEntityId;

        if(creatorsEntity != null) {
            return creatorsEntity;
        }

        if (creatorsEntity__resolvedKey == null
                || !creatorsEntity__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CreatorsEntityDao targetDao = daoSession.getCreatorsEntityDao();
            CreatorsEntity creatorsEntityNew = targetDao.load(__key);
            synchronized (this) {
                creatorsEntity = creatorsEntityNew;
                creatorsEntity__resolvedKey = __key;
            }
        }
        return creatorsEntity;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 626968503)
    public void setCreatorsEntity(CreatorsEntity creatorsEntity) {
        synchronized (this) {
            this.creatorsEntity = creatorsEntity;
            resultComicEntityId = creatorsEntity == null ? null
                    : creatorsEntity.getId();
            creatorsEntity__resolvedKey = resultComicEntityId;
        }
    }

    @Generated(hash = 1183996751)
    private transient Long charactersEntity__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1130570261)
    @Keep
    public CharactersEntity getCharactersEntity() {
        Long __key = this.resultComicEntityId;

        if(charactersEntity != null) {
            return charactersEntity;
        }

        if (charactersEntity__resolvedKey == null
                || !charactersEntity__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CharactersEntityDao targetDao = daoSession.getCharactersEntityDao();
            CharactersEntity charactersEntityNew = targetDao.load(__key);
            synchronized (this) {
                charactersEntity = charactersEntityNew;
                charactersEntity__resolvedKey = __key;
            }
        }
        return charactersEntity;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1306722044)
    public void setCharactersEntity(CharactersEntity charactersEntity) {
        synchronized (this) {
            this.charactersEntity = charactersEntity;
            resultComicEntityId = charactersEntity == null ? null
                    : charactersEntity.getId();
            charactersEntity__resolvedKey = resultComicEntityId;
        }
    }

    @Generated(hash = 21266644)
    private transient Long storiesEntity__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1606846532)
    @Keep
    public StoriesEntity getStoriesEntity() {
        Long __key = this.resultComicEntityId;

        if(storiesEntity != null) {
            return storiesEntity;
        }

        if (storiesEntity__resolvedKey == null
                || !storiesEntity__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            StoriesEntityDao targetDao = daoSession.getStoriesEntityDao();
            StoriesEntity storiesEntityNew = targetDao.load(__key);
            synchronized (this) {
                storiesEntity = storiesEntityNew;
                storiesEntity__resolvedKey = __key;
            }
        }
        return storiesEntity;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 196400853)
    public void setStoriesEntity(StoriesEntity storiesEntity) {
        synchronized (this) {
            this.storiesEntity = storiesEntity;
            resultComicEntityId = storiesEntity == null ? null
                    : storiesEntity.getId();
            storiesEntity__resolvedKey = resultComicEntityId;
        }
    }

    @Generated(hash = 1011308197)
    private transient Long eventsEntity__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 2046600981)
    @Keep
    public EventsEntity getEventsEntity() {
        Long __key = this.resultComicEntityId;

        if(eventsEntity != null) {
            return eventsEntity;
        }

        if (eventsEntity__resolvedKey == null
                || !eventsEntity__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            EventsEntityDao targetDao = daoSession.getEventsEntityDao();
            EventsEntity eventsEntityNew = targetDao.load(__key);
            synchronized (this) {
                eventsEntity = eventsEntityNew;
                eventsEntity__resolvedKey = __key;
            }
        }
        return eventsEntity;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 167648161)
    public void setEventsEntity(EventsEntity eventsEntity) {
        synchronized (this) {
            this.eventsEntity = eventsEntity;
            resultComicEntityId = eventsEntity == null ? null
                    : eventsEntity.getId();
            eventsEntity__resolvedKey = resultComicEntityId;
        }
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 546824898)
    public List<UrlEntity> getUrlEntities() {
        if (urlEntities == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UrlEntityDao targetDao = daoSession.getUrlEntityDao();
            List<UrlEntity> urlEntitiesNew = targetDao
                    ._queryResultComicEntity_UrlEntities(resultComicEntityId);
            synchronized (this) {
                if (urlEntities == null) {
                    urlEntities = urlEntitiesNew;
                }
            }
        }
        return urlEntities;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 653431490)
    public synchronized void resetUrlEntities() {
        urlEntities = null;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 140545727)
    public List<DateEntity> getDateEntities() {
        if (dateEntities == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            DateEntityDao targetDao = daoSession.getDateEntityDao();
            List<DateEntity> dateEntitiesNew = targetDao
                    ._queryResultComicEntity_DateEntities(resultComicEntityId);
            synchronized (this) {
                if (dateEntities == null) {
                    dateEntities = dateEntitiesNew;
                }
            }
        }
        return dateEntities;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 384114085)
    public synchronized void resetDateEntities() {
        dateEntities = null;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 300439637)
    public List<PriceEntity> getPriceEntities() {
        if (priceEntities == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PriceEntityDao targetDao = daoSession.getPriceEntityDao();
            List<PriceEntity> priceEntitiesNew = targetDao
                    ._queryResultComicEntity_PriceEntities(resultComicEntityId);
            synchronized (this) {
                if (priceEntities == null) {
                    priceEntities = priceEntitiesNew;
                }
            }
        }
        return priceEntities;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 1703589366)
    public synchronized void resetPriceEntities() {
        priceEntities = null;
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
    @Generated(hash = 983842188)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getResultComicEntityDao() : null;
    }


}
