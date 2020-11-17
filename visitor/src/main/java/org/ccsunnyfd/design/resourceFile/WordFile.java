package org.ccsunnyfd.design.resourceFile;

import org.ccsunnyfd.design.visitor.IVisitor;

/**
 * WordFile
 *
 * @version 1.0
 */
public class WordFile extends AbstractResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
