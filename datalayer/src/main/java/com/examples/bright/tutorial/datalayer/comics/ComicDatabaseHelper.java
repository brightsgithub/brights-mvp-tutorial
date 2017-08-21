package com.examples.bright.tutorial.datalayer.comics;


import android.util.Log;

import com.examples.bright.tutorial.models.comic.DaoSession;
import com.examples.bright.tutorial.models.comic.ResultComicEntity;
import com.examples.bright.tutorial.models.comic.ResultComicEntityDao;
import com.examples.bright.tutorial.models.common.CharactersEntity;
import com.examples.bright.tutorial.models.common.CharactersEntityDao;
import com.examples.bright.tutorial.models.common.CreatorEntity;
import com.examples.bright.tutorial.models.common.CreatorEntityDao;
import com.examples.bright.tutorial.models.common.CreatorsEntity;
import com.examples.bright.tutorial.models.common.CreatorsEntityDao;
import com.examples.bright.tutorial.models.common.DataEntity;

import com.examples.bright.tutorial.models.common.DataEntityDao;
import com.examples.bright.tutorial.models.common.DateEntity;
import com.examples.bright.tutorial.models.common.DateEntityDao;
import com.examples.bright.tutorial.models.common.EventsEntity;
import com.examples.bright.tutorial.models.common.EventsEntityDao;
import com.examples.bright.tutorial.models.common.ItemEntity;
import com.examples.bright.tutorial.models.common.ItemEntityDao;
import com.examples.bright.tutorial.models.common.MarvelWrapper;
import com.examples.bright.tutorial.models.common.MarvelWrapperDao;
import com.examples.bright.tutorial.models.common.PriceEntity;
import com.examples.bright.tutorial.models.common.PriceEntityDao;
import com.examples.bright.tutorial.models.common.SeriesEntity;
import com.examples.bright.tutorial.models.common.SeriesEntityDao;
import com.examples.bright.tutorial.models.common.StoriesEntity;
import com.examples.bright.tutorial.models.common.StoriesEntityDao;
import com.examples.bright.tutorial.models.common.ThumbnailEntity;
import com.examples.bright.tutorial.models.common.ThumbnailEntityDao;
import com.examples.bright.tutorial.models.common.UrlEntity;
import com.examples.bright.tutorial.models.common.UrlEntityDao;

import java.util.List;

/**
 * Created by bright on 19/08/2017.
 */

public class ComicDatabaseHelper {

    private DaoSession daoSession;

