package org.ccsunnyfd.design.algorithm;

import org.ccsunnyfd.design.cache.Cache;

/**
 * IAlgorithm
 *
 * @version 1.0
 */
public interface IAlgorithm {
    void evict(Cache cache);
}
