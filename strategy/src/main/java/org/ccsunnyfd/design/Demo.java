package org.ccsunnyfd.design;

import org.ccsunnyfd.design.algorithm.IAlgorithm;
import org.ccsunnyfd.design.algorithmFactory.AlgorithmFactory;
import org.ccsunnyfd.design.cache.Cache;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        IAlgorithm algo = AlgorithmFactory.getAlgorithm("Unknown");
        Cache cache = new Cache(algo, 0, 2);

        cache.add("a", "1");
        cache.add("b", "2");
        cache.add("c", "3");

        algo = AlgorithmFactory.getAlgorithm("lfu");
        cache.setAlgo(algo);

        cache.add("d", "4");

        algo = AlgorithmFactory.getAlgorithm("fifo");
        cache.setAlgo(algo);

        cache.add("e", "5");
    }
}