    public ComicDatabaseHelper(DaoSession daoSession) {
        this.daoSession = daoSession;
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

    public boolean isComicsInDB() {
        MarvelWrapperDao marvelWrapperDao = getDaoSession().getMarvelWrapperDao();

        if(marvelWrapperDao.queryBuilder().list().size() == 0) {
            Log.v("ComicRepository", "Database is currently empty!");
            return false;
        }
        return true;
    }

    /**
     * Save all or nothing, in order to avoid partial record entry. This whole operation is treated
     * as ONE transaction.
     * @param marvelWrapper
     * @return
     */
    public boolean saveComicsIntoDB(final MarvelWrapper marvelWrapper) {

        MarvelWrapperDao marvelWrapperDao = getDaoSession().getMarvelWrapperDao();
        try {
            marvelWrapperDao.getDatabase().beginTransaction(); // Start

            insertIntoMarvelWrapper(marvelWrapperDao, marvelWrapper);
            insertIntoDataEntity(marvelWrapper); // Need to do this
            insertResultsComicEntities(marvelWrapper.getDataEntity());

            marvelWrapperDao.getDatabase().setTransactionSuccessful(); // Successful
            return true;
        } catch (Exception e) {
            // something screwed up, just rollback
            e.printStackTrace();
            return false;
        }
        finally {
            marvelWrapperDao.getDatabase().endTransaction(); // End
        }
    }

    /**
     * Obtain the MarvelWrapper from the local DB
     * @return
     */
    public MarvelWrapper getMarvelWrapperfromDB() {
        MarvelWrapper marvelWrapper = getDaoSession().getMarvelWrapperDao().loadAll().get(0);
        return marvelWrapper;
    }

    private void insertIntoMarvelWrapper(final MarvelWrapperDao marvelWrapperDao,
                                         final MarvelWrapper marvelWrapper) {
        marvelWrapper.setDataEntity(marvelWrapper.getDataEntity());
        marvelWrapperDao.insert(marvelWrapper);
    }

    private void insertIntoDataEntity(final MarvelWrapper marvelWrapper) {
        DataEntityDao dataEntityDao = getDaoSession().getDataEntityDao();
        DataEntity dataEntity = marvelWrapper.getDataEntity();
        dataEntity.setMarvelWrapper(marvelWrapper);
        dataEntityDao.insert(dataEntity);
    }

    private void insertResultsComicEntities(final DataEntity dataEntity) {

        final List<ResultComicEntity> resultComicEntities = dataEntity.getResults();

        ResultComicEntityDao resultComicEntityDao = daoSession.getResultComicEntityDao();

        for(ResultComicEntity resultComicEntity: resultComicEntities) {

            resultComicEntity.setDataEntityId(dataEntity.getId());

            resultComicEntity.setThumbnailEntity(resultComicEntity.getThumbnailEntity());
            resultComicEntity.setSeriesEntity(resultComicEntity.getSeriesEntity());
            resultComicEntity.setCreatorsEntity(resultComicEntity.getCreatorsEntity());
            resultComicEntity.setCharactersEntity(resultComicEntity.getCharactersEntity());
            resultComicEntity.setStoriesEntity(resultComicEntity.getStoriesEntity());
            resultComicEntity.setEventsEntity(resultComicEntity.getEventsEntity());

            resultComicEntityDao.insert(resultComicEntity);

            insertIntoThumbnailEntity(resultComicEntity);
            insertIntoUrlEntities(resultComicEntity);
            insertIntoSeriesEntity(resultComicEntity);
            insertIntoDateEntity(resultComicEntity);
            insertIntoPriceEntity(resultComicEntity);
            insertIntoCreatorsEntity(resultComicEntity);
            insertIntoCreatorEntity(resultComicEntity);
            insertIntoCharactersEntity(resultComicEntity);
            insertIntoStoriesEntity(resultComicEntity);
            insertIntoStoryItemEntity(resultComicEntity);
            insertIntoEventsEntity(resultComicEntity);
        }
    }

    private void insertIntoUrlEntities(final ResultComicEntity resultComicEntity) {
        final List<UrlEntity> urlEntities = resultComicEntity.getUrlEntities();
        UrlEntityDao urlEntityDao = getDaoSession().getUrlEntityDao();

        for(UrlEntity urlEntity: urlEntities) {
            urlEntity.setResultComicEntityId(resultComicEntity.getResultComicEntityId());
            urlEntityDao.insert(urlEntity);
        }
    }

    private void insertIntoSeriesEntity(ResultComicEntity resultComicEntity) {
        SeriesEntityDao seriesEntityDao = getDaoSession().getSeriesEntityDao();
        SeriesEntity seriesEntity = resultComicEntity.getSeriesEntity();
        seriesEntity.setResultComicEntity(resultComicEntity);
        seriesEntityDao.insert(seriesEntity);
    }

    private void insertIntoDateEntity(ResultComicEntity resultComicEntity) {
        final List<DateEntity> dateEntities = resultComicEntity.getDateEntities();
        DateEntityDao dateEntityDao = getDaoSession().getDateEntityDao();

        for(DateEntity dateEntity: dateEntities) {
            dateEntity.setResultComicEntityId(resultComicEntity.getResultComicEntityId());
            dateEntityDao.insert(dateEntity);
        }
    }

    private void insertIntoPriceEntity(ResultComicEntity resultComicEntity) {
        final List<PriceEntity> priceEntities = resultComicEntity.getPriceEntities();
        PriceEntityDao priceEntityDao = getDaoSession().getPriceEntityDao();

        for(PriceEntity priceEntity: priceEntities) {
            priceEntity.setResultComicEntityId(resultComicEntity.getResultComicEntityId());
            priceEntityDao.insert(priceEntity);
        }
    }

    private void insertIntoThumbnailEntity(ResultComicEntity resultComicEntity) {
        ThumbnailEntityDao thumbnailEntityDao = getDaoSession().getThumbnailEntityDao();
        ThumbnailEntity thumbnailEntity = resultComicEntity.getThumbnailEntity();
        thumbnailEntity.setResultComicEntity(resultComicEntity);
        thumbnailEntityDao.insert(thumbnailEntity);
    }

    private void insertIntoCreatorsEntity(ResultComicEntity resultComicEntity) {
        CreatorsEntityDao creatorsEntityDao = getDaoSession().getCreatorsEntityDao();
        CreatorsEntity creatorsEntity = resultComicEntity.getCreatorsEntity();
        creatorsEntity.setResultComicEntity(resultComicEntity);
        creatorsEntityDao.insert(creatorsEntity);
    }

    private void insertIntoCreatorEntity(ResultComicEntity resultComicEntity) {

        CreatorEntityDao creatorEntityDao = getDaoSession().getCreatorEntityDao();
        List<CreatorEntity> creatorEntities = resultComicEntity.getCreatorsEntity().getItems();

        for(CreatorEntity creatorEntity: creatorEntities) {
            creatorEntity.setCreatorEntityId(resultComicEntity.getCreatorsEntity().getId());
            creatorEntityDao.insert(creatorEntity);
        }
    }

    private void insertIntoCharactersEntity(ResultComicEntity resultComicEntity) {
        CharactersEntityDao charactersEntityDao = getDaoSession().getCharactersEntityDao();
        CharactersEntity charactersEntity = resultComicEntity.getCharactersEntity();
        charactersEntity.setResultComicEntity(resultComicEntity);
        charactersEntityDao.insert(charactersEntity);
    }

    private void insertIntoStoriesEntity(ResultComicEntity resultComicEntity) {
        StoriesEntityDao storiesEntityDao = getDaoSession().getStoriesEntityDao();
        StoriesEntity storiesEntity = resultComicEntity.getStoriesEntity();
        storiesEntity.setResultComicEntity(resultComicEntity);
        storiesEntityDao.insert(storiesEntity);
    }

    private void insertIntoStoryItemEntity(ResultComicEntity resultComicEntity) {
        ItemEntityDao itemEntityDao = getDaoSession().getItemEntityDao();
        StoriesEntity storiesEntity = resultComicEntity.getStoriesEntity();

        List<ItemEntity> itemEntities = storiesEntity.getItemEntities();
        for(ItemEntity itemEntity: itemEntities) {
            itemEntity.setStoriesEntityId(storiesEntity.getId());
            itemEntityDao.insert(itemEntity);
        }
    }

    private void insertIntoEventsEntity(ResultComicEntity resultComicEntity) {
        EventsEntityDao eventsEntityDao = getDaoSession().getEventsEntityDao();
        EventsEntity eventsEntity = resultComicEntity.getEventsEntity();
        eventsEntity.setResultComicEntity(resultComicEntity);
        eventsEntityDao.insert(eventsEntity);
    }


    public void clearDB() {
        MarvelWrapperDao marvelWrapperDao = getDaoSession().getMarvelWrapperDao();
        ResultComicEntityDao resultComicEntityDao = getDaoSession().getResultComicEntityDao();
        UrlEntityDao urlEntityDao = getDaoSession().getUrlEntityDao();
        SeriesEntityDao seriesEntityDao = getDaoSession().getSeriesEntityDao();
        DateEntityDao dateEntityDao = getDaoSession().getDateEntityDao();
        PriceEntityDao priceEntityDao = getDaoSession().getPriceEntityDao();
        ThumbnailEntityDao thumbnailEntityDao = getDaoSession().getThumbnailEntityDao();
        CreatorsEntityDao creatorsEntityDao = getDaoSession().getCreatorsEntityDao();
        CreatorEntityDao creatorEntityDao = getDaoSession().getCreatorEntityDao();
        CharactersEntityDao charactersEntityDao = getDaoSession().getCharactersEntityDao();
        StoriesEntityDao storiesEntityDao = getDaoSession().getStoriesEntityDao();
        ItemEntityDao itemEntityDao = getDaoSession().getItemEntityDao();
        EventsEntityDao eventsEntityDao = getDaoSession().getEventsEntityDao();

        marvelWrapperDao.deleteAll();
        resultComicEntityDao.deleteAll();
        urlEntityDao.deleteAll();
        seriesEntityDao.deleteAll();
        dateEntityDao.deleteAll();
        priceEntityDao.deleteAll();
        thumbnailEntityDao.deleteAll();
        creatorsEntityDao.deleteAll();
        creatorEntityDao.deleteAll();
        charactersEntityDao.deleteAll();
        storiesEntityDao.deleteAll();
        itemEntityDao.deleteAll();
        eventsEntityDao.deleteAll();
    }
}
