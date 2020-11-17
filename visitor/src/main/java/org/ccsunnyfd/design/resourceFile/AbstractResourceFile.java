package org.ccsunnyfd.design.resourceFile;

import org.ccsunnyfd.design.visitor.IVisitor;

/**
 * AbstractResourceFile
 *
 * @version 1.0
 */
public abstract class AbstractResourceFile {
    protected String filePath;

    public AbstractResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract void accept(IVisitor visitor);
}
