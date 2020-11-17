package org.ccsunnyfd.design.resourceFile;

import org.ccsunnyfd.design.visitor.IVisitor;

/**
 * PptFile
 *
 * @version 1.0
 */
public class PptFile extends AbstractResourceFile {
    public PptFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
