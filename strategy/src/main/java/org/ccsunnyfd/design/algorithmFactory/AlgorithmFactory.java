package org.ccsunnyfd.design.algorithmFactory;

import org.ccsunnyfd.design.algorithm.Fifo;
import org.ccsunnyfd.design.algorithm.IAlgorithm;
import org.ccsunnyfd.design.algorithm.Lfu;
import org.ccsunnyfd.design.algorithm.Lru;

import java.util.HashMap;
import java.util.Map;

/**
 * AlgorithmFactory
 *
 * @version 1.0
 */
public class AlgorithmFactory {
    private static final Map<String, IAlgorithm> strategies = new HashMap<>();
    private static final IAlgorithm DEFAULT_STRATEGY = new Lru();

    static {
        strategies.put("lru", DEFAULT_STRATEGY);
        strategies.put("fifo", new Fifo());
        strategies.put("lfu", new Lfu());
    }

    public static IAlgorithm getAlgorithm(String type) {
        return strategies.getOrDefault(type, DEFAULT_STRATEGY);
    }
}
