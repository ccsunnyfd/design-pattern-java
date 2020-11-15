package org.ccsunnyfd.design.algorithm;

import org.ccsunnyfd.design.cache.Cache;

/**
 * Fifo
 *
 * @version 1.0
 */
public class Fifo implements IAlgorithm {
    @Override
    public void evict(Cache cache) {
        System.out.println("Evicting by fifo strategy");
    }
}
