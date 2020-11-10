package org.ccsunnyfd.design.collection;

import org.ccsunnyfd.design.iterator.Iterator;

/**
 * List
 *
 * @version 1.0
 */
public interface List<E> {
    Iterator<E> iterator();
    void add(E e);
    int size();
    E get(int index);
}
