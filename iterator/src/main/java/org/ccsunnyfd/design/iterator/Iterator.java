package org.ccsunnyfd.design.iterator;

/**
 * Iterator
 *
 * @version 1.0
 */
public interface Iterator<E> {
    boolean hasNext();
    void next();
    E currentItem();
}
