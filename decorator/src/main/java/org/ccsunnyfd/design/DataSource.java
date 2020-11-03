package org.ccsunnyfd.design;

import java.io.File;

/**
 * DataSource
 *
 * @version 1.0
 */
public interface DataSource {
    public void writeData(String data);
    public String readData();
}
