package com.examples.bright.tutorial.models.common;

/**
 * Created by bright on 17/07/2017.
 */

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DataEntity<T> {

    @SerializedName("offset")
    private int offset;
    @SerializedName("limit")
    private int limit;
    @SerializedName("total")
    private int total;
    @SerializedName("count")
    private int count;
    @SerializedName("results")
    private List<T> results;


    /**
     *
     * @param total
     * @param limit
     * @param results
     * @param count
     * @param offset
     */
    public DataEntity(int offset, int limit, int total, int count, List<T> results) {
        super();
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.count = count;
        this.results = results;
    }

    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    public int getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public List<T> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "Data{" +
                "offset=" + offset +
                ", limit=" + limit +
                ", total=" + total +
                ", count=" + count +
                ", results=" + results +
                '}';
    }
}
