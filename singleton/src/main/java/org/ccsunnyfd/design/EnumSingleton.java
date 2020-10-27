package org.ccsunnyfd.design;

import java.util.concurrent.atomic.AtomicLong;

/**
 * EnumSingleton
 *
 * @version 1.0
 */
public enum EnumSingleton {
    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
