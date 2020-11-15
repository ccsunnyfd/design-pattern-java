package org.ccsunnyfd.design.algorithm;

import org.ccsunnyfd.design.cache.Cache;

/**
 * Lru
 *
 * @version 1.0
 */
public class Lru implements IAlgorithm {
    @Override
    public void evict(Cache cache) {
        System.out.println("Evicting by lru strategy");
    }
}
