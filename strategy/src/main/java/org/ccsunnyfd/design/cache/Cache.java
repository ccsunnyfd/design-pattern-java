package org.ccsunnyfd.design.cache;

import org.ccsunnyfd.design.algorithm.IAlgorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Cache
 *
 * @version 1.0
 */
public class Cache {
    private Map<String, String> storage;
    private IAlgorithm algo;
    private int capacity;
    private int maxCapacity;

    public Cache(IAlgorithm algo, int capacity, int maxCapacity) {
        this.storage = new HashMap<>();
        this.algo = algo;
        this.capacity = capacity;
        this.maxCapacity = maxCapacity;
    }

    public void setAlgo(IAlgorithm algo) {
        this.algo = algo;
    }

    public String get(String key) {
        return this.storage.getOrDefault(key, null);
    }

    public void add(String key, String value) {
        if (this.capacity == this.maxCapacity) {
            this.evict();
        }
        this.capacity++;
        this.storage.put(key, value);
    }

    public void evict() {
        this.algo.evict(this);
        this.capacity--;
    }


}
