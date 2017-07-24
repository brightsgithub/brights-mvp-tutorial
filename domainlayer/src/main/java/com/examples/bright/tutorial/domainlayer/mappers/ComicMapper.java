package com.examples.bright.tutorial.domainlayer.mappers;

import com.examples.bright.tutorial.domainlayer.model.Authour;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.domainlayer.model.Price;
import com.examples.bright.tutorial.models.comic.ResultComicEntity;
import com.examples.bright.tutorial.models.common.CreatorEntity;
import com.examples.bright.tutorial.models.common.CreatorsEntity;
import com.examples.bright.tutorial.models.common.DataEntity;
import com.examples.bright.tutorial.models.common.MarvelWrapper;
import com.examples.bright.tutorial.models.common.PriceEntity;
import com.examples.bright.tutorial.models.common.ThumbnailEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bright on 17/07/2017.
 */

/**
 * We take what we need from the immutable Domain objects.
 * This simplified Comic, will be passed back up to the above layer
 */
public class ComicMapper {

    public static List<Comic> transformComics(MarvelWrapper marvelWrapper) {
        final DataEntity  dataEntity = marvelWrapper.getDataEntity();
        final List<ResultComicEntity> comicEntities = dataEntity.getResults();
        final List<Comic> comics = new ArrayList<>(comicEntities.size());

        for(ResultComicEntity resultComicEntity : comicEntities) {
            final Comic comic = new Comic();
            populateComicDetail(resultComicEntity, comic);
            populateThumbnail(resultComicEntity, comic);
            populatePrices(resultComicEntity, comic);
            populateAuthors(resultComicEntity, comic);
            comics.add(comic);
        }
        return comics;
    }

    private static void populateComicDetail(final ResultComicEntity resultComicEntity, final Comic comic) {
        comic.setId(resultComicEntity.getId());
        comic.setTitle(resultComicEntity.getTitle());
        comic.setDescription(resultComicEntity.getDescription());
        comic.setPageCount(resultComicEntity.getPageCount());
    }

    private static void populateThumbnail(final ResultComicEntity resultComicEntity, final Comic comic) {
        final ThumbnailEntity thumbnailEntity = resultComicEntity.getThumbnailEntity();
        comic.setThumbnail(thumbnailEntity.getPath() +"."+ thumbnailEntity.getExtension());
    }

    private static void populatePrices(final ResultComicEntity resultComicEntity, final Comic comic) {
        final List<PriceEntity> priceEntities = resultComicEntity.getPriceEntities();
        final List<Price> prices = new ArrayList<>(priceEntities.size());
        for(PriceEntity priceEntity: priceEntities) {
            final Price price = new Price();
            price.setPrice(priceEntity.getPrice());
            prices.add(price);
        }
        comic.setPrices(prices);
    }

    private static void populateAuthors(final ResultComicEntity resultComicEntity, final Comic comic) {
        final CreatorsEntity creatorsEntity = resultComicEntity.getCreatorsEntity();
        final List<CreatorEntity> creatorEntities = creatorsEntity.getItems();
        final List<Authour> authours = new ArrayList<>(creatorEntities.size());

        for(CreatorEntity creatorEntity: creatorEntities) {
            final Authour authour = new Authour();
            authour.setName(creatorEntity.getName());
            authour.setRole(creatorEntity.getRole());
            authours.add(authour);
        }
        comic.setAuthours(authours);
    }
}
