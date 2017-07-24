package com.examples.bright.tutorial.models.comic;

import com.examples.bright.tutorial.models.common.CharactersEntity;
import com.examples.bright.tutorial.models.common.CreatorsEntity;
import com.examples.bright.tutorial.models.common.DateEntity;
import com.examples.bright.tutorial.models.common.EventsEntity;
import com.examples.bright.tutorial.models.common.PriceEntity;
import com.examples.bright.tutorial.models.common.SeriesEntity;
import com.examples.bright.tutorial.models.common.StoriesEntity;
import com.examples.bright.tutorial.models.common.ThumbnailEntity;
import com.examples.bright.tutorial.models.common.UrlEntity;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by bright on 17/07/2017.
 */

public class ResultComicEntity {

    @SerializedName("id")
    private int id;
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
    
    private List<Object> textObjects = null;
    @SerializedName("resourceURI")
    
    private String resourceURI;
    @SerializedName("urls")
    
    private List<UrlEntity> urlEntities = null;
    @SerializedName("series")
    
    private SeriesEntity seriesEntity;
    @SerializedName("variants")
    
    private List<Object> variants = null;
    @SerializedName("collections")
    
    private List<Object> collections = null;
    @SerializedName("collectedIssues")
    
    private List<Object> collectedIssues = null;
    @SerializedName("dates")
    
    private List<DateEntity> dateEntities = null;
    @SerializedName("prices")
    
    private List<PriceEntity> priceEntities = null;
    @SerializedName("thumbnail")
    
    private ThumbnailEntity thumbnailEntity;
    @SerializedName("images")
    
    private List<Object> images = null;
    @SerializedName("creators")
    
    private CreatorsEntity creatorsEntity;
    @SerializedName("characters")
    
    private CharactersEntity charactersEntity;
    @SerializedName("stories")
    
    private StoriesEntity storiesEntity;
    @SerializedName("events")
    
    private EventsEntity eventsEntity;

    /**
     *
     * @param seriesEntity
     * @param issn
     * @param eventsEntity
     * @param id
     * @param title
     * @param dateEntities
     * @param description
     * @param isbn
     * @param variants
     * @param digitalId
     * @param collections
     * @param pageCount
     * @param textObjects
     * @param urlEntities
     * @param format
     * @param upc
     * @param modified
     * @param variantDescription
     * @param creatorsEntity
     * @param ean
     * @param issueNumber
     * @param storiesEntity
     * @param thumbnailEntity
     * @param resourceURI
     * @param images
     * @param collectedIssues
     * @param priceEntities
     * @param charactersEntity
     * @param diamondCode
     */
    public ResultComicEntity(int id, int digitalId, String title, int issueNumber, String variantDescription, String description, String modified, String isbn, String upc, String diamondCode, String ean, String issn, String format, int pageCount, List<Object> textObjects, String resourceURI, List<UrlEntity> urlEntities, SeriesEntity seriesEntity, List<Object> variants, List<Object> collections, List<Object> collectedIssues, List<DateEntity> dateEntities, List<PriceEntity> priceEntities, ThumbnailEntity thumbnailEntity, List<Object> images, CreatorsEntity creatorsEntity, CharactersEntity charactersEntity, StoriesEntity storiesEntity, EventsEntity eventsEntity) {
        super();
        this.id = id;
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
        this.textObjects = textObjects;
        this.resourceURI = resourceURI;
        this.urlEntities = urlEntities;
        this.seriesEntity = seriesEntity;
        this.variants = variants;
        this.collections = collections;
        this.collectedIssues = collectedIssues;
        this.dateEntities = dateEntities;
        this.priceEntities = priceEntities;
        this.thumbnailEntity = thumbnailEntity;
        this.images = images;
        this.creatorsEntity = creatorsEntity;
        this.charactersEntity = charactersEntity;
        this.storiesEntity = storiesEntity;
        this.eventsEntity = eventsEntity;
    }

    public int getId() {
        return id;
    }

    public int getDigitalId() {
        return digitalId;
    }

    public String getTitle() {
        return title;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getModified() {
        return modified;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getUpc() {
        return upc;
    }

    public String getDiamondCode() {
        return diamondCode;
    }

    public String getEan() {
        return ean;
    }

    public String getIssn() {
        return issn;
    }

    public String getFormat() {
        return format;
    }

    public int getPageCount() {
        return pageCount;
    }

    public List<Object> getTextObjects() {
        return textObjects;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public List<UrlEntity> getUrlEntities() {
        return urlEntities;
    }

    public SeriesEntity getSeriesEntity() {
        return seriesEntity;
    }

    public List<Object> getVariants() {
        return variants;
    }

    public List<Object> getCollections() {
        return collections;
    }

    public List<Object> getCollectedIssues() {
        return collectedIssues;
    }

    public List<DateEntity> getDateEntities() {
        return dateEntities;
    }

    public List<PriceEntity> getPriceEntities() {
        return priceEntities;
    }

    public ThumbnailEntity getThumbnailEntity() {
        return thumbnailEntity;
    }

    public List<Object> getImages() {
        return images;
    }

    public CreatorsEntity getCreatorsEntity() {
        return creatorsEntity;
    }

    public CharactersEntity getCharactersEntity() {
        return charactersEntity;
    }

    public StoriesEntity getStoriesEntity() {
        return storiesEntity;
    }

    public EventsEntity getEventsEntity() {
        return eventsEntity;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "id=" + id +
                ", digitalId=" + digitalId +
                ", title='" + title + '\'' +
                ", issueNumber=" + issueNumber +
                ", variantDescription='" + variantDescription + '\'' +
                ", description=" + description +
                ", modified='" + modified + '\'' +
                ", isbn='" + isbn + '\'' +
                ", upc='" + upc + '\'' +
                ", diamondCode='" + diamondCode + '\'' +
                ", ean='" + ean + '\'' +
                ", issn='" + issn + '\'' +
                ", format='" + format + '\'' +
                ", pageCount=" + pageCount +
                ", textObjects=" + textObjects +
                ", resourceURI='" + resourceURI + '\'' +
                ", urls=" + urlEntities +
                ", series=" + seriesEntity +
                ", variants=" + variants +
                ", collections=" + collections +
                ", collectedIssues=" + collectedIssues +
                ", dates=" + dateEntities +
                ", prices=" + priceEntities +
                ", thumbnail=" + thumbnailEntity +
                ", images=" + images +
                ", creators=" + creatorsEntity +
                ", characters=" + charactersEntity +
                ", stories=" + storiesEntity +
                ", events=" + eventsEntity +
                '}';
    }
}
