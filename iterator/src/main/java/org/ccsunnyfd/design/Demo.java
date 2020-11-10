package org.ccsunnyfd.design;

import org.ccsunnyfd.design.collection.ArrayList;
import org.ccsunnyfd.design.iterator.Iterator;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("chen");
        names.add("xu");
        names.add("ding");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
