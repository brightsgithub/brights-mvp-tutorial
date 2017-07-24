package com.examples.bright.tutorial.models.gson;

import com.examples.bright.tutorial.models.common.DataEntity;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Our result set has the same container data i.e. DataEntity remains the same
 * Json structure. I use Generics here for the DataEntity.results, which I defined as:
 * 'List<T> results' within the DataEntity class. This is because the structure of results will be
 * different based on the type of data api that is requested. In my case I requested the API:
 *
 * http://gateway.marvel.com/v1/public/comics
 *
 * This means that the json result data set will be a comics based one. Calling a different api will
 * result in a different data structure of the returned results dataset within the json response.
 *
 * At this point, it only makes sense that I use generics for each of these different types of
 * 'result' data sets, that can appear from within the JSON response.
 *
 *
 *
 * Created by bright on 17/07/2017.
 */

public class ComicsDeserializer<T> implements JsonDeserializer<DataEntity<T>> {

    private final Class<T> clazz;
    private String mKey;

    public ComicsDeserializer(Class<T> clazz, String key) {
        this.clazz = clazz;
        mKey = key;
    }

    @Override
    public DataEntity<T> deserialize(JsonElement json, Type typeOfT,
                                     JsonDeserializationContext context) throws JsonParseException {
        final JsonObject dataEntity = json.getAsJsonObject();
        final int offset = dataEntity.getAsJsonPrimitive("offset").getAsInt();
        final int limit = dataEntity.getAsJsonPrimitive("limit").getAsInt();
        final int total = dataEntity.getAsJsonPrimitive("total").getAsInt();
        final int count = dataEntity.getAsJsonPrimitive("count").getAsInt();
        final JsonArray jsonArray = dataEntity.getAsJsonArray(mKey);
        final List<T> list = new ArrayList<>();
        for(JsonElement element : jsonArray) {
            JsonObject jsonObject = element.getAsJsonObject();
            list.add((T) context.deserialize(jsonObject, clazz));
        }
        return new DataEntity(offset, limit,total,count,list);
    }
}
