package com.examples.bright.tutorial;

import com.examples.bright.tutorial.domainlayer.model.Authour;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.domainlayer.model.Price;
import com.examples.bright.tutorial.models.UIAuthour;
import com.examples.bright.tutorial.models.UIComic;
import com.examples.bright.tutorial.models.UIPrice;

import java.util.ArrayList;
import java.util.List;

public class BaseComicTest {

    public static Comic createComic() {
        final Comic comic = new Comic();
        comic.setAuthours(getAuthours(1));
        comic.setPrices(getPrices(1));
        comic.setDescription("");
        comic.setId(1);
        comic.setPageCount(1);
        comic.setThumbnail("");
        comic.setTitle("");
        return comic;
    }

    public static List<Comic> createComics(int size) {

        final List<Comic> comics = new ArrayList<>(size);
        for(int i = 0; i <size; i++) {
            comics.add(createComic());
        }

        return comics;
    }

    private static List<Authour> getAuthours(int size) {
        final List<Authour> authours = new ArrayList<>(size);
        for(int i = 0; i <size; i++) {
            final Authour authour = new Authour();
            authour.setName("");
            authour.setResourceURI("");
            authour.setRole("");
            authours.add(authour);
        }
        return authours;

    }

    private static List<Price> getPrices(int size) {
        final List<Price> uiPrices = new ArrayList<>(size);
        for(int i = 0; i <size; i++) {
            final Price price = new Price();
            price.setPrice(100);
            uiPrices.add(price);
        }
        return uiPrices;
    }


    public static UIComic createUIComic() {
        final UIComic comic = new UIComic();
        comic.setAuthours(getUIAuthours(1));
        comic.setPrices(getUIPrices(1));
        comic.setDescription("");
        comic.setId(1);
        comic.setPageCount(1);
        comic.setThumbnail("");
        comic.setTitle("");
        return comic;
    }

    public static List<UIComic> createUIComics(int size) {

        final List<UIComic> comics = new ArrayList<>(size);
        for(int i = 0; i <size; i++) {
            comics.add(createUIComic());
        }

        return comics;
    }

    private static List<UIAuthour> getUIAuthours(int size) {
        final List<UIAuthour> authours = new ArrayList<>(size);
        for(int i = 0; i <size; i++) {
            final UIAuthour authour = new UIAuthour();
            authour.setName("");
            authour.setResourceURI("");
            authour.setRole("");
            authours.add(authour);
        }
        return authours;

    }

    private static List<UIPrice> getUIPrices(int size) {
        final List<UIPrice> uiPrices = new ArrayList<>(size);
        for(int i = 0; i <size; i++) {
            final UIPrice price = new UIPrice();
            price.setPrice(100);
            uiPrices.add(price);
        }
        return uiPrices;
    }
}
