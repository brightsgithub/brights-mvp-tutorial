package com.examples.bright.tutorial.mappers;

import com.examples.bright.tutorial.domainlayer.model.Authour;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.domainlayer.model.Price;
import com.examples.bright.tutorial.models.UIAuthour;
import com.examples.bright.tutorial.models.UIComic;
import com.examples.bright.tutorial.models.UIPrice;

import java.util.ArrayList;
import java.util.List;

public class MapUIComicToDomain {

    public static Comic transform(final UIComic uiComic) {

        if(uiComic == null) {
            return null;
        }

        final Comic comic = new Comic();
        comic.setAuthours(getAuthours(uiComic));
        comic.setPrices(getPrices(uiComic));
        comic.setDescription(uiComic.getDescription());
        comic.setId(uiComic.getId());
        comic.setPageCount(uiComic.getPageCount());
        comic.setThumbnail(uiComic.getThumbnail());
        comic.setTitle(uiComic.getTitle());
        return comic;
    }

    public static List<Comic> transform(final List<UIComic> uiComics) {

        final List<Comic> comics = new ArrayList<>(uiComics.size());
        for(UIComic uiComic: uiComics) {
            comics.add(transform(uiComic));
        }

        return comics;
    }

    private static List<Authour> getAuthours(UIComic uiComic) {
        final List<Authour> authours = new ArrayList<>(uiComic.getAuthours().size());
        for(UIAuthour uiAuthour: uiComic.getAuthours()) {
            final Authour authour = new Authour();
            authour.setName(uiAuthour.getName());
            authour.setResourceURI(uiAuthour.getResourceURI());
            authour.setRole(uiAuthour.getRole());
            authours.add(authour);
        }
        return authours;

    }

    private static List<Price> getPrices(UIComic uiComic) {
        final List<Price> uiPrices = new ArrayList<>(uiComic.getPrices().size());
        for(UIPrice uiPrice: uiComic.getPrices()) {
            final Price price = new Price();
            price.setPrice(uiPrice.getPrice());
            uiPrices.add(price);
        }
        return uiPrices;
    }
}
