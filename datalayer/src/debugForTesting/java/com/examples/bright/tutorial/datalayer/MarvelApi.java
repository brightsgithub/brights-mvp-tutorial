package com.examples.bright.tutorial.datalayer;

/**
 * Created by bright on 17/07/2017.
 */

public interface MarvelApi {

    // port 8080 seems to work across devices
    // I originally tried port 9999 and this is NOT work on my Pixel XL. stick with classic 8080
    String BASE_URL = "http://localhost:8080";
}
