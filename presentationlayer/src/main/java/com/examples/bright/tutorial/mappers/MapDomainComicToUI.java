package com.examples.bright.tutorial.mappers;

import com.examples.bright.tutorial.domainlayer.model.Authour;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.domainlayer.model.Price;
import com.examples.bright.tutorial.models.UIAuthour;
import com.examples.bright.tutorial.models.UIComic;
import com.examples.bright.tutorial.models.UIPrice;

import java.util.ArrayList;
import java.util.List;

public class MapDomainComicToUI {

    public static List<UIComic> transform(final List<Comic> comics) {

        final List<UIComic> uiComics = new ArrayList<>(comics.size());
        for(Comic comic: comics) {
            final UIComic uiComic = new UIComic();
            uiComic.setAuthours(getAuthours(comic));
            uiComic.setPrices(getPrices(comic));
            uiComic.setDescription(comic.getDescription());
            uiComic.setId(comic.getId());
            uiComic.setPageCount(comic.getPageCount());
            uiComic.setThumbnail(comic.getThumbnail());
            uiComic.setTitle(comic.getTitle());
            uiComics.add(uiComic);
        }

        return uiComics;
    }

    private static List<UIAuthour> getAuthours(Comic comic) {
        final List<UIAuthour> uiAuthours = new ArrayList<>(comic.getAuthours().size());
        for(Authour authour: comic.getAuthours()) {

            final UIAuthour uiAuthour = new UIAuthour();
            uiAuthour.setName(authour.getName());
            uiAuthour.setResourceURI(authour.getResourceURI());
            uiAuthour.setRole(authour.getRole());
            uiAuthours.add(uiAuthour);
        }
        return uiAuthours;

    }

    private static List<UIPrice> getPrices(Comic comic) {
        final List<UIPrice> uiPrices = new ArrayList<>(comic.getPrices().size());
        for(Price price: comic.getPrices()) {
            final UIPrice uiPrice = new UIPrice();
            uiPrice.setPrice(price.getPrice());
            uiPrices.add(uiPrice);
        }
        return uiPrices;

    }

}
