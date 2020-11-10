package org.ccsunnyfd.design.collection;

import org.ccsunnyfd.design.iterator.ArrayIterator;
import org.ccsunnyfd.design.iterator.Iterator;

/**
 * ArrayList
 *
 * @version 1.0
 */
public class ArrayList<E> implements List<E> {
    private java.util.ArrayList<E> protoArrayList;

    public ArrayList() {
        protoArrayList = new java.util.ArrayList<>();
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(this);
    }

    @Override
    public void add(E e) {
        protoArrayList.add(e);
    }

    @Override
    public int size() {
        return protoArrayList.size();
    }

    @Override
    public E get(int index) {
        return protoArrayList.get(index);
    }
}
