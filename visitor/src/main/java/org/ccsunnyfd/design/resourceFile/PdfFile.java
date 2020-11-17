package org.ccsunnyfd.design.resourceFile;

import org.ccsunnyfd.design.visitor.IVisitor;

/**
 * PdfFile
 *
 * @version 1.0
 */
public class PdfFile extends AbstractResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
