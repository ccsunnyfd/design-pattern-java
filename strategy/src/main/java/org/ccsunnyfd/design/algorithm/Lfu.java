package org.ccsunnyfd.design.algorithm;

import org.ccsunnyfd.design.cache.Cache;

/**
 * Lfu
 *
 * @version 1.0
 */
public class Lfu implements IAlgorithm {
    @Override
    public void evict(Cache cache) {
        System.out.println("Evicting by lfu strategy");
    }
}
